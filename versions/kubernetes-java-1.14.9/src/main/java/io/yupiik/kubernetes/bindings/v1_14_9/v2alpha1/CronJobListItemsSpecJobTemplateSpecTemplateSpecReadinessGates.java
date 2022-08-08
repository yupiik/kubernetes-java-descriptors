package io.yupiik.kubernetes.bindings.v1_14_9.v2alpha1;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecReadinessGates {
    private String conditionType;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecReadinessGates() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecReadinessGates(final String conditionType) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecReadinessGates)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecReadinessGates __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecReadinessGates) __other;
        return Objects.equals(conditionType, __otherCasted.conditionType);
    }
}
