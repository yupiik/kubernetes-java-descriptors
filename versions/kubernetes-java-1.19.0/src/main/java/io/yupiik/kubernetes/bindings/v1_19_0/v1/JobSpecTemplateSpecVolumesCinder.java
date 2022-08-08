package io.yupiik.kubernetes.bindings.v1_19_0.v1;

import java.util.Objects;

public class JobSpecTemplateSpecVolumesCinder {
    private String fsType;
    private Boolean readOnly;
    private JobSpecTemplateSpecVolumesCinderSecretRef secretRef;
    private String volumeID;

    public JobSpecTemplateSpecVolumesCinder() {
        // no-op
    }

    public JobSpecTemplateSpecVolumesCinder(final String fsType,
                                            final Boolean readOnly,
                                            final JobSpecTemplateSpecVolumesCinderSecretRef secretRef,
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

    public JobSpecTemplateSpecVolumesCinderSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final JobSpecTemplateSpecVolumesCinderSecretRef secretRef) {
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
        if (!(__other instanceof JobSpecTemplateSpecVolumesCinder)) {
            return false;
        }
        final JobSpecTemplateSpecVolumesCinder __otherCasted = (JobSpecTemplateSpecVolumesCinder) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(secretRef, __otherCasted.secretRef) &&
            Objects.equals(volumeID, __otherCasted.volumeID);
    }
}
