package io.yupiik.kubernetes.bindings.v1_18_18;

import java.util.List;
import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet {
    private String host;
    private List<StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private String scheme;

    public StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet(final String host,
                                                                                   final List<StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGetHttpHeaders> httpHeaders,
                                                                                   final String path,
                                                                                   final String port,
                                                                                   final String scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGetHttpHeaders> httpHeaders) {
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

    public String getScheme() {
        return scheme;
    }

    public void setScheme(final String scheme) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet __otherCasted = (StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
