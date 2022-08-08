package io.yupiik.kubernetes.bindings.v1_19_0.v1;

import java.util.Objects;

public class PodTemplateTemplateSpecReadinessGates {
    private String conditionType;

    public PodTemplateTemplateSpecReadinessGates() {
        // no-op
    }

    public PodTemplateTemplateSpecReadinessGates(final String conditionType) {
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
        if (!(__other instanceof PodTemplateTemplateSpecReadinessGates)) {
            return false;
        }
        final PodTemplateTemplateSpecReadinessGates __otherCasted = (PodTemplateTemplateSpecReadinessGates) __other;
        return Objects.equals(conditionType, __otherCasted.conditionType);
    }
}
