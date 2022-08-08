package io.yupiik.kubernetes.bindings.v1_17_16.v1;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecVolumesCinder {
    private String fsType;
    private Boolean readOnly;
    private ReplicaSetListItemsSpecTemplateSpecVolumesCinderSecretRef secretRef;
    private String volumeID;

    public ReplicaSetListItemsSpecTemplateSpecVolumesCinder() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesCinder(final String fsType,
                                                            final Boolean readOnly,
                                                            final ReplicaSetListItemsSpecTemplateSpecVolumesCinderSecretRef secretRef,
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

    public ReplicaSetListItemsSpecTemplateSpecVolumesCinderSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final ReplicaSetListItemsSpecTemplateSpecVolumesCinderSecretRef secretRef) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecVolumesCinder)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecVolumesCinder __otherCasted = (ReplicaSetListItemsSpecTemplateSpecVolumesCinder) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(secretRef, __otherCasted.secretRef) &&
            Objects.equals(volumeID, __otherCasted.volumeID);
    }
}
