package io.yupiik.kubernetes.bindings.v1_20_9.v1;

import io.yupiik.kubernetes.bindings.v1_20_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_20_9.Validable;
import io.yupiik.kubernetes.bindings.v1_20_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NodeDaemonEndpoints implements Validable<NodeDaemonEndpoints>, Exportable {
    private DaemonEndpoint kubeletEndpoint;

    public NodeDaemonEndpoints() {
        // no-op
    }

    public NodeDaemonEndpoints(final DaemonEndpoint kubeletEndpoint) {
        // no-op
    }

    public DaemonEndpoint getKubeletEndpoint() {
        return kubeletEndpoint;
    }

    public void setKubeletEndpoint(final DaemonEndpoint kubeletEndpoint) {
        this.kubeletEndpoint = kubeletEndpoint;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                kubeletEndpoint);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeDaemonEndpoints)) {
            return false;
        }
        final NodeDaemonEndpoints __otherCasted = (NodeDaemonEndpoints) __other;
        return Objects.equals(kubeletEndpoint, __otherCasted.kubeletEndpoint);
    }

    public NodeDaemonEndpoints kubeletEndpoint(final DaemonEndpoint kubeletEndpoint) {
        this.kubeletEndpoint = kubeletEndpoint;
        return this;
    }

    @Override
    public NodeDaemonEndpoints validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (kubeletEndpoint != null ? "\"kubeletEndpoint\":" + kubeletEndpoint.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
