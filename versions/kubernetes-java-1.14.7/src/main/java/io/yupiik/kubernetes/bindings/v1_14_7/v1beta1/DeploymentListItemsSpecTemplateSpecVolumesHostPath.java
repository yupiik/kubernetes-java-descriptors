package io.yupiik.kubernetes.bindings.v1_14_7.v1beta1;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecVolumesHostPath {
    private String path;
    private String type;

    public DeploymentListItemsSpecTemplateSpecVolumesHostPath() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecVolumesHostPath(final String path,
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecVolumesHostPath)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecVolumesHostPath __otherCasted = (DeploymentListItemsSpecTemplateSpecVolumesHostPath) __other;
        return Objects.equals(path, __otherCasted.path) &&
            Objects.equals(type, __otherCasted.type);
    }
}
