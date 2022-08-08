package io.yupiik.kubernetes.bindings.v1_22_2.v1;

import java.util.Objects;

public class DeploymentSpecStrategy {
    private DeploymentSpecStrategyRollingUpdate rollingUpdate;
    private String type;

    public DeploymentSpecStrategy() {
        // no-op
    }

    public DeploymentSpecStrategy(final DeploymentSpecStrategyRollingUpdate rollingUpdate,
                                  final String type) {
        // no-op
    }

    public DeploymentSpecStrategyRollingUpdate getRollingUpdate() {
        return rollingUpdate;
    }

    public void setRollingUpdate(final DeploymentSpecStrategyRollingUpdate rollingUpdate) {
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
        if (!(__other instanceof DeploymentSpecStrategy)) {
            return false;
        }
        final DeploymentSpecStrategy __otherCasted = (DeploymentSpecStrategy) __other;
        return Objects.equals(rollingUpdate, __otherCasted.rollingUpdate) &&
            Objects.equals(type, __otherCasted.type);
    }
}
