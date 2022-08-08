package io.yupiik.kubernetes.bindings.v1_23_5;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecReadinessGates {
    private CronJobSpecJobTemplateSpecTemplateSpecReadinessGatesConditionType conditionType;

    public CronJobSpecJobTemplateSpecTemplateSpecReadinessGates() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecReadinessGates(final CronJobSpecJobTemplateSpecTemplateSpecReadinessGatesConditionType conditionType) {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecReadinessGatesConditionType getConditionType() {
        return conditionType;
    }

    public void setConditionType(final CronJobSpecJobTemplateSpecTemplateSpecReadinessGatesConditionType conditionType) {
        this.conditionType = conditionType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conditionType);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecReadinessGates)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecReadinessGates __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecReadinessGates) __other;
        return Objects.equals(conditionType, __otherCasted.conditionType);
    }
}
