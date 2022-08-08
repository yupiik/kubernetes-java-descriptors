package io.yupiik.kubernetes.bindings.v1_23_0;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeGrpc {
    private int port;
    private String service;

    public ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeGrpc() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeGrpc(final int port,
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeGrpc)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeGrpc __otherCasted = (ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeGrpc) __other;
        return Objects.equals(port, __otherCasted.port) &&
            Objects.equals(service, __otherCasted.service);
    }
}
