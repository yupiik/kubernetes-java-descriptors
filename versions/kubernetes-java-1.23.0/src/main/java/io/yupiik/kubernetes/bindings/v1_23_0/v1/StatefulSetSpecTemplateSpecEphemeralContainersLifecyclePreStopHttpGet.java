package io.yupiik.kubernetes.bindings.v1_23_0.v1;

import java.util.List;
import java.util.Objects;

public class StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet {
    private String host;
    private List<StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGetScheme scheme;

    public StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet(final String host,
                                                                                 final List<StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGetHttpHeaders> httpHeaders,
                                                                                 final String path,
                                                                                 final String port,
                                                                                 final StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGetHttpHeaders> httpHeaders) {
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

    public StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGetScheme scheme) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet __otherCasted = (StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
