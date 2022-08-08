package io.yupiik.kubernetes.bindings.v1_18_10;

import java.util.Objects;

public class PersistentVolumeListItems {
    private String apiVersion;
    private String kind;
    private PersistentVolumeListItemsMetadata metadata;
    private PersistentVolumeListItemsSpec spec;
    private PersistentVolumeListItemsStatus status;

    public PersistentVolumeListItems() {
        // no-op
    }

    public PersistentVolumeListItems(final String apiVersion,
                                     final String kind,
                                     final PersistentVolumeListItemsMetadata metadata,
                                     final PersistentVolumeListItemsSpec spec,
                                     final PersistentVolumeListItemsStatus status) {
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

    public PersistentVolumeListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final PersistentVolumeListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public PersistentVolumeListItemsSpec getSpec() {
        return spec;
    }

    public void setSpec(final PersistentVolumeListItemsSpec spec) {
        this.spec = spec;
    }

    public PersistentVolumeListItemsStatus getStatus() {
        return status;
    }

    public void setStatus(final PersistentVolumeListItemsStatus status) {
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
        if (!(__other instanceof PersistentVolumeListItems)) {
            return false;
        }
        final PersistentVolumeListItems __otherCasted = (PersistentVolumeListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
