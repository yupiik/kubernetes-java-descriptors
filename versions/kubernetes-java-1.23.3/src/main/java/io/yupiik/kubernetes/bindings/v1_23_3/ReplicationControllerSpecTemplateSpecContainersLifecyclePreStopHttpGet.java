package io.yupiik.kubernetes.bindings.v1_23_3;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecContainersLifecyclePreStopHttpGet {
    private String host;
    private List<ReplicationControllerSpecTemplateSpecContainersLifecyclePreStopHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private ReplicationControllerSpecTemplateSpecContainersLifecyclePreStopHttpGetScheme scheme;

    public ReplicationControllerSpecTemplateSpecContainersLifecyclePreStopHttpGet() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecContainersLifecyclePreStopHttpGet(final String host,
                                                                                  final List<ReplicationControllerSpecTemplateSpecContainersLifecyclePreStopHttpGetHttpHeaders> httpHeaders,
                                                                                  final String path,
                                                                                  final String port,
                                                                                  final ReplicationControllerSpecTemplateSpecContainersLifecyclePreStopHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<ReplicationControllerSpecTemplateSpecContainersLifecyclePreStopHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<ReplicationControllerSpecTemplateSpecContainersLifecyclePreStopHttpGetHttpHeaders> httpHeaders) {
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

    public ReplicationControllerSpecTemplateSpecContainersLifecyclePreStopHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final ReplicationControllerSpecTemplateSpecContainersLifecyclePreStopHttpGetScheme scheme) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecContainersLifecyclePreStopHttpGet)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecContainersLifecyclePreStopHttpGet __otherCasted = (ReplicationControllerSpecTemplateSpecContainersLifecyclePreStopHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
