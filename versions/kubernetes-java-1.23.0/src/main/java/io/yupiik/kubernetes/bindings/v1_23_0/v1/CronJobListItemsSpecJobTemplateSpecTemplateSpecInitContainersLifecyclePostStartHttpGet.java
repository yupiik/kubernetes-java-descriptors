package io.yupiik.kubernetes.bindings.v1_23_0.v1;

import java.util.List;
import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartHttpGet {
    private String host;
    private List<CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartHttpGetScheme scheme;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartHttpGet() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartHttpGet(final String host,
                                                                                                  final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartHttpGetHttpHeaders> httpHeaders,
                                                                                                  final String path,
                                                                                                  final String port,
                                                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartHttpGetHttpHeaders> httpHeaders) {
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

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartHttpGetScheme scheme) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartHttpGet)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartHttpGet __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
