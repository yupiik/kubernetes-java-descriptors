package io.yupiik.kubernetes.bindings.v1_17_8;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecInitContainersStartupProbeTcpSocket {
    private String host;
    private String port;

    public StatefulSetSpecTemplateSpecInitContainersStartupProbeTcpSocket() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecInitContainersStartupProbeTcpSocket(final String host,
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecInitContainersStartupProbeTcpSocket)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecInitContainersStartupProbeTcpSocket __otherCasted = (StatefulSetSpecTemplateSpecInitContainersStartupProbeTcpSocket) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(port, __otherCasted.port);
    }
}
