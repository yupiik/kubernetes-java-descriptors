package io.yupiik.kubernetes.bindings.v1_19_9.v1;

import java.util.List;
import java.util.Objects;

public class NamespaceStatus {
    private List<NamespaceStatusConditions> conditions;
    private String phase;

    public NamespaceStatus() {
        // no-op
    }

    public NamespaceStatus(final List<NamespaceStatusConditions> conditions,
                           final String phase) {
        // no-op
    }

    public List<NamespaceStatusConditions> getConditions() {
        return conditions;
    }

    public void setConditions(final List<NamespaceStatusConditions> conditions) {
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
}
