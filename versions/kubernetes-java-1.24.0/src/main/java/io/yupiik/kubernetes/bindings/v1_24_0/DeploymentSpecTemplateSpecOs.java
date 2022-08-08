package io.yupiik.kubernetes.bindings.v1_24_0;

import java.util.Objects;

public class DeploymentSpecTemplateSpecOs {
    private String name;

    public DeploymentSpecTemplateSpecOs() {
        // no-op
    }

    public DeploymentSpecTemplateSpecOs(final String name) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecOs)) {
            return false;
        }
        final DeploymentSpecTemplateSpecOs __otherCasted = (DeploymentSpecTemplateSpecOs) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
