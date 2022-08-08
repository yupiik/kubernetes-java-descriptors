package io.yupiik.kubernetes.bindings.v1_23_1.v1beta1;

import io.yupiik.kubernetes.bindings.v1_23_1.Validable;
import io.yupiik.kubernetes.bindings.v1_23_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CSIStorageCapacity implements Validable<CSIStorageCapacity> {
    private String apiVersion;
    private String capacity;
    private String kind;
    private String maximumVolumeSize;
    private ObjectMeta metadata;
    private LabelSelector nodeTopology;
    private String storageClassName;

    public CSIStorageCapacity() {
        // no-op
    }

    public CSIStorageCapacity(final String apiVersion,
                              final String capacity,
                              final String kind,
                              final String maximumVolumeSize,
                              final ObjectMeta metadata,
                              final LabelSelector nodeTopology,
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

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
        this.metadata = metadata;
    }

    public LabelSelector getNodeTopology() {
        return nodeTopology;
    }

    public void setNodeTopology(final LabelSelector nodeTopology) {
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
        if (!(__other instanceof CSIStorageCapacity)) {
            return false;
        }
        final CSIStorageCapacity __otherCasted = (CSIStorageCapacity) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(capacity, __otherCasted.capacity) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(maximumVolumeSize, __otherCasted.maximumVolumeSize) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(nodeTopology, __otherCasted.nodeTopology) &&
            Objects.equals(storageClassName, __otherCasted.storageClassName);
    }

    public CSIStorageCapacity apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public CSIStorageCapacity capacity(final String capacity) {
        this.capacity = capacity;
        return this;
    }

    public CSIStorageCapacity kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public CSIStorageCapacity maximumVolumeSize(final String maximumVolumeSize) {
        this.maximumVolumeSize = maximumVolumeSize;
        return this;
    }

    public CSIStorageCapacity metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public CSIStorageCapacity nodeTopology(final LabelSelector nodeTopology) {
        this.nodeTopology = nodeTopology;
        return this;
    }

    public CSIStorageCapacity storageClassName(final String storageClassName) {
        this.storageClassName = storageClassName;
        return this;
    }

    @Override
    public CSIStorageCapacity validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (storageClassName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "storageClassName", "storageClassName",
                "Missing 'storageClassName' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}