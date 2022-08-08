package io.yupiik.kubernetes.bindings.v1_23_1.v1;

import java.util.List;
import java.util.Objects;

public class DaemonSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGet {
    private String host;
    private List<DaemonSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private DaemonSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGetScheme scheme;

    public DaemonSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGet() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGet(final String host,
                                                                            final List<DaemonSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGetHttpHeaders> httpHeaders,
                                                                            final String path,
                                                                            final String port,
                                                                            final DaemonSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<DaemonSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<DaemonSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGetHttpHeaders> httpHeaders) {
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

    public DaemonSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final DaemonSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGetScheme scheme) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGet)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGet __otherCasted = (DaemonSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
