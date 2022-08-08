package io.yupiik.kubernetes.bindings.v1_15_11.v1;

import io.yupiik.kubernetes.bindings.v1_15_11.Validable;
import io.yupiik.kubernetes.bindings.v1_15_11.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NodeConfigStatus implements Validable<NodeConfigStatus> {
    private NodeConfigSource active;
    private NodeConfigSource assigned;
    private String error;
    private NodeConfigSource lastKnownGood;

    public NodeConfigStatus() {
        // no-op
    }

    public NodeConfigStatus(final NodeConfigSource active,
                            final NodeConfigSource assigned,
                            final String error,
                            final NodeConfigSource lastKnownGood) {
        // no-op
    }

    public NodeConfigSource getActive() {
        return active;
    }

    public void setActive(final NodeConfigSource active) {
        this.active = active;
    }

    public NodeConfigSource getAssigned() {
        return assigned;
    }

    public void setAssigned(final NodeConfigSource assigned) {
        this.assigned = assigned;
    }

    public String getError() {
        return error;
    }

    public void setError(final String error) {
        this.error = error;
    }

    public NodeConfigSource getLastKnownGood() {
        return lastKnownGood;
    }

    public void setLastKnownGood(final NodeConfigSource lastKnownGood) {
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
        if (!(__other instanceof NodeConfigStatus)) {
            return false;
        }
        final NodeConfigStatus __otherCasted = (NodeConfigStatus) __other;
        return Objects.equals(active, __otherCasted.active) &&
            Objects.equals(assigned, __otherCasted.assigned) &&
            Objects.equals(error, __otherCasted.error) &&
            Objects.equals(lastKnownGood, __otherCasted.lastKnownGood);
    }

    public NodeConfigStatus active(final NodeConfigSource active) {
        this.active = active;
        return this;
    }

    public NodeConfigStatus assigned(final NodeConfigSource assigned) {
        this.assigned = assigned;
        return this;
    }

    public NodeConfigStatus error(final String error) {
        this.error = error;
        return this;
    }

    public NodeConfigStatus lastKnownGood(final NodeConfigSource lastKnownGood) {
        this.lastKnownGood = lastKnownGood;
        return this;
    }

    @Override
    public NodeConfigStatus validate() {
        return this;
    }
}
