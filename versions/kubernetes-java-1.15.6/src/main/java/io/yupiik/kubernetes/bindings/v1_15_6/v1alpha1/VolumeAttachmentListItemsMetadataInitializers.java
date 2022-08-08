package io.yupiik.kubernetes.bindings.v1_15_6.v1alpha1;

import java.util.List;
import java.util.Objects;

public class VolumeAttachmentListItemsMetadataInitializers {
    private List<VolumeAttachmentListItemsMetadataInitializersPending> pending;
    private VolumeAttachmentListItemsMetadataInitializersResult result;

    public VolumeAttachmentListItemsMetadataInitializers() {
        // no-op
    }

    public VolumeAttachmentListItemsMetadataInitializers(final List<VolumeAttachmentListItemsMetadataInitializersPending> pending,
                                                         final VolumeAttachmentListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<VolumeAttachmentListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<VolumeAttachmentListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public VolumeAttachmentListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final VolumeAttachmentListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof VolumeAttachmentListItemsMetadataInitializers)) {
            return false;
        }
        final VolumeAttachmentListItemsMetadataInitializers __otherCasted = (VolumeAttachmentListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
