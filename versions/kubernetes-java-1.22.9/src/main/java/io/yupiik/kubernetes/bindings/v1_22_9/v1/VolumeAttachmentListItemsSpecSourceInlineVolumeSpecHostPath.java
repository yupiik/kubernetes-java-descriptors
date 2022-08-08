package io.yupiik.kubernetes.bindings.v1_22_9.v1;

import java.util.Objects;

public class VolumeAttachmentListItemsSpecSourceInlineVolumeSpecHostPath {
    private String path;
    private String type;

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecHostPath() {
        // no-op
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecHostPath(final String path,
                                                                       final String type) {
        // no-op
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                path,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VolumeAttachmentListItemsSpecSourceInlineVolumeSpecHostPath)) {
            return false;
        }
        final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecHostPath __otherCasted = (VolumeAttachmentListItemsSpecSourceInlineVolumeSpecHostPath) __other;
        return Objects.equals(path, __otherCasted.path) &&
            Objects.equals(type, __otherCasted.type);
    }
}
