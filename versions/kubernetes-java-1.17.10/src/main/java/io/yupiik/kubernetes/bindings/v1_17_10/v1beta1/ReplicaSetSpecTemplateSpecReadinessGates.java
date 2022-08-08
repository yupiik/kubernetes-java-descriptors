package io.yupiik.kubernetes.bindings.v1_17_10.v1beta1;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecReadinessGates {
    private String conditionType;

    public ReplicaSetSpecTemplateSpecReadinessGates() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecReadinessGates(final String conditionType) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecReadinessGates)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecReadinessGates __otherCasted = (ReplicaSetSpecTemplateSpecReadinessGates) __other;
        return Objects.equals(conditionType, __otherCasted.conditionType);
    }
}
