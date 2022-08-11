import io.yupiik.kubernetes.bindings.v1_24_3.v1.*; // <1>

{ // <2>
    final var output = Files.createDirectories(Path.of("target/k8s-descriptors"));

    final var deployment = new Deployment()
        .spec(new DeploymentSpec()
        /* ... */);

    Files.writeString(
       output.resolve("my-deployment.json"),
        deployment.asJson());
}

/exit // <3>
