package io.yupiik.kubernetes.bindings.v1_16_4.v1beta1;

import java.util.Objects;

public class DeploymentSpecTemplateSpecVolumesScaleIOSecretRef {
    private String name;

    public DeploymentSpecTemplateSpecVolumesScaleIOSecretRef() {
        // no-op
    }

    public DeploymentSpecTemplateSpecVolumesScaleIOSecretRef(final String name) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecVolumesScaleIOSecretRef)) {
            return false;
        }
        final DeploymentSpecTemplateSpecVolumesScaleIOSecretRef __otherCasted = (DeploymentSpecTemplateSpecVolumesScaleIOSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
