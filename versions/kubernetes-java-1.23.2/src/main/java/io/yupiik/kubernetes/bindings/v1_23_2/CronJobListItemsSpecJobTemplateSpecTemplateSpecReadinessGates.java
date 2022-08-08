package io.yupiik.kubernetes.bindings.v1_23_2;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecReadinessGates {
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecReadinessGatesConditionType conditionType;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecReadinessGates() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecReadinessGates(final CronJobListItemsSpecJobTemplateSpecTemplateSpecReadinessGatesConditionType conditionType) {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecReadinessGatesConditionType getConditionType() {
        return conditionType;
    }

    public void setConditionType(final CronJobListItemsSpecJobTemplateSpecTemplateSpecReadinessGatesConditionType conditionType) {
        this.conditionType = conditionType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conditionType);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecReadinessGates)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecReadinessGates __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecReadinessGates) __other;
        return Objects.equals(conditionType, __otherCasted.conditionType);
    }
}
