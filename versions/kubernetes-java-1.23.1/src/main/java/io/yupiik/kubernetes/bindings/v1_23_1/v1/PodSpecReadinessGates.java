package io.yupiik.kubernetes.bindings.v1_23_1.v1;

import java.util.Objects;

public class PodSpecReadinessGates {
    private PodSpecReadinessGatesConditionType conditionType;

    public PodSpecReadinessGates() {
        // no-op
    }

    public PodSpecReadinessGates(final PodSpecReadinessGatesConditionType conditionType) {
        // no-op
    }

    public PodSpecReadinessGatesConditionType getConditionType() {
        return conditionType;
    }

    public void setConditionType(final PodSpecReadinessGatesConditionType conditionType) {
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
