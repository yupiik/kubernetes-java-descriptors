package io.yupiik.kubernetes.bindings.v1_11_6;

import java.util.Objects;

public class EvictionDeleteOptionsPreconditions {
    private String uid;

    public EvictionDeleteOptionsPreconditions() {
        // no-op
    }

    public EvictionDeleteOptionsPreconditions(final String uid) {
        // no-op
    }

    public String getUid() {
        return uid;
    }

    public void setUid(final String uid) {
        this.uid = uid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                uid);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EvictionDeleteOptionsPreconditions)) {
            return false;
        }
        final EvictionDeleteOptionsPreconditions __otherCasted = (EvictionDeleteOptionsPreconditions) __other;
        return Objects.equals(uid, __otherCasted.uid);
    }
}
