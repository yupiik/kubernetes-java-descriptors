package io.yupiik.kubernetes.bindings.v1_22_8.v1alpha1;

import java.util.Objects;

public class CSIStorageCapacityListItems {
    private String apiVersion;
    private String capacity;
    private String kind;
    private String maximumVolumeSize;
    private CSIStorageCapacityListItemsMetadata metadata;
    private CSIStorageCapacityListItemsNodeTopology nodeTopology;
    private String storageClassName;

    public CSIStorageCapacityListItems() {
        // no-op
    }

    public CSIStorageCapacityListItems(final String apiVersion,
                                       final String capacity,
                                       final String kind,
                                       final String maximumVolumeSize,
                                       final CSIStorageCapacityListItemsMetadata metadata,
                                       final CSIStorageCapacityListItemsNodeTopology nodeTopology,
                                       final String storageClassName) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(final String capacity) {
        this.capacity = capacity;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public String getMaximumVolumeSize() {
        return maximumVolumeSize;
    }

    public void setMaximumVolumeSize(final String maximumVolumeSize) {
        this.maximumVolumeSize = maximumVolumeSize;
    }

    public CSIStorageCapacityListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final CSIStorageCapacityListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public CSIStorageCapacityListItemsNodeTopology getNodeTopology() {
        return nodeTopology;
    }

    public void setNodeTopology(final CSIStorageCapacityListItemsNodeTopology nodeTopology) {
        this.nodeTopology = nodeTopology;
    }

    public String getStorageClassName() {
        return storageClassName;
    }

    public void setStorageClassName(final String storageClassName) {
        this.storageClassName = storageClassName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                capacity,
                kind,
                maximumVolumeSize,
                metadata,
                nodeTopology,
                storageClassName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CSIStorageCapacityListItems)) {
            return false;
        }
        final CSIStorageCapacityListItems __otherCasted = (CSIStorageCapacityListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(capacity, __otherCasted.capacity) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(maximumVolumeSize, __otherCasted.maximumVolumeSize) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(nodeTopology, __otherCasted.nodeTopology) &&
            Objects.equals(storageClassName, __otherCasted.storageClassName);
    }
}
