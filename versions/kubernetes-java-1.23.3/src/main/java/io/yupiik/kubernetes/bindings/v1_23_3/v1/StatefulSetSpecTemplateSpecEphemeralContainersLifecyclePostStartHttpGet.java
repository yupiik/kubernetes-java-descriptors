package io.yupiik.kubernetes.bindings.v1_23_3.v1;

import java.util.List;
import java.util.Objects;

public class StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet {
    private String host;
    private List<StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGetScheme scheme;

    public StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet(final String host,
                                                                                   final List<StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGetHttpHeaders> httpHeaders,
                                                                                   final String path,
                                                                                   final String port,
                                                                                   final StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGetHttpHeaders> httpHeaders) {
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

    public StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGetScheme scheme) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet __otherCasted = (StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
