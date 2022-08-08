package io.yupiik.kubernetes.bindings.v1_17_6;

import java.util.Objects;

public class PersistentVolumeListItemsSpecCinder {
    private String fsType;
    private Boolean readOnly;
    private PersistentVolumeListItemsSpecCinderSecretRef secretRef;
    private String volumeID;

    public PersistentVolumeListItemsSpecCinder() {
        // no-op
    }

    public PersistentVolumeListItemsSpecCinder(final String fsType,
                                               final Boolean readOnly,
                                               final PersistentVolumeListItemsSpecCinderSecretRef secretRef,
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

    public PersistentVolumeListItemsSpecCinderSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final PersistentVolumeListItemsSpecCinderSecretRef secretRef) {
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
        if (!(__other instanceof PersistentVolumeListItemsSpecCinder)) {
            return false;
        }
        final PersistentVolumeListItemsSpecCinder __otherCasted = (PersistentVolumeListItemsSpecCinder) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(secretRef, __otherCasted.secretRef) &&
            Objects.equals(volumeID, __otherCasted.volumeID);
    }
}
