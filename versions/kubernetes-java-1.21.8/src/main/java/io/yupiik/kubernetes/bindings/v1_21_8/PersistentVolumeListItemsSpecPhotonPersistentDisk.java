package io.yupiik.kubernetes.bindings.v1_21_8;

import java.util.Objects;

public class PersistentVolumeListItemsSpecPhotonPersistentDisk {
    private String fsType;
    private String pdID;

    public PersistentVolumeListItemsSpecPhotonPersistentDisk() {
        // no-op
    }

    public PersistentVolumeListItemsSpecPhotonPersistentDisk(final String fsType,
                                                             final String pdID) {
        // no-op
    }

    public String getFsType() {
        return fsType;
    }

    public void setFsType(final String fsType) {
        this.fsType = fsType;
    }

    public String getPdID() {
        return pdID;
    }

    public void setPdID(final String pdID) {
        this.pdID = pdID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                fsType,
                pdID);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PersistentVolumeListItemsSpecPhotonPersistentDisk)) {
            return false;
        }
        final PersistentVolumeListItemsSpecPhotonPersistentDisk __otherCasted = (PersistentVolumeListItemsSpecPhotonPersistentDisk) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(pdID, __otherCasted.pdID);
    }
}
