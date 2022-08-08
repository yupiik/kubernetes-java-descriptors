package io.yupiik.kubernetes.bindings.v1_23_5.v1;

import java.util.List;
import java.util.Objects;

public class PodListItemsSpecContainersLifecyclePostStartHttpGet {
    private String host;
    private List<PodListItemsSpecContainersLifecyclePostStartHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private PodListItemsSpecContainersLifecyclePostStartHttpGetScheme scheme;

    public PodListItemsSpecContainersLifecyclePostStartHttpGet() {
        // no-op
    }

    public PodListItemsSpecContainersLifecyclePostStartHttpGet(final String host,
                                                               final List<PodListItemsSpecContainersLifecyclePostStartHttpGetHttpHeaders> httpHeaders,
                                                               final String path,
                                                               final String port,
                                                               final PodListItemsSpecContainersLifecyclePostStartHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<PodListItemsSpecContainersLifecyclePostStartHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<PodListItemsSpecContainersLifecyclePostStartHttpGetHttpHeaders> httpHeaders) {
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

    public PodListItemsSpecContainersLifecyclePostStartHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final PodListItemsSpecContainersLifecyclePostStartHttpGetScheme scheme) {
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
        if (!(__other instanceof PodListItemsSpecContainersLifecyclePostStartHttpGet)) {
            return false;
        }
        final PodListItemsSpecContainersLifecyclePostStartHttpGet __otherCasted = (PodListItemsSpecContainersLifecyclePostStartHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
