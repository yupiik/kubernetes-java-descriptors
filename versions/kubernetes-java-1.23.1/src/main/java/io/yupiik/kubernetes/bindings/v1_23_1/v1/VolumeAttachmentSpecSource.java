package io.yupiik.kubernetes.bindings.v1_23_1.v1;

import java.util.Objects;

public class VolumeAttachmentSpecSource {
    private VolumeAttachmentSpecSourceInlineVolumeSpec inlineVolumeSpec;
    private String persistentVolumeName;

    public VolumeAttachmentSpecSource() {
        // no-op
    }

    public VolumeAttachmentSpecSource(final VolumeAttachmentSpecSourceInlineVolumeSpec inlineVolumeSpec,
                                      final String persistentVolumeName) {
        // no-op
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpec getInlineVolumeSpec() {
        return inlineVolumeSpec;
    }

    public void setInlineVolumeSpec(final VolumeAttachmentSpecSourceInlineVolumeSpec inlineVolumeSpec) {
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
        if (!(__other instanceof VolumeAttachmentSpecSource)) {
            return false;
        }
        final VolumeAttachmentSpecSource __otherCasted = (VolumeAttachmentSpecSource) __other;
        return Objects.equals(inlineVolumeSpec, __otherCasted.inlineVolumeSpec) &&
            Objects.equals(persistentVolumeName, __otherCasted.persistentVolumeName);
    }
}
