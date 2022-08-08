package io.yupiik.kubernetes.bindings.v1_14_7;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecVolumesPhotonPersistentDisk {
    private String fsType;
    private String pdID;

    public PodTemplateListItemsTemplateSpecVolumesPhotonPersistentDisk() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecVolumesPhotonPersistentDisk(final String fsType,
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecVolumesPhotonPersistentDisk)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecVolumesPhotonPersistentDisk __otherCasted = (PodTemplateListItemsTemplateSpecVolumesPhotonPersistentDisk) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(pdID, __otherCasted.pdID);
    }
}
