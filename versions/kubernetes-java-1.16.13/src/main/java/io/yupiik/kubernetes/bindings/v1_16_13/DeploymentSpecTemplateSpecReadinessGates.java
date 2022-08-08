package io.yupiik.kubernetes.bindings.v1_16_13;

import java.util.Objects;

public class DeploymentSpecTemplateSpecReadinessGates {
    private String conditionType;

    public DeploymentSpecTemplateSpecReadinessGates() {
        // no-op
    }

    public DeploymentSpecTemplateSpecReadinessGates(final String conditionType) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecReadinessGates)) {
            return false;
        }
        final DeploymentSpecTemplateSpecReadinessGates __otherCasted = (DeploymentSpecTemplateSpecReadinessGates) __other;
        return Objects.equals(conditionType, __otherCasted.conditionType);
    }
}
