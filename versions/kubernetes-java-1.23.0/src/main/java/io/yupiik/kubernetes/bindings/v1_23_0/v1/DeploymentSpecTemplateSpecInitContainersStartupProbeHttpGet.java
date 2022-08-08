package io.yupiik.kubernetes.bindings.v1_23_0.v1;

import java.util.List;
import java.util.Objects;

public class DeploymentSpecTemplateSpecInitContainersStartupProbeHttpGet {
    private String host;
    private List<DeploymentSpecTemplateSpecInitContainersStartupProbeHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private DeploymentSpecTemplateSpecInitContainersStartupProbeHttpGetScheme scheme;

    public DeploymentSpecTemplateSpecInitContainersStartupProbeHttpGet() {
        // no-op
    }

    public DeploymentSpecTemplateSpecInitContainersStartupProbeHttpGet(final String host,
                                                                       final List<DeploymentSpecTemplateSpecInitContainersStartupProbeHttpGetHttpHeaders> httpHeaders,
                                                                       final String path,
                                                                       final String port,
                                                                       final DeploymentSpecTemplateSpecInitContainersStartupProbeHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<DeploymentSpecTemplateSpecInitContainersStartupProbeHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<DeploymentSpecTemplateSpecInitContainersStartupProbeHttpGetHttpHeaders> httpHeaders) {
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

    public DeploymentSpecTemplateSpecInitContainersStartupProbeHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final DeploymentSpecTemplateSpecInitContainersStartupProbeHttpGetScheme scheme) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecInitContainersStartupProbeHttpGet)) {
            return false;
        }
        final DeploymentSpecTemplateSpecInitContainersStartupProbeHttpGet __otherCasted = (DeploymentSpecTemplateSpecInitContainersStartupProbeHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
