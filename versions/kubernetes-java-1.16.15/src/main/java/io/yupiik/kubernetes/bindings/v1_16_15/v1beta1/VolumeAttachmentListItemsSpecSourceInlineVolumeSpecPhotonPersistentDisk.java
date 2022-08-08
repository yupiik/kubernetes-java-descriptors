package io.yupiik.kubernetes.bindings.v1_16_15.v1beta1;

import java.util.Objects;

public class VolumeAttachmentListItemsSpecSourceInlineVolumeSpecPhotonPersistentDisk {
    private String fsType;
    private String pdID;

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecPhotonPersistentDisk() {
        // no-op
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecPhotonPersistentDisk(final String fsType,
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
        if (!(__other instanceof VolumeAttachmentListItemsSpecSourceInlineVolumeSpecPhotonPersistentDisk)) {
            return false;
        }
        final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecPhotonPersistentDisk __otherCasted = (VolumeAttachmentListItemsSpecSourceInlineVolumeSpecPhotonPersistentDisk) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(pdID, __otherCasted.pdID);
    }
}
