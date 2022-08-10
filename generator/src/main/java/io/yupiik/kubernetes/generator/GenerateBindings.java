package io.yupiik.kubernetes.generator;

import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import jakarta.json.JsonReaderFactory;
import jakarta.json.JsonString;
import jakarta.json.JsonValue;
import jakarta.json.bind.annotation.JsonbTransient;
import org.apache.johnzon.jsonschema.generator.PojoGenerator;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
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
import static java.util.Locale.ROOT;
import static java.util.Objects.requireNonNull;
import static java.util.Optional.ofNullable;
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
    private final String bundlebeeSchema;
    private final String type;

    private GenerateBindings(final String... args) throws IOException {
        url = args[0];
        base = args[1];
        groupId = args[2];
        version = args[3];
        work = Files.createDirectories(Path.of(args[4]));
        versionsBase = Path.of(args[5]);
        schemaExtension = args[6];
        threads = Integer.parseInt(args[7]);
        bundlebeeSchema = args[8];
        type = args[9];
    }

    public void run() throws IOException, InterruptedException {
        final var httpClient = HttpClient.newBuilder().followRedirects(HttpClient.Redirect.ALWAYS).build();
        switch (type.toUpperCase(ROOT)) {
            case "NONE" -> {
            }
            case "ALL" -> {
                doBundleBeeGeneration(httpClient);
                doK8sGeneration(httpClient);
            }
            case "KUBERNETES" -> doK8sGeneration(httpClient);
            case "BUNDLEBEE" -> doBundleBeeGeneration(httpClient);
            default -> throw new IllegalArgumentException("Unsupported type: '" + type + "'");
        }
    }

    private void doBundleBeeGeneration(final HttpClient httpClient) throws IOException, InterruptedException {
        logger.info(() -> "Downloading '" + bundlebeeSchema + "'");
        final var response = httpClient
                .send(
                        HttpRequest.newBuilder()
                                .GET()
                                .uri(URI.create(bundlebeeSchema))
                                .build(),
                        ofString());

        logger.info(() -> "Response HTTP " + response.statusCode());
        if (response.statusCode() != 200) {
            throw new IllegalStateException(response.toString());
        }

        final var jsonReaderFactory = Json.createReaderFactory(Map.of());
        final JsonObject schema;
        try (final var reader = jsonReaderFactory.createReader(new StringReader(response.body()))) {
            schema = reader.readObject();
        }

        final var root = Files.createDirectories(versionsBase.getParent().resolve("bundlebee-java"));

        final var basePackage = "io.yupiik.kubernetes.bindings.bundlebee";
        writeHelpers(root, basePackage);

        final var definitions = buildDefinitions(schema);
        final var refRegistry = new HashMap<String, String>();
        try {
            generateFromSchema(
                    () -> "bundlebee.schema.json",
                    "Manifest" + schemaExtension,
                    basePackage, () -> definitions, refRegistry, root, schema, "v1", true);
        } catch (final IOException ex) {
            throw new IllegalStateException(ex);
        }
    }

    private JsonObject buildDefinitions(final JsonObject schema) {
        return schema.getJsonObject("definitions");
    }

    private void doK8sGeneration(HttpClient httpClient) throws IOException, InterruptedException {
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
        writeHelpers(root, basePackage);

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

    private void writeHelpers(final Path root, final String basePackage) throws IOException {
        writeJava(root, basePackage, "JsonStrings", "package " + basePackage + ";\n" +
                "\n" +
                "// internal class, public to share it accross subpackages but shouldn't be used by client code\n" +
                "public final class JsonStrings {\n" +
                "    private JsonStrings() {\n" +
                "        // no-op\n" +
                "    }\n" +
                "\n" +
                "    public static String escapeJson(final String text) {\n" +
                "        if (text.isEmpty()) {\n" +
                "            return \"\";\n" +
                "        }\n" +
                "\n" +
                "        final var out = new StringBuilder();\n" +
                "\n" +
                "        final int length = text.length();\n" +
                "        for (int i = 0; i < length; i++) {\n" +
                "            int begin = i;\n" +
                "            int end = i;\n" +
                "            char c = text.charAt(i);\n" +
                "            while (c >= 0x20 && c != 0x22 && c != 0x5c) {\n" +
                "                i++;\n" +
                "                end = i;\n" +
                "                if (i < length) {\n" +
                "                    c = text.charAt(i);\n" +
                "                } else {\n" +
                "                    break;\n" +
                "                }\n" +
                "            }\n" +
                "\n" +
                "            if (begin < end) { // no escaping\n" +
                "                out.append(text, begin, end);\n" +
                "                if (i == length) {\n" +
                "                    break;\n" +
                "                }\n" +
                "            }\n" +
                "\n" +
                "            switch (c) {\n" +
                "                case '\"', '\\\\' -> out.append('\\\\').append(c);\n" +
                "                case '\\b' -> out.append('\\\\').append('b');\n" +
                "                case '\\f' -> out.append('\\\\').append('f');\n" +
                "                case '\\n' -> out.append('\\\\').append('n');\n" +
                "                case '\\r' -> out.append('\\\\').append('r');\n" +
                "                case '\\t' -> out.append('\\\\').append('t');\n" +
                "                default -> {\n" +
                "                    final var hex = \"000\" + Integer.toHexString(c);\n" +
                "                    out.append(\"\\\\u\").append(hex.substring(hex.length() - 4));\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "\n" +
                "        return out.toString();\n" +
                "    }\n" +
                "}\n" +
                "\n");
        writeJava(root, basePackage, "Exportable", "package " + basePackage + ";\n" +
                "\n" +
                "public interface Exportable {\n" +
                "    String asJson();\n" +
                "}\n" +
                "\n");
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

            generateFromSchema(
                    () -> path.getParent().relativize(schema).toString(),
                    name, basePackage, definitions, refRegistry, root, readSchema, rel, false);
        } catch (final RuntimeException re) {
            throw new IllegalStateException("Can't generate binding for '" + schema + "'", re);
        }
    }

    private void generateFromSchema(final Supplier<String> source, final String name, final String basePackage,
                                    final Supplier<JsonObject> definitions, final Map<String, String> refRegistry,
                                    final Path root, final JsonObject readSchema, final String rel, final boolean useId) throws IOException {
        final var packageName = basePackage + (rel.isEmpty() ? "" : "." + rel);
        final var pojoConfiguration = new PojoGenerator.PojoConfiguration()
                .setClassName(name.substring(0, name.length() - schemaExtension.length()))
                .setPackageName(packageName)
                .setOnRef(ref -> onRef(definitions, packageName, ref, refRegistry, basePackage, useId));

        final var bindings = new K8sPojoGenerator(pojoConfiguration, readSchema, basePackage, useId)
                .visitSchema(readSchema)
                .generate();
        refRegistry.putAll(bindings);

        logger.info(() -> "Generated #" + bindings.size() + " classes from '" + source + "'");
        for (final var entry : bindings.entrySet()) {
            final var out = root.resolve("src/main/java").resolve(entry.getKey());
            Files.createDirectories(out.getParent());
            Files.writeString(out, entry.getValue());
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
                         final Map<String, String> previousRefs, final String basePackage, final boolean useId) {
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
                                                    .setOnRef(r -> onRef(definitions, packageName, r, previousRefs, basePackage, useId)),
                                            schema, basePackage, useId)
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
                                !name.startsWith("v1.4.") &&
                                !name.startsWith("v1.5.") &&
                                !name.startsWith("v1.6.");
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
        private static final String BUNDLEBEE_MANIFEST = "io.yupiik.kubernetes.bindings.bundlebee.v1.Manifest";
        private static final String BUNDLEBEE_DESCRIPTOR = "io.yupiik.kubernetes.bindings.bundlebee.v1.Descriptor";

        private final JsonObject schema;
        private final String clazz;
        private final String basePackage;
        private final boolean useRefAndIdForNaming;
        private final PojoConfiguration conf;

        private String asJson;
        private String validator;
        private boolean lastEnumHasInjection;
        private JsonObject lastTypeSchema;

        private K8sPojoGenerator(final PojoGenerator.PojoConfiguration conf, final JsonObject schema,
                                 final String basePackage, final boolean useIdForNaming) {
            super(useIdForNaming && schema.containsKey("$id") ? fixConf(conf, schema) : conf);
            this.conf = conf;
            this.clazz = conf.getClassName();
            this.basePackage = basePackage;
            this.schema = schema;
            this.useRefAndIdForNaming = useIdForNaming;
        }

        private String classSpecificMethods() {
            return switch (fullyQualifiedName()) {
                case BUNDLEBEE_DESCRIPTOR -> """
                            
                            @JsonbTransient
                            private transient Object underlyingDescriptor;
                                                    
                            public Object underlyingDescriptor() {
                                return underlyingDescriptor;
                            }
                                                    
                            public Descriptor underlyingDescriptor(final Object instance) {
                                underlyingDescriptor = instance;
                                return this;
                            }
                        """;
                case BUNDLEBEE_MANIFEST -> """

                            public Manifest writeTo(final Path path) {
                                try {
                                    final var logger = Logger.getLogger(getClass().getName());
                                    final var bundlebee = Files.createDirectories(path.resolve("bundlebee"));
                                    final var k8s = Files.createDirectories(bundlebee.resolve("kubernetes"));
                        
                                    final var manifestJson = bundlebee.resolve("manifest.json");
                                    Files.writeString(manifestJson, asJson());
                                    logger.info(() -> "Wrote '" + manifestJson + "'");
                        
                                    if (alveoli != null) {
                                        for (final var alveolus : alveoli) {
                                            if (alveolus.getDescriptors() == null) {
                                                continue;
                                            }
                        
                                            for (final var desc : alveolus.getDescriptors()) {
                                                final var file = k8s.resolve(desc.getLocation());
                                                final var underlyingDescriptor = desc.underlyingDescriptor();
                                                if (underlyingDescriptor != null) {
                                                    final var asJson = underlyingDescriptor.getClass().getMethod("asJson");
                                                    if (!asJson.canAccess(underlyingDescriptor)) {
                                                        asJson.setAccessible(true);
                                                    }
                                                    Files.writeString(file, asJson.invoke(underlyingDescriptor).toString());
                                                    logger.info(() -> "Wrote '" + file + "'");
                                                }
                                            }
                                        }
                                    }
                                } catch (final NoSuchMethodException | IllegalAccessException e) {
                                    throw new IllegalStateException("Invalid descriptor", e);
                                } catch (final InvocationTargetException e) {
                                    throw new IllegalStateException("Invalid descriptor", e.getTargetException());
                                } catch (final IOException ioe) {
                                    throw new IllegalStateException(ioe);
                                }
                                return this;
                            }
                        """;
                default -> "";
            };
        }

        private String fullyQualifiedName() {
            return conf.getPackageName() + '.' + clazz;
        }

        @Override
        public Map<String, String> generate() {
            asJson = generateAsJson(); // enables to handle imports properly having attributes and avoids to regenerate it in beforeClassEnd()
            validator = generateValidator();

            switch (fullyQualifiedName()) {
                case BUNDLEBEE_MANIFEST -> {
                    imports.add(Path.class.getName());
                    imports.add(Files.class.getName());
                    imports.add(IOException.class.getName());
                    imports.add(Logger.class.getName());
                    imports.add(InvocationTargetException.class.getName());
                }
                case BUNDLEBEE_DESCRIPTOR -> imports.add(JsonbTransient.class.getName());
                default -> {}
            }

            // for afterClassName() and beforeClassEnd()
            imports.add(basePackage + ".Exportable");
            imports.add(basePackage + ".Validable");
            if (validator.contains("ValidationException")) {
                imports.add(basePackage + ".ValidationException");
                imports.add(List.class.getName());
                imports.add(ArrayList.class.getName());
            }
            if (asJson.contains("JsonStrings")) {
                imports.add(basePackage + ".JsonStrings");
            }
            if (asJson.contains(" Stream.of(")) {
                imports.add(Stream.class.getName());
            }
            if (asJson.contains("collect(joining")) {
                imports.add("static java.util.stream.Collectors.joining");
            }
            return super.generate();
        }

        @Override
        protected PojoGenerator newSubPojoGenerator(final PojoConfiguration pojoConfiguration, final JsonObject schema) {
            if (useRefAndIdForNaming && schema.containsKey("$id")) {
                final PojoConfiguration conf = fixConf(pojoConfiguration, schema);
                return new K8sPojoGenerator(conf, schema, basePackage, useRefAndIdForNaming);
            }
            return new K8sPojoGenerator(pojoConfiguration, schema, basePackage, useRefAndIdForNaming);
        }

        @Override
        protected String beforeEnumEnd() {
            return (!lastEnumHasInjection ? "    ;\n" : "") +
                    "\n" +
                    "    @Override\n" +
                    "    public String asJson() {\n" +
                    (lastEnumHasInjection ?
                            "        return \"\\\"\" + toString() + \"\\\"\";\n" :
                            "        return \"\\\"\" + name() + \"\\\"\";\n") +
                    "    }\n" +
                    "";
        }

        @Override
        protected String afterEnumName(final Map<String, String> values, final boolean valuesAreInjected) {
            this.lastEnumHasInjection = valuesAreInjected;
            return " implements Exportable";
        }

        @Override
        protected String enumImports() {
            return "" +
                    "import " + basePackage + ".Exportable;\n" +
                    "\n";
        }

        @Override
        protected String afterClassName() {
            return " implements Validable<" + clazz + ">, Exportable";
        }

        @Override
        protected String beforeClassEnd() {
            return attributes.isEmpty() ? "" : ("" +
                    "\n" + generateFluentSetter() +
                    "\n" + validator +
                    "\n" + asJson +
                    classSpecificMethods());
        }

        @Override
        protected String enumName(final String javaName, final JsonObject schema) {
            if (useRefAndIdForNaming && lastTypeSchema.containsKey("$id")) {
                return nameFromId(lastTypeSchema.getString("$id"));
            }
            return super.enumName(javaName, schema);
        }

        @Override
        protected String asType(final String javaName, final JsonObject schema, final boolean required) {
            this.lastTypeSchema = schema;
            if (useRefAndIdForNaming) {
                if (isJsonObject(schema)) {
                    imports.add(Map.class.getName());
                    return "Map<String, String>";
                }
                if ("array".equals(schema.getString("type")) && isJsonObject(schema.getJsonObject("items"))) {
                    imports.add(JsonArray.class.getName());
                    return "JsonArray";
                }

                super.asType(javaName, schema, required); // triggers the nested generations so call it to get the full object graph

                if (schema.containsKey("$ref")) {
                    final var ref = schema.getString("$ref");
                    return nameFromId(ref);
                }
                if ("array".equals(schema.getString("type"))) {
                    if (schema.getJsonObject("items").containsKey("$id")) {
                        return "List<" + nameFromId(schema.getJsonObject("items").getString("$id")) + ">";
                    }
                } else if (schema.containsKey("$id")) {
                    return nameFromId(schema.getString("$id"));
                }
            }
            return super.asType(javaName, schema, required);
        }

        private boolean isJsonObject(final JsonObject schema) {
            return "object".equals(schema.getString("type")) &&
                    schema.containsKey("properties") &&
                    schema.getJsonObject("properties").isEmpty();
        }

        private String generateAsJson() {
            return "" +
                    "    @Override\n" +
                    "    public String asJson() {\n" +
                    (attributes.isEmpty() ?
                            "        return \"{}\";" : "" +
                            "        return Stream.of(\n" +
                            attributes.stream()
                                    .sorted(comparing(Attribute::getJavaName))
                                    .map(a -> {
                                        final boolean primitive = isPrimitive(a.getType());
                                        return "                    " +
                                                (primitive ? "" : "(" + a.getJavaName() + " != null ? ") +
                                                jsonSerializer(a) +
                                                (primitive ? "" : " : \"\")");
                                    })
                                    .collect(joining(",\n")) +
                            ")\n" +
                            "                .filter(__it -> !__it.isBlank())\n" +
                            "                .collect(joining(\",\", \"{\", \"}\"));\n") +
                    "    }\n";
        }

        private String jsonSerializer(final Attribute attribute) {
            final var type = attribute.getType();
            final var key = "\"\\\"" + attribute.getJsonName().replace("\"", "\\\"") + "\\\":";
            return switch (type) {
                case "int", "long", "float", "double", "boolean", "Integer", "Long", "Float", "Double", "Boolean", "JsonObject", "JsonValue", "JsonArray" ->
                        key + "\" + " + attribute.getJavaName();
                case "String" -> key + "\\\"\" +  JsonStrings.escapeJson(" + attribute.getJavaName() + ") + \"\\\"\"";
                default -> {
                    if (type.startsWith("List<")) {
                        final var containedType = type.substring("List<".length(), type.length() - 1).strip();
                        final var prefix = key + "\" + " + attribute.getJavaName() + ".stream().map(__it -> ";
                        final var suffix = ").collect(joining(\",\", \"[\", \"]\"))";
                        yield switch (containedType) {
                            case "int", "long", "float", "double", "boolean" ->
                                    prefix + "String.valueOf(__it)" + suffix;
                            case "Integer", "Long", "Float", "Double", "Boolean", "JsonObject", "JsonValue", "JsonArray" ->
                                    prefix + "__it == null ? \"null\" : String.valueOf(__it)" + suffix;
                            case "String" -> prefix +
                                    "__it == null ? \"null\" : (\"\\\"\" + JsonStrings.escapeJson(__it) + \"\\\"\")" + suffix;
                            default -> prefix + "__it == null ? \"null\" : __it.asJson()" + suffix;
                        };
                    }
                    if (type.startsWith("Map<")) {
                        final var containedType = type.substring(type.indexOf(',') + 1, type.length() - 1).strip();
                        final var prefix = key + "\" + " + attribute.getJavaName() + ".entrySet().stream()\n" +
                                "                        .map(__it -> \"\\\"\" + JsonStrings.escapeJson(__it.getKey()) + \"\\\":\" + ";
                        final var suffix = ")\n                        .collect(joining(\",\", \"{\", \"}\"))";
                        yield switch (containedType) {
                            case "int", "long", "float", "double", "boolean" ->
                                    prefix + "String.valueOf(__it.getValue())" + suffix;
                            case "Integer", "Long", "Float", "Double", "Boolean", "JsonObject", "JsonValue", "JsonArray" ->
                                    prefix + "(__it.getValue() == null ? \"null\" : String.valueOf(__it.getValue()))" + suffix;
                            case "String" -> prefix +
                                    "(__it.getValue() == null ? \"null\" : (\"\\\"\" + JsonStrings.escapeJson(__it.getValue()) + \"\\\"\"))" + suffix;
                            default ->
                                    prefix + "(__it.getValue() == null ? \"null\" : __it.getValue().asJson())" + suffix;
                        };
                    }
                    yield key + "\" + " + attribute.getJavaName() + ".asJson()";
                }
            };
        }

        private String generateValidator() {
            var start = "    @Override\n" +
                    "    public " + clazz + " validate() {\n";
            final var end = "        return this;\n    }\n";

            final var groupVersionKindValue = schema.get("x-kubernetes-group-version-kind");
            if (groupVersionKindValue != null && groupVersionKindValue.getValueType() == JsonValue.ValueType.ARRAY) {
                final var groupVersionKind = groupVersionKindValue.asJsonArray();
                if (groupVersionKind.size() == 1) {
                    final var defaults = groupVersionKind.get(0).asJsonObject();
                    final var properties = schema.getJsonObject("properties");
                    if (ofNullable(properties.get("kind"))
                            .map(it -> "string".equals(it.asJsonObject().getString("type")))
                            .orElse(false)) {
                        start += "" +
                                "        if (kind == null) {\n" +
                                "            kind = \"" + defaults.getString("kind") + "\";\n" +
                                "        }\n";
                    }
                    if (ofNullable(properties.get("apiVersion"))
                            .map(it -> "string".equals(it.asJsonObject().getString("type")))
                            .orElse(false)) {
                        final var apiVersion = ofNullable(defaults.get("group"))
                                .filter(it -> it.getValueType() == JsonValue.ValueType.STRING)
                                .map(JsonString.class::cast)
                                .map(JsonString::getString)
                                .filter(it -> !it.isBlank())
                                .map(v -> v + '/')
                                .orElse("") +
                                defaults.getString("version");

                        start += "" +
                                "        if (apiVersion == null) {\n" +
                                "            apiVersion = \"" + apiVersion + "\";\n" +
                                "        }\n";
                    }
                }
            }

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

        private boolean isPrimitive(final String type) {
            return "int".equals(type) ||
                    "long".equals(type) ||
                    "float".equals(type) ||
                    "double".equals(type) ||
                    "boolean".equals(type);
        }

        private static PojoConfiguration fixConf(final PojoConfiguration pojoConfiguration, final JsonObject schema) {
            final var id = schema.getString("$id");
            return new PojoConfiguration()
                    .setClassName(nameFromId(id))
                    .setPackageName(pojoConfiguration.getPackageName())
                    .setOnRef(pojoConfiguration.getOnRef())
                    .setFluentSetters(pojoConfiguration.isFluentSetters())
                    .setAddJsonbProperty(pojoConfiguration.isAddJsonbProperty())
                    .setAddAllArgsConstructor(pojoConfiguration.isAddAllArgsConstructor());
        }

        private static String nameFromId(final String id) {
            return id.substring(id.lastIndexOf('_') + 1);
        }
    }
}

