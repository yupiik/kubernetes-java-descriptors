package io.yupiik.kubernetes.bindings.v1_21_4.v1;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecReadinessGates {
    private String conditionType;

    public JobListItemsSpecTemplateSpecReadinessGates() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecReadinessGates(final String conditionType) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecReadinessGates)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecReadinessGates __otherCasted = (JobListItemsSpecTemplateSpecReadinessGates) __other;
        return Objects.equals(conditionType, __otherCasted.conditionType);
    }
}
