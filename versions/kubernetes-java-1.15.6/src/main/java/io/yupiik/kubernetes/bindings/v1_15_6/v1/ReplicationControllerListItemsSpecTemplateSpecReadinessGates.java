package io.yupiik.kubernetes.bindings.v1_15_6.v1;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecReadinessGates {
    private String conditionType;

    public ReplicationControllerListItemsSpecTemplateSpecReadinessGates() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecReadinessGates(final String conditionType) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecReadinessGates)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecReadinessGates __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecReadinessGates) __other;
        return Objects.equals(conditionType, __otherCasted.conditionType);
    }
}
