package io.yupiik.kubernetes.bindings.v1_23_0.v1;

import java.util.Objects;

public class JobSpecTemplateSpecReadinessGates {
    private JobSpecTemplateSpecReadinessGatesConditionType conditionType;

    public JobSpecTemplateSpecReadinessGates() {
        // no-op
    }

    public JobSpecTemplateSpecReadinessGates(final JobSpecTemplateSpecReadinessGatesConditionType conditionType) {
        // no-op
    }

    public JobSpecTemplateSpecReadinessGatesConditionType getConditionType() {
        return conditionType;
    }

    public void setConditionType(final JobSpecTemplateSpecReadinessGatesConditionType conditionType) {
        this.conditionType = conditionType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conditionType);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof JobSpecTemplateSpecReadinessGates)) {
            return false;
        }
        final JobSpecTemplateSpecReadinessGates __otherCasted = (JobSpecTemplateSpecReadinessGates) __other;
        return Objects.equals(conditionType, __otherCasted.conditionType);
    }
}
