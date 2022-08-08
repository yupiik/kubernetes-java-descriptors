package io.yupiik.kubernetes.bindings.v1_23_3.v1;

import java.util.List;
import java.util.Objects;

public class PodTemplateTemplateSpecEphemeralContainersStartupProbeHttpGet {
    private String host;
    private List<PodTemplateTemplateSpecEphemeralContainersStartupProbeHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private PodTemplateTemplateSpecEphemeralContainersStartupProbeHttpGetScheme scheme;

    public PodTemplateTemplateSpecEphemeralContainersStartupProbeHttpGet() {
        // no-op
    }

    public PodTemplateTemplateSpecEphemeralContainersStartupProbeHttpGet(final String host,
                                                                         final List<PodTemplateTemplateSpecEphemeralContainersStartupProbeHttpGetHttpHeaders> httpHeaders,
                                                                         final String path,
                                                                         final String port,
                                                                         final PodTemplateTemplateSpecEphemeralContainersStartupProbeHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<PodTemplateTemplateSpecEphemeralContainersStartupProbeHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<PodTemplateTemplateSpecEphemeralContainersStartupProbeHttpGetHttpHeaders> httpHeaders) {
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

    public PodTemplateTemplateSpecEphemeralContainersStartupProbeHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final PodTemplateTemplateSpecEphemeralContainersStartupProbeHttpGetScheme scheme) {
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
        if (!(__other instanceof PodTemplateTemplateSpecEphemeralContainersStartupProbeHttpGet)) {
            return false;
        }
        final PodTemplateTemplateSpecEphemeralContainersStartupProbeHttpGet __otherCasted = (PodTemplateTemplateSpecEphemeralContainersStartupProbeHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
