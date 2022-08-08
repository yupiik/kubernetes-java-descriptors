package io.yupiik.kubernetes.bindings.v1_23_0.v1;

import java.util.List;
import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecContainersLivenessProbeHttpGet {
    private String host;
    private List<StatefulSetListItemsSpecTemplateSpecContainersLivenessProbeHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private StatefulSetListItemsSpecTemplateSpecContainersLivenessProbeHttpGetScheme scheme;

    public StatefulSetListItemsSpecTemplateSpecContainersLivenessProbeHttpGet() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecContainersLivenessProbeHttpGet(final String host,
                                                                              final List<StatefulSetListItemsSpecTemplateSpecContainersLivenessProbeHttpGetHttpHeaders> httpHeaders,
                                                                              final String path,
                                                                              final String port,
                                                                              final StatefulSetListItemsSpecTemplateSpecContainersLivenessProbeHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<StatefulSetListItemsSpecTemplateSpecContainersLivenessProbeHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<StatefulSetListItemsSpecTemplateSpecContainersLivenessProbeHttpGetHttpHeaders> httpHeaders) {
        this.httpHeaders = httpHeaders;
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public String getPort() {
        return port;
    }

    public void setPort(final String port) {
        this.port = port;
    }

    public StatefulSetListItemsSpecTemplateSpecContainersLivenessProbeHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final StatefulSetListItemsSpecTemplateSpecContainersLivenessProbeHttpGetScheme scheme) {
        this.scheme = scheme;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                host,
                httpHeaders,
                path,
                port,
                scheme);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecContainersLivenessProbeHttpGet)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecContainersLivenessProbeHttpGet __otherCasted = (StatefulSetListItemsSpecTemplateSpecContainersLivenessProbeHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
