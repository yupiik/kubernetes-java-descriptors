package io.yupiik.kubernetes.bindings.v1_23_2.v1beta1;

import io.yupiik.kubernetes.bindings.v1_23_2.Validable;
import io.yupiik.kubernetes.bindings.v1_23_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FlowSchemaStatus implements Validable<FlowSchemaStatus> {
    private List<FlowSchemaCondition> conditions;

    public FlowSchemaStatus() {
        // no-op
    }

    public FlowSchemaStatus(final List<FlowSchemaCondition> conditions) {
        // no-op
    }

    public List<FlowSchemaCondition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<FlowSchemaCondition> conditions) {
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

    public FlowSchemaStatus conditions(final List<FlowSchemaCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    @Override
    public FlowSchemaStatus validate() {
        return this;
    }
}
