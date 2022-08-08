package io.yupiik.kubernetes.bindings.v1_14_6.v1;

import java.util.Objects;

public class LocalSubjectAccessReviewMetadataInitializersPending {
    private String name;

    public LocalSubjectAccessReviewMetadataInitializersPending() {
        // no-op
    }

    public LocalSubjectAccessReviewMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof LocalSubjectAccessReviewMetadataInitializersPending)) {
            return false;
        }
        final LocalSubjectAccessReviewMetadataInitializersPending __otherCasted = (LocalSubjectAccessReviewMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
