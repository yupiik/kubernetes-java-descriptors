package io.yupiik.kubernetes.bindings.v1_16_13.v1beta1;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecReadinessGates {
    private String conditionType;

    public StatefulSetSpecTemplateSpecReadinessGates() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecReadinessGates(final String conditionType) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecReadinessGates)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecReadinessGates __otherCasted = (StatefulSetSpecTemplateSpecReadinessGates) __other;
        return Objects.equals(conditionType, __otherCasted.conditionType);
    }
}
