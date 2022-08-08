package io.yupiik.kubernetes.bindings.v1_14_0.v1alpha1;

import java.util.Objects;

public class VolumeAttachmentListItemsSpecSource {
    private String persistentVolumeName;

    public VolumeAttachmentListItemsSpecSource() {
        // no-op
    }

    public VolumeAttachmentListItemsSpecSource(final String persistentVolumeName) {
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
        if (!(__other instanceof VolumeAttachmentListItemsSpecSource)) {
            return false;
        }
        final VolumeAttachmentListItemsSpecSource __otherCasted = (VolumeAttachmentListItemsSpecSource) __other;
        return Objects.equals(persistentVolumeName, __otherCasted.persistentVolumeName);
    }
}
