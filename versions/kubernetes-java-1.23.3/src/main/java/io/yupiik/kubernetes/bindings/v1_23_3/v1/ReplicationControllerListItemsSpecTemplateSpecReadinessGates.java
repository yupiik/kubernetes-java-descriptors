package io.yupiik.kubernetes.bindings.v1_23_3.v1;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecReadinessGates {
    private ReplicationControllerListItemsSpecTemplateSpecReadinessGatesConditionType conditionType;

    public ReplicationControllerListItemsSpecTemplateSpecReadinessGates() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecReadinessGates(final ReplicationControllerListItemsSpecTemplateSpecReadinessGatesConditionType conditionType) {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecReadinessGatesConditionType getConditionType() {
        return conditionType;
    }

    public void setConditionType(final ReplicationControllerListItemsSpecTemplateSpecReadinessGatesConditionType conditionType) {
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
