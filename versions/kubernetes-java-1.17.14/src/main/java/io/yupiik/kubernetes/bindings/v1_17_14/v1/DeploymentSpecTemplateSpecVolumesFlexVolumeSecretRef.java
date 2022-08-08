package io.yupiik.kubernetes.bindings.v1_17_14.v1;

import java.util.Objects;

public class DeploymentSpecTemplateSpecVolumesFlexVolumeSecretRef {
    private String name;

    public DeploymentSpecTemplateSpecVolumesFlexVolumeSecretRef() {
        // no-op
    }

    public DeploymentSpecTemplateSpecVolumesFlexVolumeSecretRef(final String name) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecVolumesFlexVolumeSecretRef)) {
            return false;
        }
        final DeploymentSpecTemplateSpecVolumesFlexVolumeSecretRef __otherCasted = (DeploymentSpecTemplateSpecVolumesFlexVolumeSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
