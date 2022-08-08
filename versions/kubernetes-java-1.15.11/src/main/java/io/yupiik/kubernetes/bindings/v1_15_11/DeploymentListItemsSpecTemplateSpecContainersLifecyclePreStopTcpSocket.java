package io.yupiik.kubernetes.bindings.v1_15_11;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecContainersLifecyclePreStopTcpSocket {
    private String host;
    private String port;

    public DeploymentListItemsSpecTemplateSpecContainersLifecyclePreStopTcpSocket() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecContainersLifecyclePreStopTcpSocket(final String host,
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecContainersLifecyclePreStopTcpSocket)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecContainersLifecyclePreStopTcpSocket __otherCasted = (DeploymentListItemsSpecTemplateSpecContainersLifecyclePreStopTcpSocket) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(port, __otherCasted.port);
    }
}
