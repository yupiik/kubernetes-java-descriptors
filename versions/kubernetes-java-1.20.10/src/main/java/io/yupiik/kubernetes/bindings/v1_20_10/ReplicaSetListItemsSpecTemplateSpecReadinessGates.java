package io.yupiik.kubernetes.bindings.v1_20_10;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecReadinessGates {
    private String conditionType;

    public ReplicaSetListItemsSpecTemplateSpecReadinessGates() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecReadinessGates(final String conditionType) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecReadinessGates)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecReadinessGates __otherCasted = (ReplicaSetListItemsSpecTemplateSpecReadinessGates) __other;
        return Objects.equals(conditionType, __otherCasted.conditionType);
    }
}
