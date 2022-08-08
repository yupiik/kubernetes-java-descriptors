package io.yupiik.kubernetes.bindings.v1_24_2.v1;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecVolumesCinder {
    private String fsType;
    private Boolean readOnly;
    private DeploymentListItemsSpecTemplateSpecVolumesCinderSecretRef secretRef;
    private String volumeID;

    public DeploymentListItemsSpecTemplateSpecVolumesCinder() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecVolumesCinder(final String fsType,
                                                            final Boolean readOnly,
                                                            final DeploymentListItemsSpecTemplateSpecVolumesCinderSecretRef secretRef,
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

    public DeploymentListItemsSpecTemplateSpecVolumesCinderSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final DeploymentListItemsSpecTemplateSpecVolumesCinderSecretRef secretRef) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecVolumesCinder)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecVolumesCinder __otherCasted = (DeploymentListItemsSpecTemplateSpecVolumesCinder) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(secretRef, __otherCasted.secretRef) &&
            Objects.equals(volumeID, __otherCasted.volumeID);
    }
}
