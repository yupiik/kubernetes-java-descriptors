package io.yupiik.kubernetes.bindings.v1_23_1;

import java.util.List;
import java.util.Objects;

public class JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet {
    private String host;
    private List<JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGetScheme scheme;

    public JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet(final String host,
                                                                                  final List<JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGetHttpHeaders> httpHeaders,
                                                                                  final String path,
                                                                                  final String port,
                                                                                  final JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGetHttpHeaders> httpHeaders) {
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

    public JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGetScheme scheme) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet __otherCasted = (JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
