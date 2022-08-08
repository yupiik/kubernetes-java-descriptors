package io.yupiik.kubernetes.bindings.v1_23_0.v1beta1;

import io.yupiik.kubernetes.bindings.v1_23_0.Validable;
import io.yupiik.kubernetes.bindings.v1_23_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AzureDiskVolumeSource implements Validable<AzureDiskVolumeSource> {
    private String cachingMode;
    private String diskName;
    private String diskURI;
    private String fsType;
    private String kind;
    private Boolean readOnly;

    public AzureDiskVolumeSource() {
        // no-op
    }

    public AzureDiskVolumeSource(final String cachingMode,
                                 final String diskName,
                                 final String diskURI,
                                 final String fsType,
                                 final String kind,
                                 final Boolean readOnly) {
        // no-op
    }

    public String getCachingMode() {
        return cachingMode;
    }

    public void setCachingMode(final String cachingMode) {
        this.cachingMode = cachingMode;
    }

    public String getDiskName() {
        return diskName;
    }

    public void setDiskName(final String diskName) {
        this.diskName = diskName;
    }

    public String getDiskURI() {
        return diskURI;
    }

    public void setDiskURI(final String diskURI) {
        this.diskURI = diskURI;
    }

    public String getFsType() {
        return fsType;
    }

    public void setFsType(final String fsType) {
        this.fsType = fsType;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
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
                cachingMode,
                diskName,
                diskURI,
                fsType,
                kind,
                readOnly);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof AzureDiskVolumeSource)) {
            return false;
        }
        final AzureDiskVolumeSource __otherCasted = (AzureDiskVolumeSource) __other;
        return Objects.equals(cachingMode, __otherCasted.cachingMode) &&
            Objects.equals(diskName, __otherCasted.diskName) &&
            Objects.equals(diskURI, __otherCasted.diskURI) &&
            Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(readOnly, __otherCasted.readOnly);
    }

    public AzureDiskVolumeSource cachingMode(final String cachingMode) {
        this.cachingMode = cachingMode;
        return this;
    }

    public AzureDiskVolumeSource diskName(final String diskName) {
        this.diskName = diskName;
        return this;
    }

    public AzureDiskVolumeSource diskURI(final String diskURI) {
        this.diskURI = diskURI;
        return this;
    }

    public AzureDiskVolumeSource fsType(final String fsType) {
        this.fsType = fsType;
        return this;
    }

    public AzureDiskVolumeSource kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public AzureDiskVolumeSource readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    @Override
    public AzureDiskVolumeSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (diskName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "diskName", "diskName",
                "Missing 'diskName' attribute.", true));
        }
        if (diskURI == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "diskURI", "diskURI",
                "Missing 'diskURI' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
