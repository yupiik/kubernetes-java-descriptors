package io.yupiik.kubernetes.bindings.v1_19_3.v1;

import java.util.Objects;

public class JobSpecTemplateSpecContainersLivenessProbeTcpSocket {
    private String host;
    private String port;

    public JobSpecTemplateSpecContainersLivenessProbeTcpSocket() {
        // no-op
    }

    public JobSpecTemplateSpecContainersLivenessProbeTcpSocket(final String host,
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
        if (!(__other instanceof JobSpecTemplateSpecContainersLivenessProbeTcpSocket)) {
            return false;
        }
        final JobSpecTemplateSpecContainersLivenessProbeTcpSocket __otherCasted = (JobSpecTemplateSpecContainersLivenessProbeTcpSocket) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(port, __otherCasted.port);
    }
}
