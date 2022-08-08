package io.yupiik.kubernetes.bindings.v1_23_2;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecReadinessGates {
    private ReplicaSetSpecTemplateSpecReadinessGatesConditionType conditionType;

    public ReplicaSetSpecTemplateSpecReadinessGates() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecReadinessGates(final ReplicaSetSpecTemplateSpecReadinessGatesConditionType conditionType) {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecReadinessGatesConditionType getConditionType() {
        return conditionType;
    }

    public void setConditionType(final ReplicaSetSpecTemplateSpecReadinessGatesConditionType conditionType) {
        this.conditionType = conditionType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conditionType);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicaSetSpecTemplateSpecReadinessGates)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecReadinessGates __otherCasted = (ReplicaSetSpecTemplateSpecReadinessGates) __other;
        return Objects.equals(conditionType, __otherCasted.conditionType);
    }
}
