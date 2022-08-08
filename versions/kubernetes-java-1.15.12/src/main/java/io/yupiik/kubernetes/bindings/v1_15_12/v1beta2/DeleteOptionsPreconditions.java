package io.yupiik.kubernetes.bindings.v1_15_12.v1beta2;

import java.util.Objects;

public class DeleteOptionsPreconditions {
    private String resourceVersion;
    private String uid;

    public DeleteOptionsPreconditions() {
        // no-op
    }

    public DeleteOptionsPreconditions(final String resourceVersion,
                                      final String uid) {
        // no-op
    }

    public String getResourceVersion() {
        return resourceVersion;
    }

    public void setResourceVersion(final String resourceVersion) {
        this.resourceVersion = resourceVersion;
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
                resourceVersion,
                uid);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeleteOptionsPreconditions)) {
            return false;
        }
        final DeleteOptionsPreconditions __otherCasted = (DeleteOptionsPreconditions) __other;
        return Objects.equals(resourceVersion, __otherCasted.resourceVersion) &&
            Objects.equals(uid, __otherCasted.uid);
    }
}
