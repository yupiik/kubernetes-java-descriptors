package io.yupiik.kubernetes.bindings.v1_18_19;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecVolumesCinder {
    private String fsType;
    private Boolean readOnly;
    private JobListItemsSpecTemplateSpecVolumesCinderSecretRef secretRef;
    private String volumeID;

    public JobListItemsSpecTemplateSpecVolumesCinder() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecVolumesCinder(final String fsType,
                                                     final Boolean readOnly,
                                                     final JobListItemsSpecTemplateSpecVolumesCinderSecretRef secretRef,
                                                     final String volumeID) {
        // no-op
    }

    public String getFsType() {
        return fsType;
    }

    public void setFsType(final String fsType) {
        this.fsType = fsType;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public JobListItemsSpecTemplateSpecVolumesCinderSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final JobListItemsSpecTemplateSpecVolumesCinderSecretRef secretRef) {
        this.secretRef = secretRef;
    }

    public String getVolumeID() {
        return volumeID;
    }

    public void setVolumeID(final String volumeID) {
        this.volumeID = volumeID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                fsType,
                readOnly,
                secretRef,
                volumeID);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof JobListItemsSpecTemplateSpecVolumesCinder)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecVolumesCinder __otherCasted = (JobListItemsSpecTemplateSpecVolumesCinder) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(secretRef, __otherCasted.secretRef) &&
            Objects.equals(volumeID, __otherCasted.volumeID);
    }
}
