package io.yupiik.kubernetes.bindings.v1_23_0.v1;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecInitContainersLivenessProbeHttpGet {
    private String host;
    private List<ReplicationControllerSpecTemplateSpecInitContainersLivenessProbeHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private ReplicationControllerSpecTemplateSpecInitContainersLivenessProbeHttpGetScheme scheme;

    public ReplicationControllerSpecTemplateSpecInitContainersLivenessProbeHttpGet() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecInitContainersLivenessProbeHttpGet(final String host,
                                                                                   final List<ReplicationControllerSpecTemplateSpecInitContainersLivenessProbeHttpGetHttpHeaders> httpHeaders,
                                                                                   final String path,
                                                                                   final String port,
                                                                                   final ReplicationControllerSpecTemplateSpecInitContainersLivenessProbeHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<ReplicationControllerSpecTemplateSpecInitContainersLivenessProbeHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<ReplicationControllerSpecTemplateSpecInitContainersLivenessProbeHttpGetHttpHeaders> httpHeaders) {
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

    public ReplicationControllerSpecTemplateSpecInitContainersLivenessProbeHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final ReplicationControllerSpecTemplateSpecInitContainersLivenessProbeHttpGetScheme scheme) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecInitContainersLivenessProbeHttpGet)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecInitContainersLivenessProbeHttpGet __otherCasted = (ReplicationControllerSpecTemplateSpecInitContainersLivenessProbeHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
