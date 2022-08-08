package io.yupiik.kubernetes.bindings.v1_23_1.v1;

import java.util.List;
import java.util.Objects;

public class StatefulSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGet {
    private String host;
    private List<StatefulSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private StatefulSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGetScheme scheme;

    public StatefulSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGet() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGet(final String host,
                                                                              final List<StatefulSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGetHttpHeaders> httpHeaders,
                                                                              final String path,
                                                                              final String port,
                                                                              final StatefulSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<StatefulSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<StatefulSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGetHttpHeaders> httpHeaders) {
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

    public StatefulSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final StatefulSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGetScheme scheme) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGet)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGet __otherCasted = (StatefulSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
