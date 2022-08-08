package io.yupiik.kubernetes.bindings.v1_23_1;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecReadinessGates {
    private StatefulSetListItemsSpecTemplateSpecReadinessGatesConditionType conditionType;

    public StatefulSetListItemsSpecTemplateSpecReadinessGates() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecReadinessGates(final StatefulSetListItemsSpecTemplateSpecReadinessGatesConditionType conditionType) {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecReadinessGatesConditionType getConditionType() {
        return conditionType;
    }

    public void setConditionType(final StatefulSetListItemsSpecTemplateSpecReadinessGatesConditionType conditionType) {
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
