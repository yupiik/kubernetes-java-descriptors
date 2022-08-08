package io.yupiik.kubernetes.bindings.v1_23_3.v1;

import java.util.List;
import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbeHttpGet {
    private String host;
    private List<CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbeHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbeHttpGetScheme scheme;

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbeHttpGet() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbeHttpGet(final String host,
                                                                                         final List<CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbeHttpGetHttpHeaders> httpHeaders,
                                                                                         final String path,
                                                                                         final String port,
                                                                                         final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbeHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbeHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbeHttpGetHttpHeaders> httpHeaders) {
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

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbeHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbeHttpGetScheme scheme) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbeHttpGet)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbeHttpGet __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbeHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
