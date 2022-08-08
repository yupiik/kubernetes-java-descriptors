package io.yupiik.kubernetes.bindings.v1_23_4;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet {
    private String host;
    private List<ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGetScheme scheme;

    public ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet(final String host,
                                                                                             final List<ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGetHttpHeaders> httpHeaders,
                                                                                             final String path,
                                                                                             final String port,
                                                                                             final ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGetHttpHeaders> httpHeaders) {
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

    public ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGetScheme scheme) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
