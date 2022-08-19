import io.yupiik.kubernetes.bindings.v1_24_3.v1.*;

class Generator {
    public void generate() {
        final var output = Files.createDirectories(Path.of("target/k8s-descriptors"));

        final var deployment = new Deployment()
                .spec(new DeploymentSpec()
                        /* ... */);

        Files.writeString(
                output.resolve("my-deployment.json"),
                deployment.asJson());
    }
}

class Runner { // enables to code in an IDE even if not needed by JShell
    public static void main(final String... args) throws Exception {
        new Generator().generate();
    }
}
