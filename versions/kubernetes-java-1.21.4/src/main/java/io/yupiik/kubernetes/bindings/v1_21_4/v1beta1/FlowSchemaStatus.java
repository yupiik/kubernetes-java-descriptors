package io.yupiik.kubernetes.bindings.v1_21_4.v1beta1;

import io.yupiik.kubernetes.bindings.v1_21_4.Exportable;
import io.yupiik.kubernetes.bindings.v1_21_4.Validable;
import io.yupiik.kubernetes.bindings.v1_21_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class FlowSchemaStatus implements Validable<FlowSchemaStatus>, Exportable {
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

    @Override
    public String asJson() {
        return Stream.of(
                    (conditions != null ? "\"conditions\":" + conditions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
