package io.yupiik.kubernetes.bindings.v1_23_4;

import java.util.List;
import java.util.Objects;

public class DaemonSetSpecTemplateSpecInitContainersStartupProbeHttpGet {
    private String host;
    private List<DaemonSetSpecTemplateSpecInitContainersStartupProbeHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private DaemonSetSpecTemplateSpecInitContainersStartupProbeHttpGetScheme scheme;

    public DaemonSetSpecTemplateSpecInitContainersStartupProbeHttpGet() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecInitContainersStartupProbeHttpGet(final String host,
                                                                      final List<DaemonSetSpecTemplateSpecInitContainersStartupProbeHttpGetHttpHeaders> httpHeaders,
                                                                      final String path,
                                                                      final String port,
                                                                      final DaemonSetSpecTemplateSpecInitContainersStartupProbeHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<DaemonSetSpecTemplateSpecInitContainersStartupProbeHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<DaemonSetSpecTemplateSpecInitContainersStartupProbeHttpGetHttpHeaders> httpHeaders) {
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

    public DaemonSetSpecTemplateSpecInitContainersStartupProbeHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final DaemonSetSpecTemplateSpecInitContainersStartupProbeHttpGetScheme scheme) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecInitContainersStartupProbeHttpGet)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecInitContainersStartupProbeHttpGet __otherCasted = (DaemonSetSpecTemplateSpecInitContainersStartupProbeHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
