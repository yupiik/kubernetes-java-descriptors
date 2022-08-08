package io.yupiik.kubernetes.bindings.v1_14_1.v1beta1;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecContainersLifecyclePreStopTcpSocket {
    private String host;
    private String port;

    public DaemonSetSpecTemplateSpecContainersLifecyclePreStopTcpSocket() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecContainersLifecyclePreStopTcpSocket(final String host,
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecContainersLifecyclePreStopTcpSocket)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecContainersLifecyclePreStopTcpSocket __otherCasted = (DaemonSetSpecTemplateSpecContainersLifecyclePreStopTcpSocket) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(port, __otherCasted.port);
    }
}
