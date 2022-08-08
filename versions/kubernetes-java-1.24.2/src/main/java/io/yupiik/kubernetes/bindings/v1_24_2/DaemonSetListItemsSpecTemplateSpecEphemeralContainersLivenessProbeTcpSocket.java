package io.yupiik.kubernetes.bindings.v1_24_2;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeTcpSocket {
    private String host;
    private String port;

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeTcpSocket() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeTcpSocket(final String host,
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeTcpSocket)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeTcpSocket __otherCasted = (DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeTcpSocket) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(port, __otherCasted.port);
    }
}
