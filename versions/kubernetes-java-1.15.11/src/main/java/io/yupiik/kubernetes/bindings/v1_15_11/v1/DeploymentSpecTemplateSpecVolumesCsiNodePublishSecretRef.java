package io.yupiik.kubernetes.bindings.v1_15_11.v1;

import java.util.Objects;

public class DeploymentSpecTemplateSpecVolumesCsiNodePublishSecretRef {
    private String name;

    public DeploymentSpecTemplateSpecVolumesCsiNodePublishSecretRef() {
        // no-op
    }

    public DeploymentSpecTemplateSpecVolumesCsiNodePublishSecretRef(final String name) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecVolumesCsiNodePublishSecretRef)) {
            return false;
        }
        final DeploymentSpecTemplateSpecVolumesCsiNodePublishSecretRef __otherCasted = (DeploymentSpecTemplateSpecVolumesCsiNodePublishSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
