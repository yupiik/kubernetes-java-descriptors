package io.yupiik.kubernetes.bindings.v1_12_9.v1;

import io.yupiik.kubernetes.bindings.v1_12_9.Validable;
import io.yupiik.kubernetes.bindings.v1_12_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ResourceQuota implements Validable<ResourceQuota> {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private ResourceQuotaSpec spec;
    private ResourceQuotaStatus status;

    public ResourceQuota() {
        // no-op
    }

    public ResourceQuota(final String apiVersion,
                         final String kind,
                         final ObjectMeta metadata,
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

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
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

    public ResourceQuota apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ResourceQuota kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public ResourceQuota metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public ResourceQuota spec(final ResourceQuotaSpec spec) {
        this.spec = spec;
        return this;
    }

    public ResourceQuota status(final ResourceQuotaStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public ResourceQuota validate() {
        return this;
    }
}
