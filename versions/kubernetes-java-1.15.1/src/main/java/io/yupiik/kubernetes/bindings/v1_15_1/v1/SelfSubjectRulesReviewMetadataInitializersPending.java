package io.yupiik.kubernetes.bindings.v1_15_1.v1;

import java.util.Objects;

public class SelfSubjectRulesReviewMetadataInitializersPending {
    private String name;

    public SelfSubjectRulesReviewMetadataInitializersPending() {
        // no-op
    }

    public SelfSubjectRulesReviewMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof SelfSubjectRulesReviewMetadataInitializersPending)) {
            return false;
        }
        final SelfSubjectRulesReviewMetadataInitializersPending __otherCasted = (SelfSubjectRulesReviewMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
