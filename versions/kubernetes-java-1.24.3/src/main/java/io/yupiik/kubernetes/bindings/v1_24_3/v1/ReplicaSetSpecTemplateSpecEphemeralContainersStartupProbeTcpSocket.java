package io.yupiik.kubernetes.bindings.v1_24_3.v1;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecEphemeralContainersStartupProbeTcpSocket {
    private String host;
    private String port;

    public ReplicaSetSpecTemplateSpecEphemeralContainersStartupProbeTcpSocket() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecEphemeralContainersStartupProbeTcpSocket(final String host,
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecEphemeralContainersStartupProbeTcpSocket)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecEphemeralContainersStartupProbeTcpSocket __otherCasted = (ReplicaSetSpecTemplateSpecEphemeralContainersStartupProbeTcpSocket) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(port, __otherCasted.port);
    }
}
