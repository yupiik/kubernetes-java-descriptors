package io.yupiik.kubernetes.bindings.v1_17_10.v1;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecReadinessGates {
    private String conditionType;

    public DaemonSetListItemsSpecTemplateSpecReadinessGates() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecReadinessGates(final String conditionType) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecReadinessGates)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecReadinessGates __otherCasted = (DaemonSetListItemsSpecTemplateSpecReadinessGates) __other;
        return Objects.equals(conditionType, __otherCasted.conditionType);
    }
}
