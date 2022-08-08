package io.yupiik.kubernetes.bindings.v1_23_2;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecEphemeralContainersReadinessProbeHttpGet {
    private String host;
    private List<ReplicationControllerSpecTemplateSpecEphemeralContainersReadinessProbeHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private ReplicationControllerSpecTemplateSpecEphemeralContainersReadinessProbeHttpGetScheme scheme;

    public ReplicationControllerSpecTemplateSpecEphemeralContainersReadinessProbeHttpGet() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecEphemeralContainersReadinessProbeHttpGet(final String host,
                                                                                         final List<ReplicationControllerSpecTemplateSpecEphemeralContainersReadinessProbeHttpGetHttpHeaders> httpHeaders,
                                                                                         final String path,
                                                                                         final String port,
                                                                                         final ReplicationControllerSpecTemplateSpecEphemeralContainersReadinessProbeHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<ReplicationControllerSpecTemplateSpecEphemeralContainersReadinessProbeHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<ReplicationControllerSpecTemplateSpecEphemeralContainersReadinessProbeHttpGetHttpHeaders> httpHeaders) {
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

    public ReplicationControllerSpecTemplateSpecEphemeralContainersReadinessProbeHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final ReplicationControllerSpecTemplateSpecEphemeralContainersReadinessProbeHttpGetScheme scheme) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecEphemeralContainersReadinessProbeHttpGet)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecEphemeralContainersReadinessProbeHttpGet __otherCasted = (ReplicationControllerSpecTemplateSpecEphemeralContainersReadinessProbeHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
