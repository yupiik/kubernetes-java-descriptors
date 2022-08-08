package io.yupiik.kubernetes.bindings.v1_7_7.v1;

import java.util.Objects;

public class PersistentVolumeSpecHostPath {
    private String path;

    public PersistentVolumeSpecHostPath() {
        // no-op
    }

    public PersistentVolumeSpecHostPath(final String path) {
        // no-op
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
                path);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PersistentVolumeSpecHostPath)) {
            return false;
        }
        final PersistentVolumeSpecHostPath __otherCasted = (PersistentVolumeSpecHostPath) __other;
        return Objects.equals(path, __otherCasted.path);
    }
}
