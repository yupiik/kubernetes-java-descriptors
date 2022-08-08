package io.yupiik.kubernetes.bindings.v1_18_11.v1;

import java.util.Objects;

public class PodSpecEphemeralContainersReadinessProbeTcpSocket {
    private String host;
    private String port;

    public PodSpecEphemeralContainersReadinessProbeTcpSocket() {
        // no-op
    }

    public PodSpecEphemeralContainersReadinessProbeTcpSocket(final String host,
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
        if (!(__other instanceof PodSpecEphemeralContainersReadinessProbeTcpSocket)) {
            return false;
        }
        final PodSpecEphemeralContainersReadinessProbeTcpSocket __otherCasted = (PodSpecEphemeralContainersReadinessProbeTcpSocket) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(port, __otherCasted.port);
    }
}
