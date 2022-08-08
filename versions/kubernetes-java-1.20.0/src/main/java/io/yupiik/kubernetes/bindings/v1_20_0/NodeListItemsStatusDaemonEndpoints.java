package io.yupiik.kubernetes.bindings.v1_20_0;

import java.util.Objects;

public class NodeListItemsStatusDaemonEndpoints {
    private NodeListItemsStatusDaemonEndpointsKubeletEndpoint kubeletEndpoint;

    public NodeListItemsStatusDaemonEndpoints() {
        // no-op
    }

    public NodeListItemsStatusDaemonEndpoints(final NodeListItemsStatusDaemonEndpointsKubeletEndpoint kubeletEndpoint) {
        // no-op
    }

    public NodeListItemsStatusDaemonEndpointsKubeletEndpoint getKubeletEndpoint() {
        return kubeletEndpoint;
    }

    public void setKubeletEndpoint(final NodeListItemsStatusDaemonEndpointsKubeletEndpoint kubeletEndpoint) {
        this.kubeletEndpoint = kubeletEndpoint;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                kubeletEndpoint);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeListItemsStatusDaemonEndpoints)) {
            return false;
        }
        final NodeListItemsStatusDaemonEndpoints __otherCasted = (NodeListItemsStatusDaemonEndpoints) __other;
        return Objects.equals(kubeletEndpoint, __otherCasted.kubeletEndpoint);
    }
}
