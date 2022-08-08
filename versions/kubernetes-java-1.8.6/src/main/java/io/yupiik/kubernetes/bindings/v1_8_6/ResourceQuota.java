package io.yupiik.kubernetes.bindings.v1_8_6;

import java.util.Objects;

public class ResourceQuota {
    private String apiVersion;
    private String kind;
    private ResourceQuotaMetadata metadata;
    private ResourceQuotaSpec spec;
    private ResourceQuotaStatus status;

    public ResourceQuota() {
        // no-op
    }

    public ResourceQuota(final String apiVersion,
                         final String kind,
                         final ResourceQuotaMetadata metadata,
                         final ResourceQuotaSpec spec,
                         final ResourceQuotaStatus status) {
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

    public ResourceQuotaMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ResourceQuotaMetadata metadata) {
        this.metadata = metadata;
    }

    public ResourceQuotaSpec getSpec() {
        return spec;
    }

    public void setSpec(final ResourceQuotaSpec spec) {
        this.spec = spec;
    }

    public ResourceQuotaStatus getStatus() {
        return status;
    }

    public void setStatus(final ResourceQuotaStatus status) {
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
        if (!(__other instanceof ResourceQuota)) {
            return false;
        }
        final ResourceQuota __otherCasted = (ResourceQuota) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
