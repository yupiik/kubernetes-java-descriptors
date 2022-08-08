package io.yupiik.kubernetes.bindings.v1_21_9.v1alpha1;

import java.util.List;
import java.util.Objects;

public class StorageVersionList {
    private String apiVersion;
    private List<StorageVersionListItems> items;
    private String kind;
    private StorageVersionListMetadata metadata;

    public StorageVersionList() {
        // no-op
    }

    public StorageVersionList(final String apiVersion,
                              final List<StorageVersionListItems> items,
                              final String kind,
                              final StorageVersionListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<StorageVersionListItems> getItems() {
        return items;
    }

    public void setItems(final List<StorageVersionListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public StorageVersionListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final StorageVersionListMetadata metadata) {
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
        if (!(__other instanceof StorageVersionList)) {
            return false;
        }
        final StorageVersionList __otherCasted = (StorageVersionList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
