package io.yupiik.kubernetes.bindings.v1_19_7.v1beta1;

import java.util.Objects;

public class VolumeAttachmentSpecSourceInlineVolumeSpecCinder {
    private String fsType;
    private Boolean readOnly;
    private VolumeAttachmentSpecSourceInlineVolumeSpecCinderSecretRef secretRef;
    private String volumeID;

    public VolumeAttachmentSpecSourceInlineVolumeSpecCinder() {
        // no-op
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpecCinder(final String fsType,
                                                            final Boolean readOnly,
                                                            final VolumeAttachmentSpecSourceInlineVolumeSpecCinderSecretRef secretRef,
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

    public VolumeAttachmentSpecSourceInlineVolumeSpecCinderSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final VolumeAttachmentSpecSourceInlineVolumeSpecCinderSecretRef secretRef) {
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
        if (!(__other instanceof VolumeAttachmentSpecSourceInlineVolumeSpecCinder)) {
            return false;
        }
        final VolumeAttachmentSpecSourceInlineVolumeSpecCinder __otherCasted = (VolumeAttachmentSpecSourceInlineVolumeSpecCinder) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(secretRef, __otherCasted.secretRef) &&
            Objects.equals(volumeID, __otherCasted.volumeID);
    }
}
