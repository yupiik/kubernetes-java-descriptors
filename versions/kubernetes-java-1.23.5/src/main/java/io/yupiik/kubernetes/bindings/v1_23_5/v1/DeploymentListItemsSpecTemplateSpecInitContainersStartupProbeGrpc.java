package io.yupiik.kubernetes.bindings.v1_23_5.v1;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecInitContainersStartupProbeGrpc {
    private int port;
    private String service;

    public DeploymentListItemsSpecTemplateSpecInitContainersStartupProbeGrpc() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecInitContainersStartupProbeGrpc(final int port,
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecInitContainersStartupProbeGrpc)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecInitContainersStartupProbeGrpc __otherCasted = (DeploymentListItemsSpecTemplateSpecInitContainersStartupProbeGrpc) __other;
        return Objects.equals(port, __otherCasted.port) &&
            Objects.equals(service, __otherCasted.service);
    }
}
