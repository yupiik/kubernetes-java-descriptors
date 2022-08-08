package io.yupiik.kubernetes.bindings.v1_15_7.v1beta1;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesCinder {
    private String fsType;
    private Boolean readOnly;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesCinderSecretRef secretRef;
    private String volumeID;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesCinder() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesCinder(final String fsType,
                                                                        final Boolean readOnly,
                                                                        final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesCinderSecretRef secretRef,
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

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesCinderSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesCinderSecretRef secretRef) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesCinder)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesCinder __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesCinder) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(secretRef, __otherCasted.secretRef) &&
            Objects.equals(volumeID, __otherCasted.volumeID);
    }
}
