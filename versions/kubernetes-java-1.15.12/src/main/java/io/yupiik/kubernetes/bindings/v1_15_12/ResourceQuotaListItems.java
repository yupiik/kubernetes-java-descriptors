package io.yupiik.kubernetes.bindings.v1_15_12;

import java.util.Objects;

public class ResourceQuotaListItems {
    private String apiVersion;
    private String kind;
    private ResourceQuotaListItemsMetadata metadata;
    private ResourceQuotaListItemsSpec spec;
    private ResourceQuotaListItemsStatus status;

    public ResourceQuotaListItems() {
        // no-op
    }

    public ResourceQuotaListItems(final String apiVersion,
                                  final String kind,
                                  final ResourceQuotaListItemsMetadata metadata,
                                  final ResourceQuotaListItemsSpec spec,
                                  final ResourceQuotaListItemsStatus status) {
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

    public ResourceQuotaListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ResourceQuotaListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public ResourceQuotaListItemsSpec getSpec() {
        return spec;
    }

    public void setSpec(final ResourceQuotaListItemsSpec spec) {
        this.spec = spec;
    }

    public ResourceQuotaListItemsStatus getStatus() {
        return status;
    }

    public void setStatus(final ResourceQuotaListItemsStatus status) {
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
        if (!(__other instanceof ResourceQuotaListItems)) {
            return false;
        }
        final ResourceQuotaListItems __otherCasted = (ResourceQuotaListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
