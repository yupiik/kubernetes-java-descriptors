package io.yupiik.kubernetes.bindings.v1_23_2;

import java.util.List;
import java.util.Objects;

public class ReplicaSetSpecTemplateSpecInitContainersStartupProbeHttpGet {
    private String host;
    private List<ReplicaSetSpecTemplateSpecInitContainersStartupProbeHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private ReplicaSetSpecTemplateSpecInitContainersStartupProbeHttpGetScheme scheme;

    public ReplicaSetSpecTemplateSpecInitContainersStartupProbeHttpGet() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecInitContainersStartupProbeHttpGet(final String host,
                                                                       final List<ReplicaSetSpecTemplateSpecInitContainersStartupProbeHttpGetHttpHeaders> httpHeaders,
                                                                       final String path,
                                                                       final String port,
                                                                       final ReplicaSetSpecTemplateSpecInitContainersStartupProbeHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<ReplicaSetSpecTemplateSpecInitContainersStartupProbeHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<ReplicaSetSpecTemplateSpecInitContainersStartupProbeHttpGetHttpHeaders> httpHeaders) {
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

    public ReplicaSetSpecTemplateSpecInitContainersStartupProbeHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final ReplicaSetSpecTemplateSpecInitContainersStartupProbeHttpGetScheme scheme) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecInitContainersStartupProbeHttpGet)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecInitContainersStartupProbeHttpGet __otherCasted = (ReplicaSetSpecTemplateSpecInitContainersStartupProbeHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
