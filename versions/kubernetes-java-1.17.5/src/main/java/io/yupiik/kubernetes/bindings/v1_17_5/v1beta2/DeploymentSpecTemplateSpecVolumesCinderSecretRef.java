package io.yupiik.kubernetes.bindings.v1_17_5.v1beta2;

import java.util.Objects;

public class DeploymentSpecTemplateSpecVolumesCinderSecretRef {
    private String name;

    public DeploymentSpecTemplateSpecVolumesCinderSecretRef() {
        // no-op
    }

    public DeploymentSpecTemplateSpecVolumesCinderSecretRef(final String name) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecVolumesCinderSecretRef)) {
            return false;
        }
        final DeploymentSpecTemplateSpecVolumesCinderSecretRef __otherCasted = (DeploymentSpecTemplateSpecVolumesCinderSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
