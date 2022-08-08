package io.yupiik.kubernetes.bindings.v1_23_3;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecReadinessGates {
    private StatefulSetSpecTemplateSpecReadinessGatesConditionType conditionType;

    public StatefulSetSpecTemplateSpecReadinessGates() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecReadinessGates(final StatefulSetSpecTemplateSpecReadinessGatesConditionType conditionType) {
        // no-op
    }

    public StatefulSetSpecTemplateSpecReadinessGatesConditionType getConditionType() {
        return conditionType;
    }

    public void setConditionType(final StatefulSetSpecTemplateSpecReadinessGatesConditionType conditionType) {
        this.conditionType = conditionType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conditionType);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StatefulSetSpecTemplateSpecReadinessGates)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecReadinessGates __otherCasted = (StatefulSetSpecTemplateSpecReadinessGates) __other;
        return Objects.equals(conditionType, __otherCasted.conditionType);
    }
}
