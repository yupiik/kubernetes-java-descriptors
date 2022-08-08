package io.yupiik.kubernetes.bindings.v1_16_6.v1beta2;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecVolumesScaleIOSecretRef {
    private String name;

    public DeploymentListItemsSpecTemplateSpecVolumesScaleIOSecretRef() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecVolumesScaleIOSecretRef(final String name) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecVolumesScaleIOSecretRef)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecVolumesScaleIOSecretRef __otherCasted = (DeploymentListItemsSpecTemplateSpecVolumesScaleIOSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
