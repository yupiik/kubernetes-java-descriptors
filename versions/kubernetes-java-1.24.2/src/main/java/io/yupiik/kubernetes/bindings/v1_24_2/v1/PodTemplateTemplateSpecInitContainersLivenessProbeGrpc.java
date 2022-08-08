package io.yupiik.kubernetes.bindings.v1_24_2.v1;

import java.util.Objects;

public class PodTemplateTemplateSpecInitContainersLivenessProbeGrpc {
    private int port;
    private String service;

    public PodTemplateTemplateSpecInitContainersLivenessProbeGrpc() {
        // no-op
    }

    public PodTemplateTemplateSpecInitContainersLivenessProbeGrpc(final int port,
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
        if (!(__other instanceof PodTemplateTemplateSpecInitContainersLivenessProbeGrpc)) {
            return false;
        }
        final PodTemplateTemplateSpecInitContainersLivenessProbeGrpc __otherCasted = (PodTemplateTemplateSpecInitContainersLivenessProbeGrpc) __other;
        return Objects.equals(port, __otherCasted.port) &&
            Objects.equals(service, __otherCasted.service);
    }
}
