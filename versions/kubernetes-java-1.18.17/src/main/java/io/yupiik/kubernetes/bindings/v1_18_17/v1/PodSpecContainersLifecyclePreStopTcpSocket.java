package io.yupiik.kubernetes.bindings.v1_18_17.v1;

import java.util.Objects;

public class PodSpecContainersLifecyclePreStopTcpSocket {
    private String host;
    private String port;

    public PodSpecContainersLifecyclePreStopTcpSocket() {
        // no-op
    }

    public PodSpecContainersLifecyclePreStopTcpSocket(final String host,
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
        if (!(__other instanceof PodSpecContainersLifecyclePreStopTcpSocket)) {
            return false;
        }
        final PodSpecContainersLifecyclePreStopTcpSocket __otherCasted = (PodSpecContainersLifecyclePreStopTcpSocket) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(port, __otherCasted.port);
    }
}
