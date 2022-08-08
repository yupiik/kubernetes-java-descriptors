package io.yupiik.kubernetes.bindings.v1_21_2.v1alpha1;

import java.util.List;
import java.util.Objects;

public class CSIStorageCapacityList {
    private String apiVersion;
    private List<CSIStorageCapacityListItems> items;
    private String kind;
    private CSIStorageCapacityListMetadata metadata;

    public CSIStorageCapacityList() {
        // no-op
    }

    public CSIStorageCapacityList(final String apiVersion,
                                  final List<CSIStorageCapacityListItems> items,
                                  final String kind,
                                  final CSIStorageCapacityListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<CSIStorageCapacityListItems> getItems() {
        return items;
    }

    public void setItems(final List<CSIStorageCapacityListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public CSIStorageCapacityListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final CSIStorageCapacityListMetadata metadata) {
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
        if (!(__other instanceof CSIStorageCapacityList)) {
            return false;
        }
        final CSIStorageCapacityList __otherCasted = (CSIStorageCapacityList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
