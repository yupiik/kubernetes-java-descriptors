package io.yupiik.kubernetes.bindings.v1_16_15.v1beta1;

import java.util.Map;
import java.util.Objects;

public class VolumeAttachmentStatus {
    private VolumeAttachmentStatusAttachError attachError;
    private boolean attached;
    private Map<String, String> attachmentMetadata;
    private VolumeAttachmentStatusDetachError detachError;

    public VolumeAttachmentStatus() {
        // no-op
    }

    public VolumeAttachmentStatus(final VolumeAttachmentStatusAttachError attachError,
                                  final boolean attached,
                                  final Map<String, String> attachmentMetadata,
                                  final VolumeAttachmentStatusDetachError detachError) {
        // no-op
    }

    public VolumeAttachmentStatusAttachError getAttachError() {
        return attachError;
    }

    public void setAttachError(final VolumeAttachmentStatusAttachError attachError) {
        this.attachError = attachError;
    }

    public boolean getAttached() {
        return attached;
    }

    public void setAttached(final boolean attached) {
        this.attached = attached;
    }

    public Map<String, String> getAttachmentMetadata() {
        return attachmentMetadata;
    }

    public void setAttachmentMetadata(final Map<String, String> attachmentMetadata) {
        this.attachmentMetadata = attachmentMetadata;
    }

    public VolumeAttachmentStatusDetachError getDetachError() {
        return detachError;
    }

    public void setDetachError(final VolumeAttachmentStatusDetachError detachError) {
        this.detachError = detachError;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                attachError,
                attached,
                attachmentMetadata,
                detachError);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VolumeAttachmentStatus)) {
            return false;
        }
        final VolumeAttachmentStatus __otherCasted = (VolumeAttachmentStatus) __other;
        return Objects.equals(attachError, __otherCasted.attachError) &&
            Objects.equals(attached, __otherCasted.attached) &&
            Objects.equals(attachmentMetadata, __otherCasted.attachmentMetadata) &&
            Objects.equals(detachError, __otherCasted.detachError);
    }
}
