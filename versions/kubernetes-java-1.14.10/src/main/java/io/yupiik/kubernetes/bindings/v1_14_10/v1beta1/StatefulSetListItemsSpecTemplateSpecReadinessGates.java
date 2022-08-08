package io.yupiik.kubernetes.bindings.v1_14_10.v1beta1;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecReadinessGates {
    private String conditionType;

    public StatefulSetListItemsSpecTemplateSpecReadinessGates() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecReadinessGates(final String conditionType) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecReadinessGates)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecReadinessGates __otherCasted = (StatefulSetListItemsSpecTemplateSpecReadinessGates) __other;
        return Objects.equals(conditionType, __otherCasted.conditionType);
    }
}
