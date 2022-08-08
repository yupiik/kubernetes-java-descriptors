package io.yupiik.kubernetes.bindings.v1_18_15;

import java.util.Objects;

public class PodSpecVolumesPhotonPersistentDisk {
    private String fsType;
    private String pdID;

    public PodSpecVolumesPhotonPersistentDisk() {
        // no-op
    }

    public PodSpecVolumesPhotonPersistentDisk(final String fsType,
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
        if (!(__other instanceof PodSpecVolumesPhotonPersistentDisk)) {
            return false;
        }
        final PodSpecVolumesPhotonPersistentDisk __otherCasted = (PodSpecVolumesPhotonPersistentDisk) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(pdID, __otherCasted.pdID);
    }
}
