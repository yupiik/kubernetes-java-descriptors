package io.yupiik.kubernetes.bindings.v1_15_0.v1;

import java.util.Objects;

public class VolumeAttachmentListItemsSpecSource {
    private VolumeAttachmentListItemsSpecSourceInlineVolumeSpec inlineVolumeSpec;
    private String persistentVolumeName;

    public VolumeAttachmentListItemsSpecSource() {
        // no-op
    }

    public VolumeAttachmentListItemsSpecSource(final VolumeAttachmentListItemsSpecSourceInlineVolumeSpec inlineVolumeSpec,
                                               final String persistentVolumeName) {
        // no-op
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpec getInlineVolumeSpec() {
        return inlineVolumeSpec;
    }

    public void setInlineVolumeSpec(final VolumeAttachmentListItemsSpecSourceInlineVolumeSpec inlineVolumeSpec) {
        this.inlineVolumeSpec = inlineVolumeSpec;
    }

    public String getPersistentVolumeName() {
        return persistentVolumeName;
    }

    public void setPersistentVolumeName(final String persistentVolumeName) {
        this.persistentVolumeName = persistentVolumeName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                inlineVolumeSpec,
                persistentVolumeName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VolumeAttachmentListItemsSpecSource)) {
            return false;
        }
        final VolumeAttachmentListItemsSpecSource __otherCasted = (VolumeAttachmentListItemsSpecSource) __other;
        return Objects.equals(inlineVolumeSpec, __otherCasted.inlineVolumeSpec) &&
            Objects.equals(persistentVolumeName, __otherCasted.persistentVolumeName);
    }
}
