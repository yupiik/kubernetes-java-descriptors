package io.yupiik.kubernetes.bindings.v1_23_3.v1;

import java.util.List;
import java.util.Objects;

public class PodSpecContainersReadinessProbeHttpGet {
    private String host;
    private List<PodSpecContainersReadinessProbeHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private PodSpecContainersReadinessProbeHttpGetScheme scheme;

    public PodSpecContainersReadinessProbeHttpGet() {
        // no-op
    }

    public PodSpecContainersReadinessProbeHttpGet(final String host,
                                                  final List<PodSpecContainersReadinessProbeHttpGetHttpHeaders> httpHeaders,
                                                  final String path,
                                                  final String port,
                                                  final PodSpecContainersReadinessProbeHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<PodSpecContainersReadinessProbeHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<PodSpecContainersReadinessProbeHttpGetHttpHeaders> httpHeaders) {
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

    public PodSpecContainersReadinessProbeHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final PodSpecContainersReadinessProbeHttpGetScheme scheme) {
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
        if (!(__other instanceof PodSpecContainersReadinessProbeHttpGet)) {
            return false;
        }
        final PodSpecContainersReadinessProbeHttpGet __otherCasted = (PodSpecContainersReadinessProbeHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
