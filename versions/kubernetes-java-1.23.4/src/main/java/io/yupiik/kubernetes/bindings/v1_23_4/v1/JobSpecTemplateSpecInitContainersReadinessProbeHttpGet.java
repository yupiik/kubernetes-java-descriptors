package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import java.util.List;
import java.util.Objects;

public class JobSpecTemplateSpecInitContainersReadinessProbeHttpGet {
    private String host;
    private List<JobSpecTemplateSpecInitContainersReadinessProbeHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private JobSpecTemplateSpecInitContainersReadinessProbeHttpGetScheme scheme;

    public JobSpecTemplateSpecInitContainersReadinessProbeHttpGet() {
        // no-op
    }

    public JobSpecTemplateSpecInitContainersReadinessProbeHttpGet(final String host,
                                                                  final List<JobSpecTemplateSpecInitContainersReadinessProbeHttpGetHttpHeaders> httpHeaders,
                                                                  final String path,
                                                                  final String port,
                                                                  final JobSpecTemplateSpecInitContainersReadinessProbeHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<JobSpecTemplateSpecInitContainersReadinessProbeHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<JobSpecTemplateSpecInitContainersReadinessProbeHttpGetHttpHeaders> httpHeaders) {
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

    public JobSpecTemplateSpecInitContainersReadinessProbeHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final JobSpecTemplateSpecInitContainersReadinessProbeHttpGetScheme scheme) {
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
        if (!(__other instanceof JobSpecTemplateSpecInitContainersReadinessProbeHttpGet)) {
            return false;
        }
        final JobSpecTemplateSpecInitContainersReadinessProbeHttpGet __otherCasted = (JobSpecTemplateSpecInitContainersReadinessProbeHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
