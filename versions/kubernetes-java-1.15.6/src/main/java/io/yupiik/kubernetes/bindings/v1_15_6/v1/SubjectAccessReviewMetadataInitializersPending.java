package io.yupiik.kubernetes.bindings.v1_15_6.v1;

import java.util.Objects;

public class SubjectAccessReviewMetadataInitializersPending {
    private String name;

    public SubjectAccessReviewMetadataInitializersPending() {
        // no-op
    }

    public SubjectAccessReviewMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof SubjectAccessReviewMetadataInitializersPending)) {
            return false;
        }
        final SubjectAccessReviewMetadataInitializersPending __otherCasted = (SubjectAccessReviewMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
