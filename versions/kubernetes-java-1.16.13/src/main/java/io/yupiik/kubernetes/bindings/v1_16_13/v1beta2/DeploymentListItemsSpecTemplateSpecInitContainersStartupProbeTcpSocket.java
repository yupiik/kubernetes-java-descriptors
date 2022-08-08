package io.yupiik.kubernetes.bindings.v1_16_13.v1beta2;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecInitContainersStartupProbeTcpSocket {
    private String host;
    private String port;

    public DeploymentListItemsSpecTemplateSpecInitContainersStartupProbeTcpSocket() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecInitContainersStartupProbeTcpSocket(final String host,
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecInitContainersStartupProbeTcpSocket)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecInitContainersStartupProbeTcpSocket __otherCasted = (DeploymentListItemsSpecTemplateSpecInitContainersStartupProbeTcpSocket) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(port, __otherCasted.port);
    }
}
