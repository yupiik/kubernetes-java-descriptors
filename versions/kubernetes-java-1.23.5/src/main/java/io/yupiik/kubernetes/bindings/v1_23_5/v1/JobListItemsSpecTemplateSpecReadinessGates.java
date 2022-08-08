package io.yupiik.kubernetes.bindings.v1_23_5.v1;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecReadinessGates {
    private JobListItemsSpecTemplateSpecReadinessGatesConditionType conditionType;

    public JobListItemsSpecTemplateSpecReadinessGates() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecReadinessGates(final JobListItemsSpecTemplateSpecReadinessGatesConditionType conditionType) {
        // no-op
    }

    public JobListItemsSpecTemplateSpecReadinessGatesConditionType getConditionType() {
        return conditionType;
    }

    public void setConditionType(final JobListItemsSpecTemplateSpecReadinessGatesConditionType conditionType) {
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
