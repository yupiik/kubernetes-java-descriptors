package io.yupiik.kubernetes.bindings.v1_23_5.v1;

import java.util.List;
import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecEphemeralContainersReadinessProbeHttpGet {
    private String host;
    private List<DeploymentListItemsSpecTemplateSpecEphemeralContainersReadinessProbeHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private DeploymentListItemsSpecTemplateSpecEphemeralContainersReadinessProbeHttpGetScheme scheme;

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersReadinessProbeHttpGet() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersReadinessProbeHttpGet(final String host,
                                                                                       final List<DeploymentListItemsSpecTemplateSpecEphemeralContainersReadinessProbeHttpGetHttpHeaders> httpHeaders,
                                                                                       final String path,
                                                                                       final String port,
                                                                                       final DeploymentListItemsSpecTemplateSpecEphemeralContainersReadinessProbeHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<DeploymentListItemsSpecTemplateSpecEphemeralContainersReadinessProbeHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<DeploymentListItemsSpecTemplateSpecEphemeralContainersReadinessProbeHttpGetHttpHeaders> httpHeaders) {
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

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersReadinessProbeHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final DeploymentListItemsSpecTemplateSpecEphemeralContainersReadinessProbeHttpGetScheme scheme) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecEphemeralContainersReadinessProbeHttpGet)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecEphemeralContainersReadinessProbeHttpGet __otherCasted = (DeploymentListItemsSpecTemplateSpecEphemeralContainersReadinessProbeHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
