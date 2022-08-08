package io.yupiik.kubernetes.bindings.v1_23_5.v1;

import java.util.List;
import java.util.Objects;

public class PodSpecInitContainersLivenessProbeHttpGet {
    private String host;
    private List<PodSpecInitContainersLivenessProbeHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private PodSpecInitContainersLivenessProbeHttpGetScheme scheme;

    public PodSpecInitContainersLivenessProbeHttpGet() {
        // no-op
    }

    public PodSpecInitContainersLivenessProbeHttpGet(final String host,
                                                     final List<PodSpecInitContainersLivenessProbeHttpGetHttpHeaders> httpHeaders,
                                                     final String path,
                                                     final String port,
                                                     final PodSpecInitContainersLivenessProbeHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<PodSpecInitContainersLivenessProbeHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<PodSpecInitContainersLivenessProbeHttpGetHttpHeaders> httpHeaders) {
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

    public PodSpecInitContainersLivenessProbeHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final PodSpecInitContainersLivenessProbeHttpGetScheme scheme) {
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
        if (!(__other instanceof PodSpecInitContainersLivenessProbeHttpGet)) {
            return false;
        }
        final PodSpecInitContainersLivenessProbeHttpGet __otherCasted = (PodSpecInitContainersLivenessProbeHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
