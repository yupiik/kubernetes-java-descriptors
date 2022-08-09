package io.yupiik.kubernetes.bindings.v1_23_2.v1;

import io.yupiik.kubernetes.bindings.v1_23_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_23_2.Validable;
import io.yupiik.kubernetes.bindings.v1_23_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NamespaceStatus implements Validable<NamespaceStatus>, Exportable {
    private List<NamespaceCondition> conditions;
    private NamespaceStatusPhase phase;

    public NamespaceStatus() {
        // no-op
    }

    public NamespaceStatus(final List<NamespaceCondition> conditions,
                           final NamespaceStatusPhase phase) {
        // no-op
    }

    public List<NamespaceCondition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<NamespaceCondition> conditions) {
        this.conditions = conditions;
    }

    public NamespaceStatusPhase getPhase() {
        return phase;
    }

    public void setPhase(final NamespaceStatusPhase phase) {
        this.phase = phase;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conditions,
                phase);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NamespaceStatus)) {
            return false;
        }
        final NamespaceStatus __otherCasted = (NamespaceStatus) __other;
        return Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(phase, __otherCasted.phase);
    }

    public NamespaceStatus conditions(final List<NamespaceCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public NamespaceStatus phase(final NamespaceStatusPhase phase) {
        this.phase = phase;
        return this;
    }

    @Override
    public NamespaceStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (conditions != null ? "\"conditions\":" + conditions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (phase != null ? "\"phase\":" + phase.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
