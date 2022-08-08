package io.yupiik.kubernetes.bindings.v1_20_2.v1;

import java.util.Objects;

public class JobSpecTemplateSpecReadinessGates {
    private String conditionType;

    public JobSpecTemplateSpecReadinessGates() {
        // no-op
    }

    public JobSpecTemplateSpecReadinessGates(final String conditionType) {
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
        if (!(__other instanceof JobSpecTemplateSpecReadinessGates)) {
            return false;
        }
        final JobSpecTemplateSpecReadinessGates __otherCasted = (JobSpecTemplateSpecReadinessGates) __other;
        return Objects.equals(conditionType, __otherCasted.conditionType);
    }
}
