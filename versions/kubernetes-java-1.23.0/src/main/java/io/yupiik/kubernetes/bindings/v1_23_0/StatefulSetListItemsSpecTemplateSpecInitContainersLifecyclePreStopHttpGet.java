package io.yupiik.kubernetes.bindings.v1_23_0;

import java.util.List;
import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGet {
    private String host;
    private List<StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGetScheme scheme;

    public StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGet() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGet(final String host,
                                                                                     final List<StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGetHttpHeaders> httpHeaders,
                                                                                     final String path,
                                                                                     final String port,
                                                                                     final StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGetHttpHeaders> httpHeaders) {
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

    public StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGetScheme scheme) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGet)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGet __otherCasted = (StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
