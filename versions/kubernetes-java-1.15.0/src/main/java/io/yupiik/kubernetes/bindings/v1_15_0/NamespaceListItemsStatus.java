package io.yupiik.kubernetes.bindings.v1_15_0;

import java.util.Objects;

public class NamespaceListItemsStatus {
    private String phase;

    public NamespaceListItemsStatus() {
        // no-op
    }

    public NamespaceListItemsStatus(final String phase) {
        // no-op
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
                phase);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NamespaceListItemsStatus)) {
            return false;
        }
        final NamespaceListItemsStatus __otherCasted = (NamespaceListItemsStatus) __other;
        return Objects.equals(phase, __otherCasted.phase);
    }
}
