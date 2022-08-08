package io.yupiik.kubernetes.bindings.v1_23_6.v1;

import java.util.Objects;

public class PodSpecInitContainersStartupProbeGrpc {
    private int port;
    private String service;

    public PodSpecInitContainersStartupProbeGrpc() {
        // no-op
    }

    public PodSpecInitContainersStartupProbeGrpc(final int port,
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
        if (!(__other instanceof PodSpecInitContainersStartupProbeGrpc)) {
            return false;
        }
        final PodSpecInitContainersStartupProbeGrpc __otherCasted = (PodSpecInitContainersStartupProbeGrpc) __other;
        return Objects.equals(port, __otherCasted.port) &&
            Objects.equals(service, __otherCasted.service);
    }
}
