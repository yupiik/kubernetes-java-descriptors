package io.yupiik.kubernetes.bindings.v1_18_11;

import java.util.Objects;

public class PersistentVolumeSpecLocal {
    private String fsType;
    private String path;

    public PersistentVolumeSpecLocal() {
        // no-op
    }

    public PersistentVolumeSpecLocal(final String fsType,
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
        if (!(__other instanceof PersistentVolumeSpecLocal)) {
            return false;
        }
        final PersistentVolumeSpecLocal __otherCasted = (PersistentVolumeSpecLocal) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(path, __otherCasted.path);
    }
}
