package io.yupiik.kubernetes.bindings.v1_23_7;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecContainersStartupProbeGrpc {
    private int port;
    private String service;

    public JobListItemsSpecTemplateSpecContainersStartupProbeGrpc() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecContainersStartupProbeGrpc(final int port,
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecContainersStartupProbeGrpc)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecContainersStartupProbeGrpc __otherCasted = (JobListItemsSpecTemplateSpecContainersStartupProbeGrpc) __other;
        return Objects.equals(port, __otherCasted.port) &&
            Objects.equals(service, __otherCasted.service);
    }
}
