package io.yupiik.kubernetes.bindings.v1_16_12.v1;

import java.util.Objects;

public class PodListItems {
    private String apiVersion;
    private String kind;
    private PodListItemsMetadata metadata;
    private PodListItemsSpec spec;
    private PodListItemsStatus status;

    public PodListItems() {
        // no-op
    }

    public PodListItems(final String apiVersion,
                        final String kind,
                        final PodListItemsMetadata metadata,
                        final PodListItemsSpec spec,
                        final PodListItemsStatus status) {
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

    public PodListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final PodListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public PodListItemsSpec getSpec() {
        return spec;
    }

    public void setSpec(final PodListItemsSpec spec) {
        this.spec = spec;
    }

    public PodListItemsStatus getStatus() {
        return status;
    }

    public void setStatus(final PodListItemsStatus status) {
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
        if (!(__other instanceof PodListItems)) {
            return false;
        }
        final PodListItems __otherCasted = (PodListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
