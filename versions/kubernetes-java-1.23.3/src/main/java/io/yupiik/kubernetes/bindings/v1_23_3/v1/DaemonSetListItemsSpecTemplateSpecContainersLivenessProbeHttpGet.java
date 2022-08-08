package io.yupiik.kubernetes.bindings.v1_23_3.v1;

import java.util.List;
import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecContainersLivenessProbeHttpGet {
    private String host;
    private List<DaemonSetListItemsSpecTemplateSpecContainersLivenessProbeHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private DaemonSetListItemsSpecTemplateSpecContainersLivenessProbeHttpGetScheme scheme;

    public DaemonSetListItemsSpecTemplateSpecContainersLivenessProbeHttpGet() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecContainersLivenessProbeHttpGet(final String host,
                                                                            final List<DaemonSetListItemsSpecTemplateSpecContainersLivenessProbeHttpGetHttpHeaders> httpHeaders,
                                                                            final String path,
                                                                            final String port,
                                                                            final DaemonSetListItemsSpecTemplateSpecContainersLivenessProbeHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<DaemonSetListItemsSpecTemplateSpecContainersLivenessProbeHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<DaemonSetListItemsSpecTemplateSpecContainersLivenessProbeHttpGetHttpHeaders> httpHeaders) {
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

    public DaemonSetListItemsSpecTemplateSpecContainersLivenessProbeHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final DaemonSetListItemsSpecTemplateSpecContainersLivenessProbeHttpGetScheme scheme) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecContainersLivenessProbeHttpGet)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecContainersLivenessProbeHttpGet __otherCasted = (DaemonSetListItemsSpecTemplateSpecContainersLivenessProbeHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
