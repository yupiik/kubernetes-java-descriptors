package io.yupiik.kubernetes.bindings.v1_20_10.v1;

import java.util.Objects;

public class PodSpecReadinessGates {
    private String conditionType;

    public PodSpecReadinessGates() {
        // no-op
    }

    public PodSpecReadinessGates(final String conditionType) {
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
        if (!(__other instanceof PodSpecReadinessGates)) {
            return false;
        }
        final PodSpecReadinessGates __otherCasted = (PodSpecReadinessGates) __other;
        return Objects.equals(conditionType, __otherCasted.conditionType);
    }
}
