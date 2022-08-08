package io.yupiik.kubernetes.bindings.v1_23_3.v1;

import java.util.Objects;

public class PodTemplateTemplateSpecReadinessGates {
    private PodTemplateTemplateSpecReadinessGatesConditionType conditionType;

    public PodTemplateTemplateSpecReadinessGates() {
        // no-op
    }

    public PodTemplateTemplateSpecReadinessGates(final PodTemplateTemplateSpecReadinessGatesConditionType conditionType) {
        // no-op
    }

    public PodTemplateTemplateSpecReadinessGatesConditionType getConditionType() {
        return conditionType;
    }

    public void setConditionType(final PodTemplateTemplateSpecReadinessGatesConditionType conditionType) {
        this.conditionType = conditionType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conditionType);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodTemplateTemplateSpecReadinessGates)) {
            return false;
        }
        final PodTemplateTemplateSpecReadinessGates __otherCasted = (PodTemplateTemplateSpecReadinessGates) __other;
        return Objects.equals(conditionType, __otherCasted.conditionType);
    }
}
