package io.yupiik.kubernetes.bindings.v1_15_4;

import java.util.Objects;

public class PodTemplateTemplateSpecVolumesPhotonPersistentDisk {
    private String fsType;
    private String pdID;

    public PodTemplateTemplateSpecVolumesPhotonPersistentDisk() {
        // no-op
    }

    public PodTemplateTemplateSpecVolumesPhotonPersistentDisk(final String fsType,
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
        if (!(__other instanceof PodTemplateTemplateSpecVolumesPhotonPersistentDisk)) {
            return false;
        }
        final PodTemplateTemplateSpecVolumesPhotonPersistentDisk __otherCasted = (PodTemplateTemplateSpecVolumesPhotonPersistentDisk) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(pdID, __otherCasted.pdID);
    }
}
