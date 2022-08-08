package io.yupiik.kubernetes.generator;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonReaderFactory;
import jakarta.json.JsonString;
import jakarta.json.JsonValue;
import org.apache.johnzon.jsonschema.generator.PojoGenerator;

import java.io.IOException;
import java.io.StringReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.logging.Logger;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import static java.net.http.HttpResponse.BodyHandlers.ofString;
import static java.util.Comparator.comparing;
import static java.util.Objects.requireNonNull;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toMap;

public final class GenerateBindings {
    private final Logger logger = Logger.getLogger(getClass().getName());

    private final String url;
    private final String base;
    private final String groupId;
    private final String version;
    private final Path work;
    private final Path versionsBase;
    private final String schemaExtension;
    private final int threads;

    private GenerateBindings(final String... args) throws IOException {
        url = args[0];
        base = args[1];
        groupId = args[2];
        version = args[3];
        work = Files.createDirectories(Path.of(args[4]));
        versionsBase = Path.of(args[5]);
        schemaExtension = args[6];
        threads = Integer.parseInt(args[7]);
    }

    public void run() throws IOException, InterruptedException {
        final var httpClient = HttpClient.newBuilder().followRedirects(HttpClient.Redirect.ALWAYS).build();
        final var unzip = work.resolve("unzip");
        final var schemas = (Files.isDirectory(unzip) ?
                // reuse existing one, avoids the long/slow download when working (this is why clean is important for updates)
                unzip :
                // not there, download a fresh copy and unzip
                unzip(download(httpClient, url, work.resolve("source.zip")), unzip))
                .resolve(base);
        updateVersions(
                versionsBase.resolve("pom.xml"),
                generateBindings(schemas, httpClient));
    }

    private String generate(final JsonReaderFactory readerFactory, final Path path, final HttpClient client) throws IOException {
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

        final var swaggerUrl = "https://raw.githubusercontent.com/kubernetes/kubernetes/v" + k8sApiVersion + "/api/openapi-spec/swagger.json";
        final var cache = work.resolve("cache/swagger/" + k8sApiVersion + ".json");
        final var definitions = new Supplier<JsonObject>() {
            private JsonObject value;

            @Override
            public JsonObject get() {
                if (value == null) {
                    value = loadSchema(cache, readerFactory, client, swaggerUrl);
                }
                return value;
            }
        };

        final var basePackage = "io.yupiik.kubernetes.bindings.v" + k8sApiVersion.replace('.', '_');
        // todo: serializable (json/yaml)?
        writeJava(root, basePackage, "Validable", "package " + basePackage + ";\n" +
                "\n" +
                "public interface Validable<T> {\n" +
                "    T validate();\n" +
                "}\n" +
                "\n");
        writeJava(root, basePackage, "ValidationException", "package " + basePackage + ";\n" +
                "\n" +
                "import java.util.List;\n" +
                "\n" +
                "import static java.util.stream.Collectors.joining;\n" +
                "\n" +
                "public class ValidationException extends RuntimeException {\n" +
                "    private List<ValidationError> errors;\n" +
                "\n" +
                "    public ValidationException(final List<ValidationError> errors) {\n" +
                "        super(errors.stream().map(ValidationError::getMessage).collect(joining(\", \")));\n" +
                "        this.errors = errors;\n" +
                "    }\n" +
                "\n" +
                "    public List<ValidationError> getErrors() {\n" +
                "        return errors;\n" +
                "    }\n" +
                "\n" +
                "    public static class ValidationError {\n" +
                "        private final String javaName;\n" +
                "        private final String jsonName;\n" +
                "        private final String message;\n" +
                "        private final boolean required;\n" +
                "\n" +
                "        public ValidationError(final String java, final String json, final String message, final boolean required) {\n" +
                "            this.javaName = java;\n" +
                "            this.jsonName = json;\n" +
                "            this.message = message;\n" +
                "            this.required = required;\n" +
                "        }\n" +
                "\n" +
                "        public boolean isRequired() {\n" +
                "            return required;\n" +
                "        }\n" +
                "\n" +
                "        public String getJavaName() {\n" +
                "            return javaName;\n" +
                "        }\n" +
                "\n" +
                "        public String getJsonName() {\n" +
                "            return jsonName;\n" +
                "        }\n" +
                "\n" +
                "        public String getMessage() {\n" +
                "            return message;\n" +
                "        }\n" +
                "    }\n" +
                "}\n" +
                "\n");

        final var refRegistry = new HashMap<String, String>();
        Files.walkFileTree(path, new SimpleFileVisitor<>() {
            @Override
            public FileVisitResult visitFile(final Path schema, final BasicFileAttributes attrs) throws IOException {
                final var name = schema.getFileName().toString();
                if (!name.endsWith(schemaExtension)) {
                    return super.visitFile(schema, attrs);
                }

                onSchema(schema, name, readerFactory, path, basePackage, definitions, refRegistry, root);
                return super.visitFile(schema, attrs);
            }
        });

        return k8sApiVersion;
    }

