package io.yupiik.kubernetes.bindings.v1_19_14.v1;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecContainersStartupProbeTcpSocket {
    private String host;
    private String port;

    public ReplicationControllerSpecTemplateSpecContainersStartupProbeTcpSocket() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecContainersStartupProbeTcpSocket(final String host,
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecContainersStartupProbeTcpSocket)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecContainersStartupProbeTcpSocket __otherCasted = (ReplicationControllerSpecTemplateSpecContainersStartupProbeTcpSocket) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(port, __otherCasted.port);
    }
}
