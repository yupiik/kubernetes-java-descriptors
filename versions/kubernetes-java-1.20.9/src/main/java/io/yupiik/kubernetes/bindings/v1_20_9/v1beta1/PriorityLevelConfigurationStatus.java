package io.yupiik.kubernetes.bindings.v1_20_9.v1beta1;

import io.yupiik.kubernetes.bindings.v1_20_9.Validable;
import io.yupiik.kubernetes.bindings.v1_20_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PriorityLevelConfigurationStatus implements Validable<PriorityLevelConfigurationStatus> {
    private List<PriorityLevelConfigurationCondition> conditions;

    public PriorityLevelConfigurationStatus() {
        // no-op
    }

    public PriorityLevelConfigurationStatus(final List<PriorityLevelConfigurationCondition> conditions) {
        // no-op
    }

    public List<PriorityLevelConfigurationCondition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<PriorityLevelConfigurationCondition> conditions) {
        this.conditions = conditions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conditions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PriorityLevelConfigurationStatus)) {
            return false;
        }
        final PriorityLevelConfigurationStatus __otherCasted = (PriorityLevelConfigurationStatus) __other;
        return Objects.equals(conditions, __otherCasted.conditions);
    }

    public PriorityLevelConfigurationStatus conditions(final List<PriorityLevelConfigurationCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    @Override
    public PriorityLevelConfigurationStatus validate() {
        return this;
    }
}
