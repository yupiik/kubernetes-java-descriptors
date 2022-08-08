package io.yupiik.kubernetes.bindings.v1_14_7;

import java.util.List;
import java.util.Objects;

public class PersistentVolumeList {
    private String apiVersion;
    private List<PersistentVolumeListItems> items;
    private String kind;
    private PersistentVolumeListMetadata metadata;

    public PersistentVolumeList() {
        // no-op
    }

    public PersistentVolumeList(final String apiVersion,
                                final List<PersistentVolumeListItems> items,
                                final String kind,
                                final PersistentVolumeListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<PersistentVolumeListItems> getItems() {
        return items;
    }

    public void setItems(final List<PersistentVolumeListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public PersistentVolumeListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final PersistentVolumeListMetadata metadata) {
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
        if (!(__other instanceof PersistentVolumeList)) {
            return false;
        }
        final PersistentVolumeList __otherCasted = (PersistentVolumeList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
