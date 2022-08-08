package io.yupiik.kubernetes.bindings.v1_23_3.v1;

import java.util.List;
import java.util.Objects;

public class ReplicaSetSpecTemplateSpecEphemeralContainersReadinessProbeHttpGet {
    private String host;
    private List<ReplicaSetSpecTemplateSpecEphemeralContainersReadinessProbeHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private ReplicaSetSpecTemplateSpecEphemeralContainersReadinessProbeHttpGetScheme scheme;

    public ReplicaSetSpecTemplateSpecEphemeralContainersReadinessProbeHttpGet() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecEphemeralContainersReadinessProbeHttpGet(final String host,
                                                                              final List<ReplicaSetSpecTemplateSpecEphemeralContainersReadinessProbeHttpGetHttpHeaders> httpHeaders,
                                                                              final String path,
                                                                              final String port,
                                                                              final ReplicaSetSpecTemplateSpecEphemeralContainersReadinessProbeHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<ReplicaSetSpecTemplateSpecEphemeralContainersReadinessProbeHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<ReplicaSetSpecTemplateSpecEphemeralContainersReadinessProbeHttpGetHttpHeaders> httpHeaders) {
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

    public ReplicaSetSpecTemplateSpecEphemeralContainersReadinessProbeHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final ReplicaSetSpecTemplateSpecEphemeralContainersReadinessProbeHttpGetScheme scheme) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecEphemeralContainersReadinessProbeHttpGet)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecEphemeralContainersReadinessProbeHttpGet __otherCasted = (ReplicaSetSpecTemplateSpecEphemeralContainersReadinessProbeHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
