package io.yupiik.kubernetes.bindings.v1_15_9.v1;

import java.util.List;
import java.util.Objects;

public class StatefulSetSpecTemplateSpecInitContainersReadinessProbeHttpGet {
    private String host;
    private List<StatefulSetSpecTemplateSpecInitContainersReadinessProbeHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private String scheme;

    public StatefulSetSpecTemplateSpecInitContainersReadinessProbeHttpGet() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecInitContainersReadinessProbeHttpGet(final String host,
                                                                          final List<StatefulSetSpecTemplateSpecInitContainersReadinessProbeHttpGetHttpHeaders> httpHeaders,
                                                                          final String path,
                                                                          final String port,
                                                                          final String scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<StatefulSetSpecTemplateSpecInitContainersReadinessProbeHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<StatefulSetSpecTemplateSpecInitContainersReadinessProbeHttpGetHttpHeaders> httpHeaders) {
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

    public String getScheme() {
        return scheme;
    }

    public void setScheme(final String scheme) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecInitContainersReadinessProbeHttpGet)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecInitContainersReadinessProbeHttpGet __otherCasted = (StatefulSetSpecTemplateSpecInitContainersReadinessProbeHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
