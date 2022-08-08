package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecReadinessGates {
    private ReplicaSetListItemsSpecTemplateSpecReadinessGatesConditionType conditionType;

    public ReplicaSetListItemsSpecTemplateSpecReadinessGates() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecReadinessGates(final ReplicaSetListItemsSpecTemplateSpecReadinessGatesConditionType conditionType) {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecReadinessGatesConditionType getConditionType() {
        return conditionType;
    }

    public void setConditionType(final ReplicaSetListItemsSpecTemplateSpecReadinessGatesConditionType conditionType) {
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
