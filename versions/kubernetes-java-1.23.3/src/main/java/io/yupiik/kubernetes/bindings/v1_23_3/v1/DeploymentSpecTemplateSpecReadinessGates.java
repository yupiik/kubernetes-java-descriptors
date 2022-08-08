package io.yupiik.kubernetes.bindings.v1_23_3.v1;

import java.util.Objects;

public class DeploymentSpecTemplateSpecReadinessGates {
    private DeploymentSpecTemplateSpecReadinessGatesConditionType conditionType;

    public DeploymentSpecTemplateSpecReadinessGates() {
        // no-op
    }

    public DeploymentSpecTemplateSpecReadinessGates(final DeploymentSpecTemplateSpecReadinessGatesConditionType conditionType) {
        // no-op
    }

    public DeploymentSpecTemplateSpecReadinessGatesConditionType getConditionType() {
        return conditionType;
    }

    public void setConditionType(final DeploymentSpecTemplateSpecReadinessGatesConditionType conditionType) {
        this.conditionType = conditionType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conditionType);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeploymentSpecTemplateSpecReadinessGates)) {
            return false;
        }
        final DeploymentSpecTemplateSpecReadinessGates __otherCasted = (DeploymentSpecTemplateSpecReadinessGates) __other;
        return Objects.equals(conditionType, __otherCasted.conditionType);
    }
}
