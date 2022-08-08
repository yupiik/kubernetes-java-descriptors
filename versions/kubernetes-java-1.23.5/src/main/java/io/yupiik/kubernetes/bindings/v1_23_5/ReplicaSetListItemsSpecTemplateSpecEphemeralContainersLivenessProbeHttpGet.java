package io.yupiik.kubernetes.bindings.v1_23_5;

import java.util.List;
import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeHttpGet {
    private String host;
    private List<ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeHttpGetScheme scheme;

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeHttpGet() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeHttpGet(final String host,
                                                                                      final List<ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeHttpGetHttpHeaders> httpHeaders,
                                                                                      final String path,
                                                                                      final String port,
                                                                                      final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeHttpGetHttpHeaders> httpHeaders) {
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

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeHttpGetScheme scheme) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeHttpGet)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeHttpGet __otherCasted = (ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
