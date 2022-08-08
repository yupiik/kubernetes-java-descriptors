package io.yupiik.kubernetes.bindings.v1_18_2.v1;

import java.util.Objects;

public class PodListItemsSpecVolumesCinder {
    private String fsType;
    private Boolean readOnly;
    private PodListItemsSpecVolumesCinderSecretRef secretRef;
    private String volumeID;

    public PodListItemsSpecVolumesCinder() {
        // no-op
    }

    public PodListItemsSpecVolumesCinder(final String fsType,
                                         final Boolean readOnly,
                                         final PodListItemsSpecVolumesCinderSecretRef secretRef,
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

    public PodListItemsSpecVolumesCinderSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final PodListItemsSpecVolumesCinderSecretRef secretRef) {
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
        if (!(__other instanceof PodListItemsSpecVolumesCinder)) {
            return false;
        }
        final PodListItemsSpecVolumesCinder __otherCasted = (PodListItemsSpecVolumesCinder) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(secretRef, __otherCasted.secretRef) &&
            Objects.equals(volumeID, __otherCasted.volumeID);
    }
}
