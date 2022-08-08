package io.yupiik.kubernetes.bindings.v1_23_3;

import java.util.List;
import java.util.Objects;

public class PodSpecContainersLivenessProbeHttpGet {
    private String host;
    private List<PodSpecContainersLivenessProbeHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private PodSpecContainersLivenessProbeHttpGetScheme scheme;

    public PodSpecContainersLivenessProbeHttpGet() {
        // no-op
    }

    public PodSpecContainersLivenessProbeHttpGet(final String host,
                                                 final List<PodSpecContainersLivenessProbeHttpGetHttpHeaders> httpHeaders,
                                                 final String path,
                                                 final String port,
                                                 final PodSpecContainersLivenessProbeHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<PodSpecContainersLivenessProbeHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<PodSpecContainersLivenessProbeHttpGetHttpHeaders> httpHeaders) {
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

    public PodSpecContainersLivenessProbeHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final PodSpecContainersLivenessProbeHttpGetScheme scheme) {
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
        if (!(__other instanceof PodSpecContainersLivenessProbeHttpGet)) {
            return false;
        }
        final PodSpecContainersLivenessProbeHttpGet __otherCasted = (PodSpecContainersLivenessProbeHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
