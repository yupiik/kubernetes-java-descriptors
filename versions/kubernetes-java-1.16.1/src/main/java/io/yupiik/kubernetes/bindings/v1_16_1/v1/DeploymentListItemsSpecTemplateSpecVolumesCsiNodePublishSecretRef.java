package io.yupiik.kubernetes.bindings.v1_16_1.v1;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecVolumesCsiNodePublishSecretRef {
    private String name;

    public DeploymentListItemsSpecTemplateSpecVolumesCsiNodePublishSecretRef() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecVolumesCsiNodePublishSecretRef(final String name) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecVolumesCsiNodePublishSecretRef)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecVolumesCsiNodePublishSecretRef __otherCasted = (DeploymentListItemsSpecTemplateSpecVolumesCsiNodePublishSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
