package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecOs {
    private String name;

    public DeploymentListItemsSpecTemplateSpecOs() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecOs(final String name) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecOs)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecOs __otherCasted = (DeploymentListItemsSpecTemplateSpecOs) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
