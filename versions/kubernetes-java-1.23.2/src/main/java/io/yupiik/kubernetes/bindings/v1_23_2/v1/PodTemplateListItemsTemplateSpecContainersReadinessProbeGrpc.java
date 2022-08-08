package io.yupiik.kubernetes.bindings.v1_23_2.v1;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecContainersReadinessProbeGrpc {
    private int port;
    private String service;

    public PodTemplateListItemsTemplateSpecContainersReadinessProbeGrpc() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecContainersReadinessProbeGrpc(final int port,
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecContainersReadinessProbeGrpc)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecContainersReadinessProbeGrpc __otherCasted = (PodTemplateListItemsTemplateSpecContainersReadinessProbeGrpc) __other;
        return Objects.equals(port, __otherCasted.port) &&
            Objects.equals(service, __otherCasted.service);
    }
}
