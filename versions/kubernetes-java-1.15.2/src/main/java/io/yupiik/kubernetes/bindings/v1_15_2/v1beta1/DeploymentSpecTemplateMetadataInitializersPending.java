package io.yupiik.kubernetes.bindings.v1_15_2.v1beta1;

import java.util.Objects;

public class DeploymentSpecTemplateMetadataInitializersPending {
    private String name;

    public DeploymentSpecTemplateMetadataInitializersPending() {
        // no-op
    }

    public DeploymentSpecTemplateMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof DeploymentSpecTemplateMetadataInitializersPending)) {
            return false;
        }
        final DeploymentSpecTemplateMetadataInitializersPending __otherCasted = (DeploymentSpecTemplateMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
