package io.yupiik.kubernetes.bindings.v1_14_0.v1beta2;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecVolumesCephfsSecretRef {
    private String name;

    public DeploymentListItemsSpecTemplateSpecVolumesCephfsSecretRef() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecVolumesCephfsSecretRef(final String name) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecVolumesCephfsSecretRef)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecVolumesCephfsSecretRef __otherCasted = (DeploymentListItemsSpecTemplateSpecVolumesCephfsSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
