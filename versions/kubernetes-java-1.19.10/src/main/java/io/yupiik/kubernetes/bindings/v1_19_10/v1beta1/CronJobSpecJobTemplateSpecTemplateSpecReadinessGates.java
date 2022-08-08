package io.yupiik.kubernetes.bindings.v1_19_10.v1beta1;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecReadinessGates {
    private String conditionType;

    public CronJobSpecJobTemplateSpecTemplateSpecReadinessGates() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecReadinessGates(final String conditionType) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecReadinessGates)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecReadinessGates __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecReadinessGates) __other;
        return Objects.equals(conditionType, __otherCasted.conditionType);
    }
}
