package io.yupiik.kubernetes.bindings.v1_21_1.v1beta1;

import java.util.List;
import java.util.Objects;

public class FlowSchemaListItemsStatus {
    private List<FlowSchemaListItemsStatusConditions> conditions;

    public FlowSchemaListItemsStatus() {
        // no-op
    }

    public FlowSchemaListItemsStatus(final List<FlowSchemaListItemsStatusConditions> conditions) {
        // no-op
    }

    public List<FlowSchemaListItemsStatusConditions> getConditions() {
        return conditions;
    }

    public void setConditions(final List<FlowSchemaListItemsStatusConditions> conditions) {
        this.conditions = conditions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conditions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof FlowSchemaListItemsStatus)) {
            return false;
        }
        final FlowSchemaListItemsStatus __otherCasted = (FlowSchemaListItemsStatus) __other;
        return Objects.equals(conditions, __otherCasted.conditions);
    }
}
