package io.yupiik.kubernetes.bindings.v1_17_2;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecReadinessGates {
    private String conditionType;

    public PodTemplateListItemsTemplateSpecReadinessGates() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecReadinessGates(final String conditionType) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecReadinessGates)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecReadinessGates __otherCasted = (PodTemplateListItemsTemplateSpecReadinessGates) __other;
        return Objects.equals(conditionType, __otherCasted.conditionType);
    }
}
