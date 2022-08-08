package io.yupiik.kubernetes.bindings.v1_23_3.v1;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecInitContainersReadinessProbeHttpGet {
    private String host;
    private List<ReplicationControllerListItemsSpecTemplateSpecInitContainersReadinessProbeHttpGetHttpHeaders> httpHeaders;
    private String path;
    private String port;
    private ReplicationControllerListItemsSpecTemplateSpecInitContainersReadinessProbeHttpGetScheme scheme;

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersReadinessProbeHttpGet() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersReadinessProbeHttpGet(final String host,
                                                                                             final List<ReplicationControllerListItemsSpecTemplateSpecInitContainersReadinessProbeHttpGetHttpHeaders> httpHeaders,
                                                                                             final String path,
                                                                                             final String port,
                                                                                             final ReplicationControllerListItemsSpecTemplateSpecInitContainersReadinessProbeHttpGetScheme scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<ReplicationControllerListItemsSpecTemplateSpecInitContainersReadinessProbeHttpGetHttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<ReplicationControllerListItemsSpecTemplateSpecInitContainersReadinessProbeHttpGetHttpHeaders> httpHeaders) {
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

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersReadinessProbeHttpGetScheme getScheme() {
        return scheme;
    }

    public void setScheme(final ReplicationControllerListItemsSpecTemplateSpecInitContainersReadinessProbeHttpGetScheme scheme) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecInitContainersReadinessProbeHttpGet)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecInitContainersReadinessProbeHttpGet __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecInitContainersReadinessProbeHttpGet) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }
}
