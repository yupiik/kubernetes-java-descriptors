package io.yupiik.kubernetes.bindings.v1_20_14.v1;

import java.util.Objects;

public class PodListItemsSpecReadinessGates {
    private String conditionType;

    public PodListItemsSpecReadinessGates() {
        // no-op
    }

    public PodListItemsSpecReadinessGates(final String conditionType) {
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
        if (!(__other instanceof PodListItemsSpecReadinessGates)) {
            return false;
        }
        final PodListItemsSpecReadinessGates __otherCasted = (PodListItemsSpecReadinessGates) __other;
        return Objects.equals(conditionType, __otherCasted.conditionType);
    }
}
