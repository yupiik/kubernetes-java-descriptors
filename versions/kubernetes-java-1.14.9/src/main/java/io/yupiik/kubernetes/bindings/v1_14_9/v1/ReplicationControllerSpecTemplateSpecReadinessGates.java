package io.yupiik.kubernetes.bindings.v1_14_9.v1;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecReadinessGates {
    private String conditionType;

    public ReplicationControllerSpecTemplateSpecReadinessGates() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecReadinessGates(final String conditionType) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecReadinessGates)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecReadinessGates __otherCasted = (ReplicationControllerSpecTemplateSpecReadinessGates) __other;
        return Objects.equals(conditionType, __otherCasted.conditionType);
    }
}
