package io.yupiik.kubernetes.bindings.v1_22_0.v1beta1;

import java.util.List;
import java.util.Objects;

public class PriorityLevelConfigurationStatus {
    private List<PriorityLevelConfigurationStatusConditions> conditions;

    public PriorityLevelConfigurationStatus() {
        // no-op
    }

    public PriorityLevelConfigurationStatus(final List<PriorityLevelConfigurationStatusConditions> conditions) {
        // no-op
    }

    public List<PriorityLevelConfigurationStatusConditions> getConditions() {
        return conditions;
    }

    public void setConditions(final List<PriorityLevelConfigurationStatusConditions> conditions) {
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
}
