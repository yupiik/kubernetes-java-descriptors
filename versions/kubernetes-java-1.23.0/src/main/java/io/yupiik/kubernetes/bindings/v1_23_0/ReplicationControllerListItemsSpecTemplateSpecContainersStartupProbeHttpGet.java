package io.yupiik.kubernetes.bindings.v1_23_0;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecContainersStartupProbeHttpGet {
    private String host;
    private List<ReplicationControllerListItemsSpecTemplateSpecContainersStartupProbeHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private ReplicationControllerListItemsSpecTemplateSpecContainersStartupProbeHttpGetScheme scheme;

    public ReplicationControllerListItemsSpecTemplateSpecContainersStartupProbeHttpGet() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecContainersStartupProbeHttpGet(final String host,
                                                                                       final List<ReplicationControllerListItemsSpecTemplateSpecContainersStartupProbeHttpGetHttpHeaders> httpHeaders,
                                                                                       final String path,
                                                                                       final String port,
                                                                                       final ReplicationControllerListItemsSpecTemplateSpecContainersStartupProbeHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<ReplicationControllerListItemsSpecTemplateSpecContainersStartupProbeHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<ReplicationControllerListItemsSpecTemplateSpecContainersStartupProbeHttpGetHttpHeaders> httpHeaders) {
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

    public ReplicationControllerListItemsSpecTemplateSpecContainersStartupProbeHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final ReplicationControllerListItemsSpecTemplateSpecContainersStartupProbeHttpGetScheme scheme) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecContainersStartupProbeHttpGet)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecContainersStartupProbeHttpGet __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecContainersStartupProbeHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
