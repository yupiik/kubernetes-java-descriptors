package io.yupiik.kubernetes.bindings.v1_22_5.v1;

import io.yupiik.kubernetes.bindings.v1_22_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_22_5.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class APIServiceStatus implements Validable<APIServiceStatus>, Exportable {
    private List<APIServiceCondition> conditions;

    public APIServiceStatus() {
        // no-op
    }

    public APIServiceStatus(final List<APIServiceCondition> conditions) {
        this.conditions = conditions;
    }

    public List<APIServiceCondition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<APIServiceCondition> conditions) {
        this.conditions = conditions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conditions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof APIServiceStatus)) {
            return false;
        }
        final APIServiceStatus __otherCasted = (APIServiceStatus) __other;
        return Objects.equals(conditions, __otherCasted.conditions);
    }

    public APIServiceStatus conditions(final List<APIServiceCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    @Override
    public APIServiceStatus validate() {
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
