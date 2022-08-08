package io.yupiik.kubernetes.bindings.v1_23_1;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecReadinessGates {
    private DaemonSetListItemsSpecTemplateSpecReadinessGatesConditionType conditionType;

    public DaemonSetListItemsSpecTemplateSpecReadinessGates() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecReadinessGates(final DaemonSetListItemsSpecTemplateSpecReadinessGatesConditionType conditionType) {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecReadinessGatesConditionType getConditionType() {
        return conditionType;
    }

    public void setConditionType(final DaemonSetListItemsSpecTemplateSpecReadinessGatesConditionType conditionType) {
        this.conditionType = conditionType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conditionType);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecReadinessGates)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecReadinessGates __otherCasted = (DaemonSetListItemsSpecTemplateSpecReadinessGates) __other;
        return Objects.equals(conditionType, __otherCasted.conditionType);
    }
}
