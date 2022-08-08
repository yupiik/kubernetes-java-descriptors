package io.yupiik.kubernetes.bindings.v1_21_4.v1;

import java.util.Objects;

public class JobSpecTemplateSpecContainersLifecyclePostStartTcpSocket {
    private String host;
    private String port;

    public JobSpecTemplateSpecContainersLifecyclePostStartTcpSocket() {
        // no-op
    }

    public JobSpecTemplateSpecContainersLifecyclePostStartTcpSocket(final String host,
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
        if (!(__other instanceof JobSpecTemplateSpecContainersLifecyclePostStartTcpSocket)) {
            return false;
        }
        final JobSpecTemplateSpecContainersLifecyclePostStartTcpSocket __otherCasted = (JobSpecTemplateSpecContainersLifecyclePostStartTcpSocket) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(port, __otherCasted.port);
    }
}
