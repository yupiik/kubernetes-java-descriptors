package io.yupiik.kubernetes.bindings.v1_22_12.v1;

import java.util.Objects;

public class SelfSubjectAccessReviewSpec {
    private SelfSubjectAccessReviewSpecNonResourceAttributes nonResourceAttributes;
    private SelfSubjectAccessReviewSpecResourceAttributes resourceAttributes;

    public SelfSubjectAccessReviewSpec() {
        // no-op
    }

    public SelfSubjectAccessReviewSpec(final SelfSubjectAccessReviewSpecNonResourceAttributes nonResourceAttributes,
                                       final SelfSubjectAccessReviewSpecResourceAttributes resourceAttributes) {
        // no-op
    }

    public SelfSubjectAccessReviewSpecNonResourceAttributes getNonResourceAttributes() {
        return nonResourceAttributes;
    }

    public void setNonResourceAttributes(final SelfSubjectAccessReviewSpecNonResourceAttributes nonResourceAttributes) {
        this.nonResourceAttributes = nonResourceAttributes;
    }

    public SelfSubjectAccessReviewSpecResourceAttributes getResourceAttributes() {
        return resourceAttributes;
    }

    public void setResourceAttributes(final SelfSubjectAccessReviewSpecResourceAttributes resourceAttributes) {
        this.resourceAttributes = resourceAttributes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                nonResourceAttributes,
                resourceAttributes);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof SelfSubjectAccessReviewSpec)) {
            return false;
        }
        final SelfSubjectAccessReviewSpec __otherCasted = (SelfSubjectAccessReviewSpec) __other;
        return Objects.equals(nonResourceAttributes, __otherCasted.nonResourceAttributes) &&
            Objects.equals(resourceAttributes, __otherCasted.resourceAttributes);
    }
}
