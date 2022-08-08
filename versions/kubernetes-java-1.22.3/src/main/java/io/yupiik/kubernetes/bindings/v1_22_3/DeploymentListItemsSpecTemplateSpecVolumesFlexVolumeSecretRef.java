package io.yupiik.kubernetes.bindings.v1_22_3;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecVolumesFlexVolumeSecretRef {
    private String name;

    public DeploymentListItemsSpecTemplateSpecVolumesFlexVolumeSecretRef() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecVolumesFlexVolumeSecretRef(final String name) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecVolumesFlexVolumeSecretRef)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecVolumesFlexVolumeSecretRef __otherCasted = (DeploymentListItemsSpecTemplateSpecVolumesFlexVolumeSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
