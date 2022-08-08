package io.yupiik.kubernetes.bindings.v1_17_1;

import java.util.Objects;

public class Service {
    private String apiVersion;
    private String kind;
    private ServiceMetadata metadata;
    private ServiceSpec spec;
    private ServiceStatus status;

    public Service() {
        // no-op
    }

    public Service(final String apiVersion,
                   final String kind,
                   final ServiceMetadata metadata,
                   final ServiceSpec spec,
                   final ServiceStatus status) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public ServiceMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ServiceMetadata metadata) {
        this.metadata = metadata;
    }

    public ServiceSpec getSpec() {
        return spec;
    }

    public void setSpec(final ServiceSpec spec) {
        this.spec = spec;
    }

    public ServiceStatus getStatus() {
        return status;
    }

    public void setStatus(final ServiceStatus status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                spec,
                status);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Service)) {
            return false;
        }
        final Service __otherCasted = (Service) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
