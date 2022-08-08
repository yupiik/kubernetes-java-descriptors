package io.yupiik.kubernetes.bindings.v1_23_4;

import java.util.Objects;

public class DeploymentListItemsSpecStrategy {
    private DeploymentListItemsSpecStrategyRollingUpdate rollingUpdate;
    private DeploymentListItemsSpecStrategyType type;

    public DeploymentListItemsSpecStrategy() {
        // no-op
    }

    public DeploymentListItemsSpecStrategy(final DeploymentListItemsSpecStrategyRollingUpdate rollingUpdate,
                                           final DeploymentListItemsSpecStrategyType type) {
        // no-op
    }

    public DeploymentListItemsSpecStrategyRollingUpdate getRollingUpdate() {
        return rollingUpdate;
    }

    public void setRollingUpdate(final DeploymentListItemsSpecStrategyRollingUpdate rollingUpdate) {
        this.rollingUpdate = rollingUpdate;
    }

    public DeploymentListItemsSpecStrategyType getType() {
        return type;
    }

    public void setType(final DeploymentListItemsSpecStrategyType type) {
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
        if (!(__other instanceof DeploymentListItemsSpecStrategy)) {
            return false;
        }
        final DeploymentListItemsSpecStrategy __otherCasted = (DeploymentListItemsSpecStrategy) __other;
        return Objects.equals(rollingUpdate, __otherCasted.rollingUpdate) &&
            Objects.equals(type, __otherCasted.type);
    }
}
