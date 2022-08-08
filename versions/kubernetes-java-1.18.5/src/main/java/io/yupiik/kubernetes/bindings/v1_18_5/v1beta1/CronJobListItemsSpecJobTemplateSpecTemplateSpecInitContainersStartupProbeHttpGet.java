package io.yupiik.kubernetes.bindings.v1_18_5.v1beta1;

import java.util.List;
import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersStartupProbeHttpGet {
    private String host;
    private List<CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersStartupProbeHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private String scheme;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersStartupProbeHttpGet() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersStartupProbeHttpGet(final String host,
                                                                                            final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersStartupProbeHttpGetHttpHeaders> httpHeaders,
                                                                                            final String path,
                                                                                            final String port,
                                                                                            final String scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersStartupProbeHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersStartupProbeHttpGetHttpHeaders> httpHeaders) {
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

    public String getScheme() {
        return scheme;
    }

    public void setScheme(final String scheme) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersStartupProbeHttpGet)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersStartupProbeHttpGet __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersStartupProbeHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
