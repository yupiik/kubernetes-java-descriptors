package io.yupiik.kubernetes.bindings.v1_21_11;

import java.util.Objects;

public class PodSpecVolumesHostPath {
    private String path;
    private String type;

    public PodSpecVolumesHostPath() {
        // no-op
    }

    public PodSpecVolumesHostPath(final String path,
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
        if (!(__other instanceof PodSpecVolumesHostPath)) {
            return false;
        }
        final PodSpecVolumesHostPath __otherCasted = (PodSpecVolumesHostPath) __other;
        return Objects.equals(path, __otherCasted.path) &&
            Objects.equals(type, __otherCasted.type);
    }
}
