package io.yupiik.kubernetes.bindings.v1_16_11;

import java.util.Objects;

public class DeploymentSpecTemplateSpecImagePullSecrets {
    private String name;

    public DeploymentSpecTemplateSpecImagePullSecrets() {
        // no-op
    }

    public DeploymentSpecTemplateSpecImagePullSecrets(final String name) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecImagePullSecrets)) {
            return false;
        }
        final DeploymentSpecTemplateSpecImagePullSecrets __otherCasted = (DeploymentSpecTemplateSpecImagePullSecrets) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
