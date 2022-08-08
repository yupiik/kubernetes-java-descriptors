package io.yupiik.kubernetes.bindings.v1_23_2;

import java.util.List;
import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersStartupProbeHttpGet {
    private String host;
    private List<CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersStartupProbeHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersStartupProbeHttpGetScheme scheme;

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersStartupProbeHttpGet() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersStartupProbeHttpGet(final String host,
                                                                                        final List<CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersStartupProbeHttpGetHttpHeaders> httpHeaders,
                                                                                        final String path,
                                                                                        final String port,
                                                                                        final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersStartupProbeHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersStartupProbeHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersStartupProbeHttpGetHttpHeaders> httpHeaders) {
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

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersStartupProbeHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersStartupProbeHttpGetScheme scheme) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersStartupProbeHttpGet)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersStartupProbeHttpGet __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersStartupProbeHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
