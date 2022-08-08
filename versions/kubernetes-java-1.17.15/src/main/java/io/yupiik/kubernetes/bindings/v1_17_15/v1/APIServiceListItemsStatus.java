package io.yupiik.kubernetes.bindings.v1_17_15.v1;

import java.util.List;
import java.util.Objects;

public class APIServiceListItemsStatus {
    private List<APIServiceListItemsStatusConditions> conditions;

    public APIServiceListItemsStatus() {
        // no-op
    }

    public APIServiceListItemsStatus(final List<APIServiceListItemsStatusConditions> conditions) {
        // no-op
    }

    public List<APIServiceListItemsStatusConditions> getConditions() {
        return conditions;
    }

    public void setConditions(final List<APIServiceListItemsStatusConditions> conditions) {
        this.conditions = conditions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conditions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof APIServiceListItemsStatus)) {
            return false;
        }
        final APIServiceListItemsStatus __otherCasted = (APIServiceListItemsStatus) __other;
        return Objects.equals(conditions, __otherCasted.conditions);
    }
}