    private void writeJava(final Path root, final String basePackage, final String clazz, final String content) throws IOException {
        final var path = root.resolve("src/main/java").resolve(basePackage.replace('.', '/') + '/' + clazz + ".java");
        Files.createDirectories(path.getParent());
        Files.writeString(path, content);
    }

    private void onSchema(final Path schema, final String name,
                          final JsonReaderFactory readerFactory, final Path path,
                          final String basePackage, final Supplier<JsonObject> definitions,
                          final Map<String, String> refRegistry, final Path root) throws IOException {
        try {
            final JsonObject readSchema;
            try (final var reader = readerFactory.createReader(Files.newBufferedReader(schema))) {
                readSchema = reader.readObject();
            }

            final var rel = StreamSupport.stream(path.relativize(schema.getParent()).spliterator(), false)
                    .map(it -> it.toString().replace('.', '_'))
                    .collect(joining("."));

            final var packageName = basePackage + (rel.isEmpty() ? "" : "." + rel);
            final var pojoConfiguration = new PojoGenerator.PojoConfiguration()
                    .setClassName(name.substring(0, name.length() - schemaExtension.length()))
                    .setPackageName(packageName)
                    .setOnRef(ref -> onRef(definitions, packageName, ref, refRegistry, basePackage));

            final var bindings = new K8sPojoGenerator(pojoConfiguration, readSchema, basePackage)
                    .visitSchema(readSchema)
                    .generate();
            refRegistry.putAll(bindings);

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

    private JsonObject loadSchema(final Path cache, final JsonReaderFactory readerFactory,
                                  final HttpClient client, final String swaggerUrl) {
        if (Files.exists(cache)) {
            logger.info(() -> "Using cached swagger.json: '@work/" + work.relativize(cache) + "'");

            try (final var reader = readerFactory.createReader(Files.newBufferedReader(cache, StandardCharsets.UTF_8))) {
                return reader.readObject().getJsonObject("definitions");
            } catch (final IOException e) {
                throw new IllegalStateException(e);
            }
        } else {
            final var thread = Thread.currentThread();
            final var oldName = thread.getName();
            thread.setName(oldName + "[" + swaggerUrl + "]");
            try {
                final var uri = URI.create(swaggerUrl);

                logger.info(() -> "Fetching '@" + uri.getPath().substring(1) + "' (for '#/definitions/*')");
                final var out = client.send(
                        HttpRequest.newBuilder()
                                .GET()
                                .uri(uri)
                                .build(),
                        ofString());
                if (out.statusCode() != 200) {
                    throw new IllegalStateException("Invalid response: " + out);
                }

                Files.writeString(cache, out.body());
                logger.info(() -> "Cached swagger.json: '@work/" + work.relativize(cache) + "'");

                try (final var reader = readerFactory.createReader(new StringReader(out.body()))) {
                    return reader.readObject().getJsonObject("definitions");
                }
            } catch (final IOException e) {
                throw new IllegalStateException(e);
            } catch (final InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            } finally {
                thread.setName(oldName);
            }
        }
    }

    private String onRef(final Supplier<JsonObject> definitions, final String packageName, final PojoGenerator.Ref ref,
                         final Map<String, String> previousRefs, final String basePackage) {
        final var refName = ref.getRef().substring(ref.getRef().lastIndexOf('/') + 1);

        // check for JSONSchemaProps mainly
        // note: better would be a stack but sufficient
        if (refName.substring(refName.lastIndexOf('.') + 1).equals(ref.getEnclosingClass())) {
            return ref.getEnclosingClass();
        }

        final var selected = definitions.get().entrySet().stream()
                .filter(it -> Objects.equals(it.getKey(), refName))
                .toList();
        try {
            return switch (selected.size()) {
                case 0 -> throw new IllegalArgumentException(
                        "No schema '" + refName + "' found in " + definitions.get().keySet());
                case 1 -> {
                    final var refClassName = ref.getRef().substring(ref.getRef().lastIndexOf('.') + 1);
                    final var schema = selected.get(0).getValue().asJsonObject();

                    yield switch (getType(schema, ref)) {
                        case "null" -> JsonValue.class.getSimpleName();
                        case "string" -> {
                            final var formatValue = schema.get("date-time");
                            if (formatValue instanceof JsonString s) {
                                yield switch (s.getString()) {
                                    case "duration" -> {
                                        ref.getImports().add(Duration.class.getName());
                                        yield Duration.class.getSimpleName();
                                    }
                                    case "date" -> {
                                        ref.getImports().add(LocalDate.class.getName());
                                        yield LocalDate.class.getSimpleName();
                                    }
                                    case "dateTime", "date-time" -> {
                                        ref.getImports().add(OffsetDateTime.class.getName());
                                        yield OffsetDateTime.class.getSimpleName();
                                    }
                                    case "time" -> {
                                        ref.getImports().add(LocalTime.class.getName());
                                        yield LocalTime.class.getSimpleName();
                                    }
                                    default -> "String";
                                };
                            }
                            yield "String";
                        }
                        case "object" -> {
                            final var nested = ref.getNested();
                            if (schema.containsKey("properties")) {
                                if (!previousRefs.containsKey(refClassName) && !nested.containsKey(refClassName)) {
                                    nested.putAll(new K8sPojoGenerator(
                                            new PojoGenerator.PojoConfiguration()
                                                    .setClassName(refClassName)
                                                    .setPackageName(packageName)
                                                    .setOnRef(r -> onRef(definitions, packageName, r, previousRefs, basePackage)),
                                            schema, basePackage)
                                            .visitSchema(schema)
                                            .generate());
                                }
                                yield refClassName;
                            }

                            ref.getImports().add(JsonObject.class.getName());
                            yield JsonObject.class.getSimpleName();
                        }
                        default -> throw new IllegalArgumentException("Unknown schema '" + refName + "'");
                    };
                }
                default -> throw new IllegalArgumentException(
                        "Ambiguous schema '" + refName + "', matching: " + selected);
            };
        } catch (final StackOverflowError error) {
            logger.severe(() -> "Stackoverflow happent generating '" + refName + "' (package=" + packageName + ")");
            throw error;
        }
    }

    private String getType(final JsonObject schema, final PojoGenerator.Ref ref) {
        final String type;

        final var value = schema.get("type");
        if (value == null) {
            if (schema.containsKey("properties") || schema.containsKey("additionalProperties")) {
                type = "object";
            } else if (schema.containsKey("items")) {
                type = "array";
            } else {
                ref.getImports().add(JsonValue.class.getName());
                return "null";
            }
        } else if (value instanceof JsonString s) {
            type = s.getString();
        } else {
            throw new IllegalStateException("Invalid type: " + value);
        }

        final var formatValue = schema.get("date-time");
        if (formatValue instanceof JsonString s) {
            return s.getString();
        }

        return type;
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

    private List<String> generateBindings(final Path schemas, final HttpClient client) throws IOException {
        final var jsonReaderFactory = Json.createReaderFactory(Map.of());
        final var nThreads = threads > 0 ? threads : Math.max(1, Runtime.getRuntime().availableProcessors());
        logger.info(() -> "Using " + nThreads + " threads");

        Files.createDirectories(work.resolve("cache/swagger"));

        final var pool = Executors.newFixedThreadPool(nThreads);
        final var error = new IllegalStateException();
        final List<Future<String>> futures;
        try (final var list = Files.list(schemas)) {
            futures = list
                    .filter(it -> {
                        final var name = it.getFileName().toString();
                        return name.startsWith("v") && Files.isDirectory(it) && // it is a version folder
                                !name.contains("-") && // ignore dev/beta/alpha versions
                                // no openapi in these versions so skip
                                !name.startsWith("v0.") &&
                                !name.startsWith("v1.0.") &&
                                !name.startsWith("v1.1.") &&
                                !name.startsWith("v1.2.") &&
                                !name.startsWith("v1.3.") &&
                                !name.startsWith("v1.4.");
                    })
                    .sorted(comparing(it -> it.getFileName().toString()))
                    .map(t -> pool.submit(() -> {
                        try {
                            return generate(jsonReaderFactory, t, client);
                        } catch (final IOException e) {
                            synchronized (error) {
                                error.addSuppressed(error);
                            }
                            throw new IllegalStateException(e);
                        }
                    }))
                    .toList();
        } finally {
            pool.shutdown();
        }

        final var versions = new ArrayList<String>();

        try {
            for (final var future : futures) {
                versions.add(future.get());
            }

            if (!pool.awaitTermination(1, TimeUnit.MINUTES)) {
                logger.warning(() -> "Didn't stop in 1mn whereas all tasks were done");
            }
        } catch (final InterruptedException e) {
            Thread.currentThread().interrupt();
        } catch (final ExecutionException ee) {
            throw new IllegalStateException(ee);
        }

        if (error.getSuppressed().length > 0) {
            throw new IllegalStateException(Stream.of(error.getSuppressed())
                    .map(Throwable::getMessage)
                    .collect(joining("\n- ", "\n- ", "")));
        }

        versions.sort((a, b) -> {
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
        });
        return versions;
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

    private Path download(final HttpClient client, final String url, final Path zip) throws IOException, InterruptedException {
        logger.info(() -> "Downloading '" + url + "' to '" + zip + "'");
        final var response = client
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

    private static class K8sPojoGenerator extends PojoGenerator {
        private final JsonObject schema;
        private final String clazz;
        private final String basePackage;

        private K8sPojoGenerator(final PojoGenerator.PojoConfiguration conf, final JsonObject schema,
                                 final String basePackage) {
            super(conf);
            this.clazz = conf.getClassName();
            this.basePackage = basePackage;
            this.schema = schema;
        }

        @Override
        public Map<String, String> generate() {
            // for afterClassName() and beforeClassEnd()
            imports.add(basePackage + ".Validable");
            if (!attributes.isEmpty()) {
                imports.add(basePackage + ".ValidationException");
                imports.add(List.class.getName());
                imports.add(ArrayList.class.getName());
            }
            return super.generate();
        }

        @Override
        protected PojoGenerator newSubPojoGenerator(final PojoConfiguration pojoConfiguration, final JsonObject schema) {
            return new K8sPojoGenerator(pojoConfiguration, schema, basePackage);
        }

        @Override
        protected String afterClassName() {
            return " implements Validable<" + clazz + ">";
        }

        @Override
        protected String beforeClassEnd() {
            return attributes.isEmpty() ? "" : "\n" + generateFluentSetter() + "\n" + generateValidator();
        }

        private String generateValidator() {
            final var start = "    @Override\n" +
                    "    public " + clazz + " validate() {\n";
            final var end = "        return this;\n    }\n";

            final var requiredValue = schema.get("required");
            if (requiredValue == null || requiredValue.getValueType() != JsonValue.ValueType.ARRAY) {
                return start + end;
            }

            final var attributeIndex = attributes.stream()
                    .collect(toMap(Attribute::getJsonName, identity()));

            final var requiredWhichCanBeNull = requiredValue.asJsonArray().stream()
                    .map(JsonString.class::cast)
                    .map(JsonString::getString)
                    .filter(it -> Character.isUpperCase(attributeIndex.get(it).getType().charAt(0))) // is not a primitive
                    .sorted()
                    .toList();
            if (requiredWhichCanBeNull.isEmpty()) {
                return start + end;
            }

            return start +
                    "        List<ValidationException.ValidationError> __errors_jsonSchema = null;\n" +
                    requiredWhichCanBeNull.stream()
                            .map(it -> {
                                final var attribute = attributeIndex.get(it);
                                final var javaName = attribute.getJavaName();
                                return "" +
                                        "        if (" + requireNonNull(javaName, () -> "no attribute for '" + it + "'") + " == null) {\n" +
                                        "            if (__errors_jsonSchema == null) {\n" +
                                        "                __errors_jsonSchema = new ArrayList<>();\n" +
                                        "            }\n" +
                                        "            __errors_jsonSchema.add(new ValidationException.ValidationError(\n" +
                                        "                \"" + javaName + "\", \"" + attribute.getJsonName().replace("\"", "\\\"") + "\",\n" +
                                        "                \"Missing '" + javaName.replace("\"", "\\\"") + "' attribute.\", true));\n" +
                                        "        }";
                            })
                            .collect(joining("\n", "", "\n")) +
                    "        if (__errors_jsonSchema != null) {\n" +
                    "            throw new ValidationException(__errors_jsonSchema);\n" +
                    "        }\n" +
                    end;
        }

        private String generateFluentSetter() {
            return attributes.stream()
                    .map(a -> "" +
                            // a plain setter but not used by the serialization at all
                            "    public " + clazz + " " + a.getJavaName() + "(final " + a.getType() + " " + a.getJavaName() + ") {\n" +
                            "        this." + a.getJavaName() + " = " + a.getJavaName() + ";\n" +
                            "        return this;\n" +
                            "    }\n")
                    .collect(joining("\n"));
        }
    }
}

