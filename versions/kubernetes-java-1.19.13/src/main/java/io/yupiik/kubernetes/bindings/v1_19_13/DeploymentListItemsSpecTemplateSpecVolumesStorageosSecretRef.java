package io.yupiik.kubernetes.bindings.v1_19_13;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecVolumesStorageosSecretRef {
    private String name;

    public DeploymentListItemsSpecTemplateSpecVolumesStorageosSecretRef() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecVolumesStorageosSecretRef(final String name) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecVolumesStorageosSecretRef)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecVolumesStorageosSecretRef __otherCasted = (DeploymentListItemsSpecTemplateSpecVolumesStorageosSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
