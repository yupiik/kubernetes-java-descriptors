package io.yupiik.kubernetes.bindings.v1_23_2;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecReadinessGates {
    private ReplicationControllerSpecTemplateSpecReadinessGatesConditionType conditionType;

    public ReplicationControllerSpecTemplateSpecReadinessGates() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecReadinessGates(final ReplicationControllerSpecTemplateSpecReadinessGatesConditionType conditionType) {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecReadinessGatesConditionType getConditionType() {
        return conditionType;
    }

    public void setConditionType(final ReplicationControllerSpecTemplateSpecReadinessGatesConditionType conditionType) {
        this.conditionType = conditionType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conditionType);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecReadinessGates)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecReadinessGates __otherCasted = (ReplicationControllerSpecTemplateSpecReadinessGates) __other;
        return Objects.equals(conditionType, __otherCasted.conditionType);
    }
}
