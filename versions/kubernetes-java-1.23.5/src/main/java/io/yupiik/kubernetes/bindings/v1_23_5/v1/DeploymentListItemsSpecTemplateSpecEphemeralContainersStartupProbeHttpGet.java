package io.yupiik.kubernetes.bindings.v1_23_5.v1;

import java.util.List;
import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecEphemeralContainersStartupProbeHttpGet {
    private String host;
    private List<DeploymentListItemsSpecTemplateSpecEphemeralContainersStartupProbeHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private DeploymentListItemsSpecTemplateSpecEphemeralContainersStartupProbeHttpGetScheme scheme;

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersStartupProbeHttpGet() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersStartupProbeHttpGet(final String host,
                                                                                     final List<DeploymentListItemsSpecTemplateSpecEphemeralContainersStartupProbeHttpGetHttpHeaders> httpHeaders,
                                                                                     final String path,
                                                                                     final String port,
                                                                                     final DeploymentListItemsSpecTemplateSpecEphemeralContainersStartupProbeHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<DeploymentListItemsSpecTemplateSpecEphemeralContainersStartupProbeHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<DeploymentListItemsSpecTemplateSpecEphemeralContainersStartupProbeHttpGetHttpHeaders> httpHeaders) {
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

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersStartupProbeHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final DeploymentListItemsSpecTemplateSpecEphemeralContainersStartupProbeHttpGetScheme scheme) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecEphemeralContainersStartupProbeHttpGet)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecEphemeralContainersStartupProbeHttpGet __otherCasted = (DeploymentListItemsSpecTemplateSpecEphemeralContainersStartupProbeHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
