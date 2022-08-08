package io.yupiik.kubernetes.bindings.v1_20_1;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecVolumesHostPath {
    private String path;
    private String type;

    public StatefulSetSpecTemplateSpecVolumesHostPath() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecVolumesHostPath(final String path,
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecVolumesHostPath)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecVolumesHostPath __otherCasted = (StatefulSetSpecTemplateSpecVolumesHostPath) __other;
        return Objects.equals(path, __otherCasted.path) &&
            Objects.equals(type, __otherCasted.type);
    }
}
