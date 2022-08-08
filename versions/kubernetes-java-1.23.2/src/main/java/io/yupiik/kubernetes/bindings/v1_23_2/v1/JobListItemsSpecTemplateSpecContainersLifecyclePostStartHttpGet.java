package io.yupiik.kubernetes.bindings.v1_23_2.v1;

import java.util.List;
import java.util.Objects;

public class JobListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet {
    private String host;
    private List<JobListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private JobListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGetScheme scheme;

    public JobListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet(final String host,
                                                                           final List<JobListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGetHttpHeaders> httpHeaders,
                                                                           final String path,
                                                                           final String port,
                                                                           final JobListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<JobListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<JobListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGetHttpHeaders> httpHeaders) {
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

    public JobListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final JobListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGetScheme scheme) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet __otherCasted = (JobListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
