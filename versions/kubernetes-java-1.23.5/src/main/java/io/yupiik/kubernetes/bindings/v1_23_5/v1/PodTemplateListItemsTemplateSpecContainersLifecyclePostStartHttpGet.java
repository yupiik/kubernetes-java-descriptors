package io.yupiik.kubernetes.bindings.v1_23_5.v1;

import java.util.List;
import java.util.Objects;

public class PodTemplateListItemsTemplateSpecContainersLifecyclePostStartHttpGet {
    private String host;
    private List<PodTemplateListItemsTemplateSpecContainersLifecyclePostStartHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private PodTemplateListItemsTemplateSpecContainersLifecyclePostStartHttpGetScheme scheme;

    public PodTemplateListItemsTemplateSpecContainersLifecyclePostStartHttpGet() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecContainersLifecyclePostStartHttpGet(final String host,
                                                                               final List<PodTemplateListItemsTemplateSpecContainersLifecyclePostStartHttpGetHttpHeaders> httpHeaders,
                                                                               final String path,
                                                                               final String port,
                                                                               final PodTemplateListItemsTemplateSpecContainersLifecyclePostStartHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<PodTemplateListItemsTemplateSpecContainersLifecyclePostStartHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<PodTemplateListItemsTemplateSpecContainersLifecyclePostStartHttpGetHttpHeaders> httpHeaders) {
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

    public PodTemplateListItemsTemplateSpecContainersLifecyclePostStartHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final PodTemplateListItemsTemplateSpecContainersLifecyclePostStartHttpGetScheme scheme) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecContainersLifecyclePostStartHttpGet)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecContainersLifecyclePostStartHttpGet __otherCasted = (PodTemplateListItemsTemplateSpecContainersLifecyclePostStartHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
