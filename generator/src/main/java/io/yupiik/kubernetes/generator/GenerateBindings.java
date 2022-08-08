package io.yupiik.kubernetes.generator;

import jakarta.json.Json;
import jakarta.json.JsonReaderFactory;
import org.apache.johnzon.jsonschema.generator.PojoGenerator;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.StreamSupport;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.joining;

public final class GenerateBindings {
    private final Logger logger = Logger.getLogger(getClass().getName());

    private final String url;
    private final String base;
    private final String groupId;
    private final String version;
    private final Path work;
    private final Path versionsBase;

    private GenerateBindings(final String... args) throws IOException {
        url = args[0];
        base = args[1];
        groupId = args[2];
        version = args[3];
        work = Files.createDirectories(Path.of(args[4]));
        versionsBase = Path.of(args[5]);
    }

    public void run() throws IOException, InterruptedException {
        final var unzip = work.resolve("unzip");
        final var schemas = (Files.isDirectory(unzip) ?
                // reuse existing one, avoids the long/slow download when working (this is why clean is important for updates)
                unzip :
                // not there, download a fresh copy and unzip
                unzip(download(url, work.resolve("source.zip")), unzip))
                .resolve(base);
        updateVersions(versionsBase.resolve("pom.xml"), generateBindings(schemas));
    }

    private String generate(final JsonReaderFactory readerFactory, final Path path) throws IOException {
        final var k8sApiVersion = path.getFileName().toString().substring(1);
        final var artifactId = "kubernetes-java-" + k8sApiVersion;
        final var root = Files.createDirectories(versionsBase.resolve(artifactId));
        Files.writeString(root.resolve("pom.xml"), "" +
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<project xmlns=\"http://maven.apache.org/POM/4.0.0\"\n" +
                "         xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
                "         xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd\">\n" +
                "  <parent>\n" +
                "    <groupId>" + groupId + "</groupId>\n" +
                "    <artifactId>versions</artifactId>\n" +
                "    <version>" + version + "</version>\n" +
                "  </parent>\n" +
                "  <modelVersion>4.0.0</modelVersion>\n" +
                "\n" +
                "  <artifactId>" + artifactId + "</artifactId>\n" +
                "  <name>Kubernetes Java Descriptors :: Versions :: " + k8sApiVersion + "</name>\n" +
                "</project>\n" +
                "\n");

        final var basePackage = "io.yupiik.kubernetes.bindings.v" + k8sApiVersion.replace('.', '_');
        Files.walkFileTree(path, new SimpleFileVisitor<>() {
            @Override
            public FileVisitResult visitFile(final Path schema, final BasicFileAttributes attrs) throws IOException {
                if (schema.getFileName().toString().endsWith(".jsonschema.json")) {
                    try (final var reader = readerFactory.createReader(Files.newBufferedReader(schema))) {
                        final var rel = StreamSupport.stream(path.relativize(schema.getParent()).spliterator(), false)
                                .map(it -> it.toString().replace('.', '_'))
                                .collect(joining("."));
                        final var bindings = new PojoGenerator(new PojoGenerator.PojoConfiguration()
                                .setClassName(schema.getFileName().toString().replace(".jsonschema.json", ""))
                                .setPackageName(basePackage + (rel.isEmpty() ? "" : "." + rel)))
                                .visitSchema(reader.readObject())
                                .generate();
                        logger.info(() -> "Generated #" + bindings.size() + " classes from '" + path.getParent().relativize(schema) + "'");
                        for (final var entry : bindings.entrySet()) {
                            final var out = root.resolve("src/main/java").resolve(entry.getKey());
                            Files.createDirectories(out.getParent());
                            Files.writeString(out, entry.getValue());
                        }
                    } catch (final RuntimeException re) {
                        throw new IllegalStateException("Can't generate binding for '" + schema + "'", re);
                    }
                }
                return super.visitFile(schema, attrs);
            }
        });

        return k8sApiVersion;
    }

    private void updateVersions(final Path desc, final List<String> versions) throws IOException {
        logger.info(() -> "Updating versions/pom.xml");
        final var pom = Files.readString(desc);

        final int from = pom.indexOf("<modules>");
        if (from <= 0) {
            throw new IllegalStateException("No <modules> found in " + desc);
        }

        final int to = pom.indexOf("</modules>", from);
        if (to <= 0) {
            throw new IllegalStateException("No </modules> found in " + desc);
        }

        Files.writeString(desc, pom.substring(0, from) +
                "<modules>" +
                versions.stream().map(it -> "    <module>kubernetes-java-" + it + "</module>\n").collect(joining("", "\n", "  ")) +
                pom.substring(to));
    }

    private List<String> generateBindings(final Path schemas) throws IOException {
        final var jsonReaderFactory = Json.createReaderFactory(Map.of());
        try (final var list = Files.list(schemas)) {
            return list
                    .filter(it -> it.getFileName().toString().startsWith("v") && Files.isDirectory(it))
                    .sorted(comparing(it -> it.getFileName().toString()))
                    .map(t -> {
                        try {
                            return generate(jsonReaderFactory, t);
                        } catch (final IOException e) {
                            throw new IllegalStateException(e);
                        }
                    })
                    .sorted((a, b) -> {
                        final String[] segments1 = a.split("\\.");
                        final String[] segments2 = b.split("\\.");
                        for (int i = 0; i < Math.min(segments1.length, segments2.length); i++) {
                            final var v1 = Integer.parseInt(segments1[i]);
                            final var v2 = Integer.parseInt(segments2[i]);
                            if (v1 < v2) {
                                return -1;
                            }
                            if (v1 > v2) {
                                return 1;
                            }
                        }
                        return a.compareTo(b);
                    })
                    .toList();
        }
    }

    private Path unzip(final Path source, final Path temp) throws IOException {
        logger.info(() -> "Unzipping '" + source + "' to '" + temp + "'");
        try (final var zip = new ZipInputStream(Files.newInputStream(source))) {
            ZipEntry entry;
            while ((entry = zip.getNextEntry()) != null) {
                if (entry.isDirectory()) {
                    continue;
                }
                final var name = entry.getName().substring(entry.getName().indexOf('/') + 1);
                final var target = temp.resolve(name);
                Files.createDirectories(target.getParent());
                Files.copy(zip, target, StandardCopyOption.REPLACE_EXISTING);
            }
        }
        return temp;
    }

    private Path download(final String url, final Path zip) throws IOException, InterruptedException {
        logger.info(() -> "Downloading '" + url + "' to '" + zip + "'");
        final var response = HttpClient.newBuilder()
                .followRedirects(HttpClient.Redirect.ALWAYS)
                .build()
                .send(
                        HttpRequest.newBuilder()
                                .GET()
                                .uri(URI.create(url))
                                .build(),
                        HttpResponse.BodyHandlers.ofFile(zip));

        logger.info(() -> "Response HTTP " + response.statusCode());
        if (response.statusCode() != 200) {
            throw new IllegalStateException(response.toString());
        }
        return response.body();
    }

    public static void main(final String... args) throws IOException, InterruptedException {
        new GenerateBindings(args).run();
    }
}
