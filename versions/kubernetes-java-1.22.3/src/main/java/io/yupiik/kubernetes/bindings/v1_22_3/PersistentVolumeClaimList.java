package io.yupiik.kubernetes.bindings.v1_22_3;

import java.util.List;
import java.util.Objects;

public class PersistentVolumeClaimList {
    private String apiVersion;
    private List<PersistentVolumeClaimListItems> items;
    private String kind;
    private PersistentVolumeClaimListMetadata metadata;

    public PersistentVolumeClaimList() {
        // no-op
    }

    public PersistentVolumeClaimList(final String apiVersion,
                                     final List<PersistentVolumeClaimListItems> items,
                                     final String kind,
                                     final PersistentVolumeClaimListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<PersistentVolumeClaimListItems> getItems() {
        return items;
    }

    public void setItems(final List<PersistentVolumeClaimListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public PersistentVolumeClaimListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final PersistentVolumeClaimListMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                items,
                kind,
                metadata);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PersistentVolumeClaimList)) {
            return false;
        }
        final PersistentVolumeClaimList __otherCasted = (PersistentVolumeClaimList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
