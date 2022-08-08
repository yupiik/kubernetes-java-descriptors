package io.yupiik.kubernetes.bindings.v1_23_1;

import java.util.List;
import java.util.Objects;

public class DaemonSetSpecTemplateSpecContainersReadinessProbeHttpGet {
    private String host;
    private List<DaemonSetSpecTemplateSpecContainersReadinessProbeHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private DaemonSetSpecTemplateSpecContainersReadinessProbeHttpGetScheme scheme;

    public DaemonSetSpecTemplateSpecContainersReadinessProbeHttpGet() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecContainersReadinessProbeHttpGet(final String host,
                                                                    final List<DaemonSetSpecTemplateSpecContainersReadinessProbeHttpGetHttpHeaders> httpHeaders,
                                                                    final String path,
                                                                    final String port,
                                                                    final DaemonSetSpecTemplateSpecContainersReadinessProbeHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<DaemonSetSpecTemplateSpecContainersReadinessProbeHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<DaemonSetSpecTemplateSpecContainersReadinessProbeHttpGetHttpHeaders> httpHeaders) {
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

    public DaemonSetSpecTemplateSpecContainersReadinessProbeHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final DaemonSetSpecTemplateSpecContainersReadinessProbeHttpGetScheme scheme) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecContainersReadinessProbeHttpGet)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecContainersReadinessProbeHttpGet __otherCasted = (DaemonSetSpecTemplateSpecContainersReadinessProbeHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
