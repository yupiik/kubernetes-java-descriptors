package io.yupiik.kubernetes.bindings.v1_17_9.v1;

import java.util.Objects;

public class NodeListItemsStatusConfig {
    private NodeListItemsStatusConfigActive active;
    private NodeListItemsStatusConfigAssigned assigned;
    private String error;
    private NodeListItemsStatusConfigLastKnownGood lastKnownGood;

    public NodeListItemsStatusConfig() {
        // no-op
    }

    public NodeListItemsStatusConfig(final NodeListItemsStatusConfigActive active,
                                     final NodeListItemsStatusConfigAssigned assigned,
                                     final String error,
                                     final NodeListItemsStatusConfigLastKnownGood lastKnownGood) {
        // no-op
    }

    public NodeListItemsStatusConfigActive getActive() {
        return active;
    }

    public void setActive(final NodeListItemsStatusConfigActive active) {
        this.active = active;
    }

    public NodeListItemsStatusConfigAssigned getAssigned() {
        return assigned;
    }

    public void setAssigned(final NodeListItemsStatusConfigAssigned assigned) {
        this.assigned = assigned;
    }

    public String getError() {
        return error;
    }

    public void setError(final String error) {
        this.error = error;
    }

    public NodeListItemsStatusConfigLastKnownGood getLastKnownGood() {
        return lastKnownGood;
    }

    public void setLastKnownGood(final NodeListItemsStatusConfigLastKnownGood lastKnownGood) {
        this.lastKnownGood = lastKnownGood;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                active,
                assigned,
                error,
                lastKnownGood);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeListItemsStatusConfig)) {
            return false;
        }
        final NodeListItemsStatusConfig __otherCasted = (NodeListItemsStatusConfig) __other;
        return Objects.equals(active, __otherCasted.active) &&
            Objects.equals(assigned, __otherCasted.assigned) &&
            Objects.equals(error, __otherCasted.error) &&
            Objects.equals(lastKnownGood, __otherCasted.lastKnownGood);
    }
}
