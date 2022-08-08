package io.yupiik.kubernetes.bindings.v1_23_5.v1;

import java.util.List;
import java.util.Objects;

public class NamespaceListItemsStatus {
    private List<NamespaceListItemsStatusConditions> conditions;
    private NamespaceListItemsStatusPhase phase;

    public NamespaceListItemsStatus() {
        // no-op
    }

    public NamespaceListItemsStatus(final List<NamespaceListItemsStatusConditions> conditions,
                                    final NamespaceListItemsStatusPhase phase) {
        // no-op
    }

    public List<NamespaceListItemsStatusConditions> getConditions() {
        return conditions;
    }

    public void setConditions(final List<NamespaceListItemsStatusConditions> conditions) {
        this.conditions = conditions;
    }

    public NamespaceListItemsStatusPhase getPhase() {
        return phase;
    }

    public void setPhase(final NamespaceListItemsStatusPhase phase) {
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
        if (!(__other instanceof NamespaceListItemsStatus)) {
            return false;
        }
        final NamespaceListItemsStatus __otherCasted = (NamespaceListItemsStatus) __other;
        return Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(phase, __otherCasted.phase);
    }
}
