package io.yupiik.kubernetes.bindings.v1_17_1.v1;

import java.util.Map;
import java.util.Objects;

public class VolumeAttachmentListItemsStatus {
    private VolumeAttachmentListItemsStatusAttachError attachError;
    private boolean attached;
    private Map<String, String> attachmentMetadata;
    private VolumeAttachmentListItemsStatusDetachError detachError;

    public VolumeAttachmentListItemsStatus() {
        // no-op
    }

    public VolumeAttachmentListItemsStatus(final VolumeAttachmentListItemsStatusAttachError attachError,
                                           final boolean attached,
                                           final Map<String, String> attachmentMetadata,
                                           final VolumeAttachmentListItemsStatusDetachError detachError) {
        // no-op
    }

    public VolumeAttachmentListItemsStatusAttachError getAttachError() {
        return attachError;
    }

    public void setAttachError(final VolumeAttachmentListItemsStatusAttachError attachError) {
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

    public VolumeAttachmentListItemsStatusDetachError getDetachError() {
        return detachError;
    }

    public void setDetachError(final VolumeAttachmentListItemsStatusDetachError detachError) {
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
        if (!(__other instanceof VolumeAttachmentListItemsStatus)) {
            return false;
        }
        final VolumeAttachmentListItemsStatus __otherCasted = (VolumeAttachmentListItemsStatus) __other;
        return Objects.equals(attachError, __otherCasted.attachError) &&
            Objects.equals(attached, __otherCasted.attached) &&
            Objects.equals(attachmentMetadata, __otherCasted.attachmentMetadata) &&
            Objects.equals(detachError, __otherCasted.detachError);
    }
}
