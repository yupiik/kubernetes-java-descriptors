package io.yupiik.kubernetes.bindings.v1_16_3.v1beta1;

import java.util.Objects;

public class VolumeAttachmentSpecSourceInlineVolumeSpecLocal {
    private String fsType;
    private String path;

    public VolumeAttachmentSpecSourceInlineVolumeSpecLocal() {
        // no-op
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpecLocal(final String fsType,
                                                           final String path) {
        // no-op
    }

    public String getFsType() {
        return fsType;
    }

    public void setFsType(final String fsType) {
        this.fsType = fsType;
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                fsType,
                path);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VolumeAttachmentSpecSourceInlineVolumeSpecLocal)) {
            return false;
        }
        final VolumeAttachmentSpecSourceInlineVolumeSpecLocal __otherCasted = (VolumeAttachmentSpecSourceInlineVolumeSpecLocal) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(path, __otherCasted.path);
    }
}
