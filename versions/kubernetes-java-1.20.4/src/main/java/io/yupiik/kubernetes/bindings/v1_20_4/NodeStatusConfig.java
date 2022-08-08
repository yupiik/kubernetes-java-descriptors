package io.yupiik.kubernetes.bindings.v1_20_4;

import java.util.Objects;

public class NodeStatusConfig {
    private NodeStatusConfigActive active;
    private NodeStatusConfigAssigned assigned;
    private String error;
    private NodeStatusConfigLastKnownGood lastKnownGood;

    public NodeStatusConfig() {
        // no-op
    }

    public NodeStatusConfig(final NodeStatusConfigActive active,
                            final NodeStatusConfigAssigned assigned,
                            final String error,
                            final NodeStatusConfigLastKnownGood lastKnownGood) {
        // no-op
    }

    public NodeStatusConfigActive getActive() {
        return active;
    }

    public void setActive(final NodeStatusConfigActive active) {
        this.active = active;
    }

    public NodeStatusConfigAssigned getAssigned() {
        return assigned;
    }

    public void setAssigned(final NodeStatusConfigAssigned assigned) {
        this.assigned = assigned;
    }

    public String getError() {
        return error;
    }

    public void setError(final String error) {
        this.error = error;
    }

    public NodeStatusConfigLastKnownGood getLastKnownGood() {
        return lastKnownGood;
    }

    public void setLastKnownGood(final NodeStatusConfigLastKnownGood lastKnownGood) {
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
        if (!(__other instanceof NodeStatusConfig)) {
            return false;
        }
        final NodeStatusConfig __otherCasted = (NodeStatusConfig) __other;
        return Objects.equals(active, __otherCasted.active) &&
            Objects.equals(assigned, __otherCasted.assigned) &&
            Objects.equals(error, __otherCasted.error) &&
            Objects.equals(lastKnownGood, __otherCasted.lastKnownGood);
    }
}
