package io.yupiik.kubernetes.bindings.v1_21_2.v1;

import java.util.Objects;

public class JobSpecTemplateSpecInitContainersStartupProbeTcpSocket {
    private String host;
    private String port;

    public JobSpecTemplateSpecInitContainersStartupProbeTcpSocket() {
        // no-op
    }

    public JobSpecTemplateSpecInitContainersStartupProbeTcpSocket(final String host,
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
        if (!(__other instanceof JobSpecTemplateSpecInitContainersStartupProbeTcpSocket)) {
            return false;
        }
        final JobSpecTemplateSpecInitContainersStartupProbeTcpSocket __otherCasted = (JobSpecTemplateSpecInitContainersStartupProbeTcpSocket) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(port, __otherCasted.port);
    }
}
