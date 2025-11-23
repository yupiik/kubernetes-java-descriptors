package io.yupiik.kubernetes.bindings.v1_28_8.v1beta2;

import io.yupiik.kubernetes.bindings.v1_28_8.Exportable;
import io.yupiik.kubernetes.bindings.v1_28_8.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PriorityLevelConfigurationStatus implements Validable<PriorityLevelConfigurationStatus>, Exportable {
    private List<PriorityLevelConfigurationCondition> conditions;

    public PriorityLevelConfigurationStatus() {
        // no-op
    }

    public PriorityLevelConfigurationStatus(final List<PriorityLevelConfigurationCondition> conditions) {
        this.conditions = conditions;
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

    @Override
    public String asJson() {
        return Stream.of(
                    (conditions != null ? "\"conditions\":" + conditions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
