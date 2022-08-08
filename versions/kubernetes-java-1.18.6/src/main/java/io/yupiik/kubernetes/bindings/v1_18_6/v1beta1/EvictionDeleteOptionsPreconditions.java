package io.yupiik.kubernetes.bindings.v1_18_6.v1beta1;

import java.util.Objects;

public class EvictionDeleteOptionsPreconditions {
    private String resourceVersion;
    private String uid;

    public EvictionDeleteOptionsPreconditions() {
        // no-op
    }

    public EvictionDeleteOptionsPreconditions(final String resourceVersion,
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
        if (!(__other instanceof EvictionDeleteOptionsPreconditions)) {
            return false;
        }
        final EvictionDeleteOptionsPreconditions __otherCasted = (EvictionDeleteOptionsPreconditions) __other;
        return Objects.equals(resourceVersion, __otherCasted.resourceVersion) &&
            Objects.equals(uid, __otherCasted.uid);
    }
}
