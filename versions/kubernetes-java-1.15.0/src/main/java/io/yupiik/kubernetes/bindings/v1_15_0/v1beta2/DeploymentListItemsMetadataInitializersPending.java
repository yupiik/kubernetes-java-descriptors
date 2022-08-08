package io.yupiik.kubernetes.bindings.v1_15_0.v1beta2;

import java.util.Objects;

public class DeploymentListItemsMetadataInitializersPending {
    private String name;

    public DeploymentListItemsMetadataInitializersPending() {
        // no-op
    }

    public DeploymentListItemsMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof DeploymentListItemsMetadataInitializersPending)) {
            return false;
        }
        final DeploymentListItemsMetadataInitializersPending __otherCasted = (DeploymentListItemsMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
