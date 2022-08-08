package io.yupiik.kubernetes.bindings.v1_14_10;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket {
    private String host;
    private String port;

    public ReplicationControllerSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket(final String host,
                                                                                          final String port) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(final String port) {
        this.port = port;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                host,
                port);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket __otherCasted = (ReplicationControllerSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(port, __otherCasted.port);
    }
}
