package io.yupiik.kubernetes.bindings.v1_14_8.v1beta1;

import java.util.List;
import java.util.Objects;

public class VolumeAttachmentMetadataInitializers {
    private List<VolumeAttachmentMetadataInitializersPending> pending;
    private VolumeAttachmentMetadataInitializersResult result;

    public VolumeAttachmentMetadataInitializers() {
        // no-op
    }

    public VolumeAttachmentMetadataInitializers(final List<VolumeAttachmentMetadataInitializersPending> pending,
                                                final VolumeAttachmentMetadataInitializersResult result) {
        // no-op
    }

    public List<VolumeAttachmentMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<VolumeAttachmentMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public VolumeAttachmentMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final VolumeAttachmentMetadataInitializersResult result) {
        this.result = result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                pending,
                result);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VolumeAttachmentMetadataInitializers)) {
            return false;
        }
        final VolumeAttachmentMetadataInitializers __otherCasted = (VolumeAttachmentMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
