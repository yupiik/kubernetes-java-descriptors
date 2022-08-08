package io.yupiik.kubernetes.bindings.v1_15_5.v1beta2;

import io.yupiik.kubernetes.bindings.v1_15_5.Validable;
import io.yupiik.kubernetes.bindings.v1_15_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Preconditions implements Validable<Preconditions> {
    private String resourceVersion;
    private String uid;

    public Preconditions() {
        // no-op
    }

    public Preconditions(final String resourceVersion,
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
        if (!(__other instanceof Preconditions)) {
            return false;
        }
        final Preconditions __otherCasted = (Preconditions) __other;
        return Objects.equals(resourceVersion, __otherCasted.resourceVersion) &&
            Objects.equals(uid, __otherCasted.uid);
    }

    public Preconditions resourceVersion(final String resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public Preconditions uid(final String uid) {
        this.uid = uid;
        return this;
    }

    @Override
    public Preconditions validate() {
        return this;
    }
}
