package io.yupiik.kubernetes.bindings.v1_21_12;

import java.util.Objects;

public class PersistentVolumeClaimListItems {
    private String apiVersion;
    private String kind;
    private PersistentVolumeClaimListItemsMetadata metadata;
    private PersistentVolumeClaimListItemsSpec spec;
    private PersistentVolumeClaimListItemsStatus status;

    public PersistentVolumeClaimListItems() {
        // no-op
    }

    public PersistentVolumeClaimListItems(final String apiVersion,
                                          final String kind,
                                          final PersistentVolumeClaimListItemsMetadata metadata,
                                          final PersistentVolumeClaimListItemsSpec spec,
                                          final PersistentVolumeClaimListItemsStatus status) {
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

    public PersistentVolumeClaimListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final PersistentVolumeClaimListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public PersistentVolumeClaimListItemsSpec getSpec() {
        return spec;
    }

    public void setSpec(final PersistentVolumeClaimListItemsSpec spec) {
        this.spec = spec;
    }

    public PersistentVolumeClaimListItemsStatus getStatus() {
        return status;
    }

    public void setStatus(final PersistentVolumeClaimListItemsStatus status) {
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
        if (!(__other instanceof PersistentVolumeClaimListItems)) {
            return false;
        }
        final PersistentVolumeClaimListItems __otherCasted = (PersistentVolumeClaimListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
