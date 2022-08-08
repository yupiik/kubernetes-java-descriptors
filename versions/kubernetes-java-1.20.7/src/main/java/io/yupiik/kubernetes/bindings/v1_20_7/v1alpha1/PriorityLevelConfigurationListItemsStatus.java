package io.yupiik.kubernetes.bindings.v1_20_7.v1alpha1;

import java.util.List;
import java.util.Objects;

public class PriorityLevelConfigurationListItemsStatus {
    private List<PriorityLevelConfigurationListItemsStatusConditions> conditions;

    public PriorityLevelConfigurationListItemsStatus() {
        // no-op
    }

    public PriorityLevelConfigurationListItemsStatus(final List<PriorityLevelConfigurationListItemsStatusConditions> conditions) {
        // no-op
    }

    public List<PriorityLevelConfigurationListItemsStatusConditions> getConditions() {
        return conditions;
    }

    public void setConditions(final List<PriorityLevelConfigurationListItemsStatusConditions> conditions) {
        this.conditions = conditions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conditions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PriorityLevelConfigurationListItemsStatus)) {
            return false;
        }
        final PriorityLevelConfigurationListItemsStatus __otherCasted = (PriorityLevelConfigurationListItemsStatus) __other;
        return Objects.equals(conditions, __otherCasted.conditions);
    }
}
