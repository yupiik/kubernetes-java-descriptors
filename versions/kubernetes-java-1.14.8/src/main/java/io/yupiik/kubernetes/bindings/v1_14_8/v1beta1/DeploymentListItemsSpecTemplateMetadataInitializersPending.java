package io.yupiik.kubernetes.bindings.v1_14_8.v1beta1;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateMetadataInitializersPending {
    private String name;

    public DeploymentListItemsSpecTemplateMetadataInitializersPending() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateMetadataInitializersPending)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateMetadataInitializersPending __otherCasted = (DeploymentListItemsSpecTemplateMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
