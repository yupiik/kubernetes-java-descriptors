package io.yupiik.kubernetes.bindings.v1_16_7.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_16_7.Validable;
import io.yupiik.kubernetes.bindings.v1_16_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class VolumeAttachmentStatus implements Validable<VolumeAttachmentStatus> {
    private VolumeError attachError;
    private boolean attached;
    private Map<String, String> attachmentMetadata;
    private VolumeError detachError;

    public VolumeAttachmentStatus() {
        // no-op
    }

    public VolumeAttachmentStatus(final VolumeError attachError,
                                  final boolean attached,
                                  final Map<String, String> attachmentMetadata,
                                  final VolumeError detachError) {
        // no-op
    }

    public VolumeError getAttachError() {
        return attachError;
    }

    public void setAttachError(final VolumeError attachError) {
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

    public VolumeError getDetachError() {
        return detachError;
    }

    public void setDetachError(final VolumeError detachError) {
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

    public VolumeAttachmentStatus attachError(final VolumeError attachError) {
        this.attachError = attachError;
        return this;
    }

    public VolumeAttachmentStatus attached(final boolean attached) {
        this.attached = attached;
        return this;
    }

    public VolumeAttachmentStatus attachmentMetadata(final Map<String, String> attachmentMetadata) {
        this.attachmentMetadata = attachmentMetadata;
        return this;
    }

    public VolumeAttachmentStatus detachError(final VolumeError detachError) {
        this.detachError = detachError;
        return this;
    }

    @Override
    public VolumeAttachmentStatus validate() {
        return this;
    }
}
