package io.yupiik.kubernetes.bindings.v1_23_3;

import java.util.List;
import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet {
    private String host;
    private List<CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGetScheme scheme;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet(final String host,
                                                                                                       final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGetHttpHeaders> httpHeaders,
                                                                                                       final String path,
                                                                                                       final String port,
                                                                                                       final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGetHttpHeaders> httpHeaders) {
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

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGetScheme scheme) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
