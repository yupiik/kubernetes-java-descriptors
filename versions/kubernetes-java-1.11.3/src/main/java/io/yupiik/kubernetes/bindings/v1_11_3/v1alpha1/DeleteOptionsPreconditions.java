package io.yupiik.kubernetes.bindings.v1_11_3.v1alpha1;

import java.util.Objects;

public class DeleteOptionsPreconditions {
    private String uid;

    public DeleteOptionsPreconditions() {
        // no-op
    }

    public DeleteOptionsPreconditions(final String uid) {
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
        if (!(__other instanceof DeleteOptionsPreconditions)) {
            return false;
        }
        final DeleteOptionsPreconditions __otherCasted = (DeleteOptionsPreconditions) __other;
        return Objects.equals(uid, __otherCasted.uid);
    }
}
