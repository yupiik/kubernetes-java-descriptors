package io.yupiik.kubernetes.bindings.v1_23_3;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeHttpGet {
    private String host;
    private List<ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeHttpGetScheme scheme;

    public ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeHttpGet() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeHttpGet(final String host,
                                                                                       final List<ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeHttpGetHttpHeaders> httpHeaders,
                                                                                       final String path,
                                                                                       final String port,
                                                                                       final ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeHttpGetHttpHeaders> httpHeaders) {
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

    public ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeHttpGetScheme scheme) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeHttpGet)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeHttpGet __otherCasted = (ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
