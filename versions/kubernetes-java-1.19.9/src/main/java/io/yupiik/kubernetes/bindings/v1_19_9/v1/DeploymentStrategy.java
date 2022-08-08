package io.yupiik.kubernetes.bindings.v1_19_9.v1;

import io.yupiik.kubernetes.bindings.v1_19_9.Validable;
import io.yupiik.kubernetes.bindings.v1_19_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DeploymentStrategy implements Validable<DeploymentStrategy> {
    private RollingUpdateDeployment rollingUpdate;
    private String type;

    public DeploymentStrategy() {
        // no-op
    }

    public DeploymentStrategy(final RollingUpdateDeployment rollingUpdate,
                              final String type) {
        // no-op
    }

    public RollingUpdateDeployment getRollingUpdate() {
        return rollingUpdate;
    }

    public void setRollingUpdate(final RollingUpdateDeployment rollingUpdate) {
        this.rollingUpdate = rollingUpdate;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                rollingUpdate,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeploymentStrategy)) {
            return false;
        }
        final DeploymentStrategy __otherCasted = (DeploymentStrategy) __other;
        return Objects.equals(rollingUpdate, __otherCasted.rollingUpdate) &&
            Objects.equals(type, __otherCasted.type);
    }

    public DeploymentStrategy rollingUpdate(final RollingUpdateDeployment rollingUpdate) {
        this.rollingUpdate = rollingUpdate;
        return this;
    }

    public DeploymentStrategy type(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public DeploymentStrategy validate() {
        return this;
    }
}
