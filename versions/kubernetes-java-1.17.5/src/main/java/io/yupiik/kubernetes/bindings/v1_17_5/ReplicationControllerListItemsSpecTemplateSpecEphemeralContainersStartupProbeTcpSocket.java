package io.yupiik.kubernetes.bindings.v1_17_5;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersStartupProbeTcpSocket {
    private String host;
    private String port;

    public ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersStartupProbeTcpSocket() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersStartupProbeTcpSocket(final String host,
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersStartupProbeTcpSocket)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersStartupProbeTcpSocket __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersStartupProbeTcpSocket) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(port, __otherCasted.port);
    }
}
