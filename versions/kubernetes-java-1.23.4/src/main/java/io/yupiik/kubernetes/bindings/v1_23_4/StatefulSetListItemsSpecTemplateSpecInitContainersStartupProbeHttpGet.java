package io.yupiik.kubernetes.bindings.v1_23_4;

import java.util.List;
import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecInitContainersStartupProbeHttpGet {
    private String host;
    private List<StatefulSetListItemsSpecTemplateSpecInitContainersStartupProbeHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private StatefulSetListItemsSpecTemplateSpecInitContainersStartupProbeHttpGetScheme scheme;

    public StatefulSetListItemsSpecTemplateSpecInitContainersStartupProbeHttpGet() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecInitContainersStartupProbeHttpGet(final String host,
                                                                                 final List<StatefulSetListItemsSpecTemplateSpecInitContainersStartupProbeHttpGetHttpHeaders> httpHeaders,
                                                                                 final String path,
                                                                                 final String port,
                                                                                 final StatefulSetListItemsSpecTemplateSpecInitContainersStartupProbeHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<StatefulSetListItemsSpecTemplateSpecInitContainersStartupProbeHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<StatefulSetListItemsSpecTemplateSpecInitContainersStartupProbeHttpGetHttpHeaders> httpHeaders) {
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

    public StatefulSetListItemsSpecTemplateSpecInitContainersStartupProbeHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final StatefulSetListItemsSpecTemplateSpecInitContainersStartupProbeHttpGetScheme scheme) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecInitContainersStartupProbeHttpGet)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecInitContainersStartupProbeHttpGet __otherCasted = (StatefulSetListItemsSpecTemplateSpecInitContainersStartupProbeHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
