package io.yupiik.kubernetes.bindings.v1_23_3.v1beta1;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecInitContainersStartupProbeGrpc {
    private int port;
    private String service;

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersStartupProbeGrpc() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersStartupProbeGrpc(final int port,
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecInitContainersStartupProbeGrpc)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecInitContainersStartupProbeGrpc __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecInitContainersStartupProbeGrpc) __other;
        return Objects.equals(port, __otherCasted.port) &&
            Objects.equals(service, __otherCasted.service);
    }
}
