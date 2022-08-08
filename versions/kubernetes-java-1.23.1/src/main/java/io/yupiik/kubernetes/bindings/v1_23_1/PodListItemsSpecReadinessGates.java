package io.yupiik.kubernetes.bindings.v1_23_1;

import java.util.Objects;

public class PodListItemsSpecReadinessGates {
    private PodListItemsSpecReadinessGatesConditionType conditionType;

    public PodListItemsSpecReadinessGates() {
        // no-op
    }

    public PodListItemsSpecReadinessGates(final PodListItemsSpecReadinessGatesConditionType conditionType) {
        // no-op
    }

    public PodListItemsSpecReadinessGatesConditionType getConditionType() {
        return conditionType;
    }

    public void setConditionType(final PodListItemsSpecReadinessGatesConditionType conditionType) {
        this.conditionType = conditionType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conditionType);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodListItemsSpecReadinessGates)) {
            return false;
        }
        final PodListItemsSpecReadinessGates __otherCasted = (PodListItemsSpecReadinessGates) __other;
        return Objects.equals(conditionType, __otherCasted.conditionType);
    }
}
