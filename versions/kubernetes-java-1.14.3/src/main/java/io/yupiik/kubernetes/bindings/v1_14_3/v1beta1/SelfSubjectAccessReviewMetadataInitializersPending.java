package io.yupiik.kubernetes.bindings.v1_14_3.v1beta1;

import java.util.Objects;

public class SelfSubjectAccessReviewMetadataInitializersPending {
    private String name;

    public SelfSubjectAccessReviewMetadataInitializersPending() {
        // no-op
    }

    public SelfSubjectAccessReviewMetadataInitializersPending(final String name) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof SelfSubjectAccessReviewMetadataInitializersPending)) {
            return false;
        }
        final SelfSubjectAccessReviewMetadataInitializersPending __otherCasted = (SelfSubjectAccessReviewMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
