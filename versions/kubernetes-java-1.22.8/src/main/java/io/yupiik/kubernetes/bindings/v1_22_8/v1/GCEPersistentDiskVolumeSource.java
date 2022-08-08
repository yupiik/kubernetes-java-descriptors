package io.yupiik.kubernetes.bindings.v1_22_8.v1;

import io.yupiik.kubernetes.bindings.v1_22_8.Validable;
import io.yupiik.kubernetes.bindings.v1_22_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GCEPersistentDiskVolumeSource implements Validable<GCEPersistentDiskVolumeSource> {
    private String fsType;
    private Integer partition;
    private String pdName;
    private Boolean readOnly;

    public GCEPersistentDiskVolumeSource() {
        // no-op
    }

    public GCEPersistentDiskVolumeSource(final String fsType,
                                         final Integer partition,
                                         final String pdName,
                                         final Boolean readOnly) {
        // no-op
    }

    public String getFsType() {
        return fsType;
    }

    public void setFsType(final String fsType) {
        this.fsType = fsType;
    }

    public Integer getPartition() {
        return partition;
    }

    public void setPartition(final Integer partition) {
        this.partition = partition;
    }

    public String getPdName() {
        return pdName;
    }

    public void setPdName(final String pdName) {
        this.pdName = pdName;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                fsType,
                partition,
                pdName,
                readOnly);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof GCEPersistentDiskVolumeSource)) {
            return false;
        }
        final GCEPersistentDiskVolumeSource __otherCasted = (GCEPersistentDiskVolumeSource) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(partition, __otherCasted.partition) &&
            Objects.equals(pdName, __otherCasted.pdName) &&
            Objects.equals(readOnly, __otherCasted.readOnly);
    }

    public GCEPersistentDiskVolumeSource fsType(final String fsType) {
        this.fsType = fsType;
        return this;
    }

    public GCEPersistentDiskVolumeSource partition(final Integer partition) {
        this.partition = partition;
        return this;
    }

    public GCEPersistentDiskVolumeSource pdName(final String pdName) {
        this.pdName = pdName;
        return this;
    }

    public GCEPersistentDiskVolumeSource readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    @Override
    public GCEPersistentDiskVolumeSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (pdName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "pdName", "pdName",
                "Missing 'pdName' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
