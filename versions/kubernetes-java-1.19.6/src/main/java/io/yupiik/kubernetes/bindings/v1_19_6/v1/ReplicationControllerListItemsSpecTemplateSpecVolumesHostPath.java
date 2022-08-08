package io.yupiik.kubernetes.bindings.v1_19_6.v1;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecVolumesHostPath {
    private String path;
    private String type;

    public ReplicationControllerListItemsSpecTemplateSpecVolumesHostPath() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesHostPath(final String path,
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecVolumesHostPath)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecVolumesHostPath __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecVolumesHostPath) __other;
        return Objects.equals(path, __otherCasted.path) &&
            Objects.equals(type, __otherCasted.type);
    }
}
