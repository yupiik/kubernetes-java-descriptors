package io.yupiik.kubernetes.bindings.v1_19_10;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLivenessProbeTcpSocket {
    private String host;
    private String port;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLivenessProbeTcpSocket() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLivenessProbeTcpSocket(final String host,
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLivenessProbeTcpSocket)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLivenessProbeTcpSocket __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLivenessProbeTcpSocket) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(port, __otherCasted.port);
    }
}
