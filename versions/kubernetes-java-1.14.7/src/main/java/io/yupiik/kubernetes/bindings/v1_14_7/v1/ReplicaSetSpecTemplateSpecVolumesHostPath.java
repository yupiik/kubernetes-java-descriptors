package io.yupiik.kubernetes.bindings.v1_14_7.v1;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecVolumesHostPath {
    private String path;
    private String type;

    public ReplicaSetSpecTemplateSpecVolumesHostPath() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecVolumesHostPath(final String path,
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecVolumesHostPath)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecVolumesHostPath __otherCasted = (ReplicaSetSpecTemplateSpecVolumesHostPath) __other;
        return Objects.equals(path, __otherCasted.path) &&
            Objects.equals(type, __otherCasted.type);
    }
}
