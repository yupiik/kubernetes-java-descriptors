package io.yupiik.kubernetes.bindings.v1_23_2;

import java.util.Objects;

public class PodSpecEphemeralContainersLivenessProbeGrpc {
    private int port;
    private String service;

    public PodSpecEphemeralContainersLivenessProbeGrpc() {
        // no-op
    }

    public PodSpecEphemeralContainersLivenessProbeGrpc(final int port,
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
        if (!(__other instanceof PodSpecEphemeralContainersLivenessProbeGrpc)) {
            return false;
        }
        final PodSpecEphemeralContainersLivenessProbeGrpc __otherCasted = (PodSpecEphemeralContainersLivenessProbeGrpc) __other;
        return Objects.equals(port, __otherCasted.port) &&
            Objects.equals(service, __otherCasted.service);
    }
}
