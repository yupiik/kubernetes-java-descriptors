package io.yupiik.kubernetes.bindings.v1_23_4;

import java.util.List;
import java.util.Objects;

public class PodTemplateListItemsTemplateSpecInitContainersReadinessProbeHttpGet {
    private String host;
    private List<PodTemplateListItemsTemplateSpecInitContainersReadinessProbeHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private PodTemplateListItemsTemplateSpecInitContainersReadinessProbeHttpGetScheme scheme;

    public PodTemplateListItemsTemplateSpecInitContainersReadinessProbeHttpGet() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecInitContainersReadinessProbeHttpGet(final String host,
                                                                               final List<PodTemplateListItemsTemplateSpecInitContainersReadinessProbeHttpGetHttpHeaders> httpHeaders,
                                                                               final String path,
                                                                               final String port,
                                                                               final PodTemplateListItemsTemplateSpecInitContainersReadinessProbeHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<PodTemplateListItemsTemplateSpecInitContainersReadinessProbeHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<PodTemplateListItemsTemplateSpecInitContainersReadinessProbeHttpGetHttpHeaders> httpHeaders) {
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

    public PodTemplateListItemsTemplateSpecInitContainersReadinessProbeHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final PodTemplateListItemsTemplateSpecInitContainersReadinessProbeHttpGetScheme scheme) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecInitContainersReadinessProbeHttpGet)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecInitContainersReadinessProbeHttpGet __otherCasted = (PodTemplateListItemsTemplateSpecInitContainersReadinessProbeHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
