package io.yupiik.kubernetes.bindings.v1_23_2;

import java.util.List;
import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecInitContainersStartupProbeHttpGet {
    private String host;
    private List<DeploymentListItemsSpecTemplateSpecInitContainersStartupProbeHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private DeploymentListItemsSpecTemplateSpecInitContainersStartupProbeHttpGetScheme scheme;

    public DeploymentListItemsSpecTemplateSpecInitContainersStartupProbeHttpGet() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecInitContainersStartupProbeHttpGet(final String host,
                                                                                final List<DeploymentListItemsSpecTemplateSpecInitContainersStartupProbeHttpGetHttpHeaders> httpHeaders,
                                                                                final String path,
                                                                                final String port,
                                                                                final DeploymentListItemsSpecTemplateSpecInitContainersStartupProbeHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<DeploymentListItemsSpecTemplateSpecInitContainersStartupProbeHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<DeploymentListItemsSpecTemplateSpecInitContainersStartupProbeHttpGetHttpHeaders> httpHeaders) {
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

    public DeploymentListItemsSpecTemplateSpecInitContainersStartupProbeHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final DeploymentListItemsSpecTemplateSpecInitContainersStartupProbeHttpGetScheme scheme) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecInitContainersStartupProbeHttpGet)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecInitContainersStartupProbeHttpGet __otherCasted = (DeploymentListItemsSpecTemplateSpecInitContainersStartupProbeHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
