//DEPS io.yupiik.kubernetes:kubernetes-java-1.35.x:1.0.2-SNAPSHOT

import io.yupiik.kubernetes.bindings.v1_24_3.v1.*;
import java.io.*;
import java.nio.file.*;

class Generator {
    public static void main(final String... args) throws IOException {
        final var output = Files.createDirectories(Path.of("target/k8s-descriptors"));

        final var deployment = new Deployment()
                .spec(new DeploymentSpec()
                    /*...*/);

        Files.writeString(
                output.resolve("my-deployment.json"),
                deployment.asJson());
    }
}
