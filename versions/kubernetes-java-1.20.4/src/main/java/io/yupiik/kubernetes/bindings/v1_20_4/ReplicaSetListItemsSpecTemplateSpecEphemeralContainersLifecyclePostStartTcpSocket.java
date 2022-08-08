package io.yupiik.kubernetes.bindings.v1_20_4;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket {
    private String host;
    private String port;

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket(final String host,
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket __otherCasted = (ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(port, __otherCasted.port);
    }
}
