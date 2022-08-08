package io.yupiik.kubernetes.bindings.v1_19_3;

import java.util.Objects;

public class NodeStatusDaemonEndpointsKubeletEndpoint {
    private int Port;

    public NodeStatusDaemonEndpointsKubeletEndpoint() {
        // no-op
    }

    public NodeStatusDaemonEndpointsKubeletEndpoint(final int Port) {
        // no-op
    }

    public int getPort() {
        return Port;
    }

    public void setPort(final int Port) {
        this.Port = Port;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                Port);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeStatusDaemonEndpointsKubeletEndpoint)) {
            return false;
        }
        final NodeStatusDaemonEndpointsKubeletEndpoint __otherCasted = (NodeStatusDaemonEndpointsKubeletEndpoint) __other;
        return Objects.equals(Port, __otherCasted.Port);
    }
}
