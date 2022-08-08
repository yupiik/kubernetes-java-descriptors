package io.yupiik.kubernetes.bindings.v1_23_2.v1;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecReadinessGates {
    private DeploymentListItemsSpecTemplateSpecReadinessGatesConditionType conditionType;

    public DeploymentListItemsSpecTemplateSpecReadinessGates() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecReadinessGates(final DeploymentListItemsSpecTemplateSpecReadinessGatesConditionType conditionType) {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecReadinessGatesConditionType getConditionType() {
        return conditionType;
    }

    public void setConditionType(final DeploymentListItemsSpecTemplateSpecReadinessGatesConditionType conditionType) {
        this.conditionType = conditionType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conditionType);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecReadinessGates)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecReadinessGates __otherCasted = (DeploymentListItemsSpecTemplateSpecReadinessGates) __other;
        return Objects.equals(conditionType, __otherCasted.conditionType);
    }
}
