package io.yupiik.kubernetes.bindings.v1_23_1.v1;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecReadinessGates {
    private PodTemplateListItemsTemplateSpecReadinessGatesConditionType conditionType;

    public PodTemplateListItemsTemplateSpecReadinessGates() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecReadinessGates(final PodTemplateListItemsTemplateSpecReadinessGatesConditionType conditionType) {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecReadinessGatesConditionType getConditionType() {
        return conditionType;
    }

    public void setConditionType(final PodTemplateListItemsTemplateSpecReadinessGatesConditionType conditionType) {
        this.conditionType = conditionType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conditionType);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodTemplateListItemsTemplateSpecReadinessGates)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecReadinessGates __otherCasted = (PodTemplateListItemsTemplateSpecReadinessGates) __other;
        return Objects.equals(conditionType, __otherCasted.conditionType);
    }
}
