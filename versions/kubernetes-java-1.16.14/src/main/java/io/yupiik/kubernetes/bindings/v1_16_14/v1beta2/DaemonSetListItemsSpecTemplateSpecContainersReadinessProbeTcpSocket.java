package io.yupiik.kubernetes.bindings.v1_16_14.v1beta2;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecContainersReadinessProbeTcpSocket {
    private String host;
    private String port;

    public DaemonSetListItemsSpecTemplateSpecContainersReadinessProbeTcpSocket() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecContainersReadinessProbeTcpSocket(final String host,
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecContainersReadinessProbeTcpSocket)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecContainersReadinessProbeTcpSocket __otherCasted = (DaemonSetListItemsSpecTemplateSpecContainersReadinessProbeTcpSocket) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(port, __otherCasted.port);
    }
}
