package io.yupiik.kubernetes.bindings.v1_23_5.v1;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecEphemeralContainersStartupProbeGrpc {
    private int port;
    private String service;

    public JobListItemsSpecTemplateSpecEphemeralContainersStartupProbeGrpc() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecEphemeralContainersStartupProbeGrpc(final int port,
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecEphemeralContainersStartupProbeGrpc)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecEphemeralContainersStartupProbeGrpc __otherCasted = (JobListItemsSpecTemplateSpecEphemeralContainersStartupProbeGrpc) __other;
        return Objects.equals(port, __otherCasted.port) &&
            Objects.equals(service, __otherCasted.service);
    }
}
