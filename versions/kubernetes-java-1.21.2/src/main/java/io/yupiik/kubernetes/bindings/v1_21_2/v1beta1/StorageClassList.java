package io.yupiik.kubernetes.bindings.v1_21_2.v1beta1;

import java.util.List;
import java.util.Objects;

public class StorageClassList {
    private String apiVersion;
    private List<StorageClassListItems> items;
    private String kind;
    private StorageClassListMetadata metadata;

    public StorageClassList() {
        // no-op
    }

    public StorageClassList(final String apiVersion,
                            final List<StorageClassListItems> items,
                            final String kind,
                            final StorageClassListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<StorageClassListItems> getItems() {
        return items;
    }

    public void setItems(final List<StorageClassListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public StorageClassListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final StorageClassListMetadata metadata) {
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
        if (!(__other instanceof StorageClassList)) {
            return false;
        }
        final StorageClassList __otherCasted = (StorageClassList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
