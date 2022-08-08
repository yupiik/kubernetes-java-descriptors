package io.yupiik.kubernetes.bindings.v1_21_8;

import java.util.Objects;

public class NodeListItemsStatusDaemonEndpointsKubeletEndpoint {
    private int Port;

    public NodeListItemsStatusDaemonEndpointsKubeletEndpoint() {
        // no-op
    }

    public NodeListItemsStatusDaemonEndpointsKubeletEndpoint(final int Port) {
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
        if (!(__other instanceof NodeListItemsStatusDaemonEndpointsKubeletEndpoint)) {
            return false;
        }
        final NodeListItemsStatusDaemonEndpointsKubeletEndpoint __otherCasted = (NodeListItemsStatusDaemonEndpointsKubeletEndpoint) __other;
        return Objects.equals(Port, __otherCasted.Port);
    }
}
