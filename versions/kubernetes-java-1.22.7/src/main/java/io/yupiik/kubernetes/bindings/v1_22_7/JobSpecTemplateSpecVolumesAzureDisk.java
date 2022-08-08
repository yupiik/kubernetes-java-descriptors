package io.yupiik.kubernetes.bindings.v1_22_7;

import java.util.Objects;

public class JobSpecTemplateSpecVolumesAzureDisk {
    private String cachingMode;
    private String diskName;
    private String diskURI;
    private String fsType;
    private String kind;
    private Boolean readOnly;

    public JobSpecTemplateSpecVolumesAzureDisk() {
        // no-op
    }

    public JobSpecTemplateSpecVolumesAzureDisk(final String cachingMode,
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
        if (!(__other instanceof JobSpecTemplateSpecVolumesAzureDisk)) {
            return false;
        }
        final JobSpecTemplateSpecVolumesAzureDisk __otherCasted = (JobSpecTemplateSpecVolumesAzureDisk) __other;
        return Objects.equals(cachingMode, __otherCasted.cachingMode) &&
            Objects.equals(diskName, __otherCasted.diskName) &&
            Objects.equals(diskURI, __otherCasted.diskURI) &&
            Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(readOnly, __otherCasted.readOnly);
    }
}
