package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecReadinessGates {
    private DaemonSetSpecTemplateSpecReadinessGatesConditionType conditionType;

    public DaemonSetSpecTemplateSpecReadinessGates() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecReadinessGates(final DaemonSetSpecTemplateSpecReadinessGatesConditionType conditionType) {
        // no-op
    }

    public DaemonSetSpecTemplateSpecReadinessGatesConditionType getConditionType() {
        return conditionType;
    }

    public void setConditionType(final DaemonSetSpecTemplateSpecReadinessGatesConditionType conditionType) {
        this.conditionType = conditionType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conditionType);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DaemonSetSpecTemplateSpecReadinessGates)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecReadinessGates __otherCasted = (DaemonSetSpecTemplateSpecReadinessGates) __other;
        return Objects.equals(conditionType, __otherCasted.conditionType);
    }
}
