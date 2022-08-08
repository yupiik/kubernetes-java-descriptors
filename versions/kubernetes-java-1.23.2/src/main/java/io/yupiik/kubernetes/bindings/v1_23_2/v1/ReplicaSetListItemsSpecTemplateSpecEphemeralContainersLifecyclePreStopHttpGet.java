package io.yupiik.kubernetes.bindings.v1_23_2.v1;

import java.util.List;
import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet {
    private String host;
    private List<ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGetScheme scheme;

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet(final String host,
                                                                                         final List<ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGetHttpHeaders> httpHeaders,
                                                                                         final String path,
                                                                                         final String port,
                                                                                         final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGetHttpHeaders> httpHeaders) {
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

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGetScheme scheme) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet __otherCasted = (ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
