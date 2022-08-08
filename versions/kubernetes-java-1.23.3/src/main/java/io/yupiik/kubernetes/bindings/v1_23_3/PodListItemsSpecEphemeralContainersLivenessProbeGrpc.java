package io.yupiik.kubernetes.bindings.v1_23_3;

import java.util.Objects;

public class PodListItemsSpecEphemeralContainersLivenessProbeGrpc {
    private int port;
    private String service;

    public PodListItemsSpecEphemeralContainersLivenessProbeGrpc() {
        // no-op
    }

    public PodListItemsSpecEphemeralContainersLivenessProbeGrpc(final int port,
                                                                final String service) {
        // no-op
    }

    public int getPort() {
        return port;
    }

    public void setPort(final int port) {
        this.port = port;
    }

    public String getService() {
        return service;
    }

    public void setService(final String service) {
        this.service = service;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                port,
                service);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodListItemsSpecEphemeralContainersLivenessProbeGrpc)) {
            return false;
        }
        final PodListItemsSpecEphemeralContainersLivenessProbeGrpc __otherCasted = (PodListItemsSpecEphemeralContainersLivenessProbeGrpc) __other;
        return Objects.equals(port, __otherCasted.port) &&
            Objects.equals(service, __otherCasted.service);
    }
}
