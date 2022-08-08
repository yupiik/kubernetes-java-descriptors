package io.yupiik.kubernetes.bindings.v1_16_10.v1;

import io.yupiik.kubernetes.bindings.v1_16_10.Validable;
import io.yupiik.kubernetes.bindings.v1_16_10.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NamespaceStatus implements Validable<NamespaceStatus> {
    private List<NamespaceCondition> conditions;
    private String phase;

    public NamespaceStatus() {
        // no-op
    }

    public NamespaceStatus(final List<NamespaceCondition> conditions,
                           final String phase) {
        // no-op
    }

    public List<NamespaceCondition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<NamespaceCondition> conditions) {
        this.conditions = conditions;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(final String phase) {
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

    public NamespaceStatus phase(final String phase) {
        this.phase = phase;
        return this;
    }

    @Override
    public NamespaceStatus validate() {
        return this;
    }
}
