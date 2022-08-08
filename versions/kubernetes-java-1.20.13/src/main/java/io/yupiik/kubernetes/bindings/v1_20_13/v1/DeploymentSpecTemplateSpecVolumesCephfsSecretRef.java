package io.yupiik.kubernetes.bindings.v1_20_13.v1;

import java.util.Objects;

public class DeploymentSpecTemplateSpecVolumesCephfsSecretRef {
    private String name;

    public DeploymentSpecTemplateSpecVolumesCephfsSecretRef() {
        // no-op
    }

    public DeploymentSpecTemplateSpecVolumesCephfsSecretRef(final String name) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecVolumesCephfsSecretRef)) {
            return false;
        }
        final DeploymentSpecTemplateSpecVolumesCephfsSecretRef __otherCasted = (DeploymentSpecTemplateSpecVolumesCephfsSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
