package io.yupiik.kubernetes.bindings.v1_23_3.v1;

import java.util.List;
import java.util.Objects;

public class JobListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGet {
    private String host;
    private List<JobListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private JobListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGetScheme scheme;

    public JobListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGet() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGet(final String host,
                                                                         final List<JobListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGetHttpHeaders> httpHeaders,
                                                                         final String path,
                                                                         final String port,
                                                                         final JobListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<JobListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<JobListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGetHttpHeaders> httpHeaders) {
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

    public JobListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final JobListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGetScheme scheme) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGet)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGet __otherCasted = (JobListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
