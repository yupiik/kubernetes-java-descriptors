package io.yupiik.kubernetes.bindings.v1_21_0.v1;

import java.util.List;
import java.util.Objects;

public class PodTemplateListItemsTemplateSpecInitContainersLivenessProbeHttpGet {
    private String host;
    private List<PodTemplateListItemsTemplateSpecInitContainersLivenessProbeHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private String scheme;

    public PodTemplateListItemsTemplateSpecInitContainersLivenessProbeHttpGet() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecInitContainersLivenessProbeHttpGet(final String host,
                                                                              final List<PodTemplateListItemsTemplateSpecInitContainersLivenessProbeHttpGetHttpHeaders> httpHeaders,
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

    public List<PodTemplateListItemsTemplateSpecInitContainersLivenessProbeHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<PodTemplateListItemsTemplateSpecInitContainersLivenessProbeHttpGetHttpHeaders> httpHeaders) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecInitContainersLivenessProbeHttpGet)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecInitContainersLivenessProbeHttpGet __otherCasted = (PodTemplateListItemsTemplateSpecInitContainersLivenessProbeHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
