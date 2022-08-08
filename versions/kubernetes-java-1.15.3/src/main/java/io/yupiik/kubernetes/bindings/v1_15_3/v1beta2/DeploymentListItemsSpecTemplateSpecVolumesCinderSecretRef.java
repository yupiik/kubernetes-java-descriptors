package io.yupiik.kubernetes.bindings.v1_15_3.v1beta2;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecVolumesCinderSecretRef {
    private String name;

    public DeploymentListItemsSpecTemplateSpecVolumesCinderSecretRef() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecVolumesCinderSecretRef(final String name) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecVolumesCinderSecretRef)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecVolumesCinderSecretRef __otherCasted = (DeploymentListItemsSpecTemplateSpecVolumesCinderSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
