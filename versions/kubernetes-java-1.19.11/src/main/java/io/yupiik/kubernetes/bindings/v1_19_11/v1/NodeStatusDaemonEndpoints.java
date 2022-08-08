package io.yupiik.kubernetes.bindings.v1_19_11.v1;

import java.util.Objects;

public class NodeStatusDaemonEndpoints {
    private NodeStatusDaemonEndpointsKubeletEndpoint kubeletEndpoint;

    public NodeStatusDaemonEndpoints() {
        // no-op
    }

    public NodeStatusDaemonEndpoints(final NodeStatusDaemonEndpointsKubeletEndpoint kubeletEndpoint) {
        // no-op
    }

    public NodeStatusDaemonEndpointsKubeletEndpoint getKubeletEndpoint() {
        return kubeletEndpoint;
    }

    public void setKubeletEndpoint(final NodeStatusDaemonEndpointsKubeletEndpoint kubeletEndpoint) {
        this.kubeletEndpoint = kubeletEndpoint;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                kubeletEndpoint);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeStatusDaemonEndpoints)) {
            return false;
        }
        final NodeStatusDaemonEndpoints __otherCasted = (NodeStatusDaemonEndpoints) __other;
        return Objects.equals(kubeletEndpoint, __otherCasted.kubeletEndpoint);
    }
}
