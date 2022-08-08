package io.yupiik.kubernetes.bindings.v1_19_3.v1alpha1;

import java.util.List;
import java.util.Objects;

public class FlowSchemaStatus {
    private List<FlowSchemaStatusConditions> conditions;

    public FlowSchemaStatus() {
        // no-op
    }

    public FlowSchemaStatus(final List<FlowSchemaStatusConditions> conditions) {
        // no-op
    }

    public List<FlowSchemaStatusConditions> getConditions() {
        return conditions;
    }

    public void setConditions(final List<FlowSchemaStatusConditions> conditions) {
        this.conditions = conditions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conditions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof FlowSchemaStatus)) {
            return false;
        }
        final FlowSchemaStatus __otherCasted = (FlowSchemaStatus) __other;
        return Objects.equals(conditions, __otherCasted.conditions);
    }
}
