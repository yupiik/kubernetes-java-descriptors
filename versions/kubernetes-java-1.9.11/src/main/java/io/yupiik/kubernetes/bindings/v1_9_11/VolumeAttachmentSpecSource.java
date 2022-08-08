package io.yupiik.kubernetes.bindings.v1_9_11;

import java.util.Objects;

public class VolumeAttachmentSpecSource {
    private String persistentVolumeName;

    public VolumeAttachmentSpecSource() {
        // no-op
    }

    public VolumeAttachmentSpecSource(final String persistentVolumeName) {
        // no-op
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
                persistentVolumeName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VolumeAttachmentSpecSource)) {
            return false;
        }
        final VolumeAttachmentSpecSource __otherCasted = (VolumeAttachmentSpecSource) __other;
        return Objects.equals(persistentVolumeName, __otherCasted.persistentVolumeName);
    }
}
