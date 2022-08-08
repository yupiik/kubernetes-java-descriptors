package io.yupiik.kubernetes.bindings.v1_23_2.v1;

import java.util.List;
import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecInitContainersLivenessProbeHttpGet {
    private String host;
    private List<DeploymentListItemsSpecTemplateSpecInitContainersLivenessProbeHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private DeploymentListItemsSpecTemplateSpecInitContainersLivenessProbeHttpGetScheme scheme;

    public DeploymentListItemsSpecTemplateSpecInitContainersLivenessProbeHttpGet() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecInitContainersLivenessProbeHttpGet(final String host,
                                                                                 final List<DeploymentListItemsSpecTemplateSpecInitContainersLivenessProbeHttpGetHttpHeaders> httpHeaders,
                                                                                 final String path,
                                                                                 final String port,
                                                                                 final DeploymentListItemsSpecTemplateSpecInitContainersLivenessProbeHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<DeploymentListItemsSpecTemplateSpecInitContainersLivenessProbeHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<DeploymentListItemsSpecTemplateSpecInitContainersLivenessProbeHttpGetHttpHeaders> httpHeaders) {
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

    public DeploymentListItemsSpecTemplateSpecInitContainersLivenessProbeHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final DeploymentListItemsSpecTemplateSpecInitContainersLivenessProbeHttpGetScheme scheme) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecInitContainersLivenessProbeHttpGet)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecInitContainersLivenessProbeHttpGet __otherCasted = (DeploymentListItemsSpecTemplateSpecInitContainersLivenessProbeHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
