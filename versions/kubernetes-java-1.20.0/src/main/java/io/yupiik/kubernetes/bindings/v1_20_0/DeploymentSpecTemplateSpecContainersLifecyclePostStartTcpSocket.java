package io.yupiik.kubernetes.bindings.v1_20_0;

import java.util.Objects;

public class DeploymentSpecTemplateSpecContainersLifecyclePostStartTcpSocket {
    private String host;
    private String port;

    public DeploymentSpecTemplateSpecContainersLifecyclePostStartTcpSocket() {
        // no-op
    }

    public DeploymentSpecTemplateSpecContainersLifecyclePostStartTcpSocket(final String host,
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
        if (!(__other instanceof DeploymentSpecTemplateSpecContainersLifecyclePostStartTcpSocket)) {
            return false;
        }
        final DeploymentSpecTemplateSpecContainersLifecyclePostStartTcpSocket __otherCasted = (DeploymentSpecTemplateSpecContainersLifecyclePostStartTcpSocket) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(port, __otherCasted.port);
    }
}
