package io.yupiik.kubernetes.bindings.v1_23_2;

import java.util.List;
import java.util.Objects;

public class PodTemplateListItemsTemplateSpecContainersLifecyclePreStopHttpGet {
    private String host;
    private List<PodTemplateListItemsTemplateSpecContainersLifecyclePreStopHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private PodTemplateListItemsTemplateSpecContainersLifecyclePreStopHttpGetScheme scheme;

    public PodTemplateListItemsTemplateSpecContainersLifecyclePreStopHttpGet() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecContainersLifecyclePreStopHttpGet(final String host,
                                                                             final List<PodTemplateListItemsTemplateSpecContainersLifecyclePreStopHttpGetHttpHeaders> httpHeaders,
                                                                             final String path,
                                                                             final String port,
                                                                             final PodTemplateListItemsTemplateSpecContainersLifecyclePreStopHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<PodTemplateListItemsTemplateSpecContainersLifecyclePreStopHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<PodTemplateListItemsTemplateSpecContainersLifecyclePreStopHttpGetHttpHeaders> httpHeaders) {
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

    public PodTemplateListItemsTemplateSpecContainersLifecyclePreStopHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final PodTemplateListItemsTemplateSpecContainersLifecyclePreStopHttpGetScheme scheme) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecContainersLifecyclePreStopHttpGet)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecContainersLifecyclePreStopHttpGet __otherCasted = (PodTemplateListItemsTemplateSpecContainersLifecyclePreStopHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
