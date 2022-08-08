package io.yupiik.kubernetes.bindings.v1_17_0.v1;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecReadinessGates {
    private String conditionType;

    public DeploymentListItemsSpecTemplateSpecReadinessGates() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecReadinessGates(final String conditionType) {
        // no-op
    }

    public String getConditionType() {
        return conditionType;
    }

    public void setConditionType(final String conditionType) {
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
