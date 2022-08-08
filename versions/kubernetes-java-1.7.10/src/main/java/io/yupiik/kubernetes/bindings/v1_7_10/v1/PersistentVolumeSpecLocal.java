package io.yupiik.kubernetes.bindings.v1_7_10.v1;

import java.util.Objects;

public class PersistentVolumeSpecLocal {
    private String path;

    public PersistentVolumeSpecLocal() {
        // no-op
    }

    public PersistentVolumeSpecLocal(final String path) {
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
        if (!(__other instanceof PersistentVolumeSpecLocal)) {
            return false;
        }
        final PersistentVolumeSpecLocal __otherCasted = (PersistentVolumeSpecLocal) __other;
        return Objects.equals(path, __otherCasted.path);
    }
}
