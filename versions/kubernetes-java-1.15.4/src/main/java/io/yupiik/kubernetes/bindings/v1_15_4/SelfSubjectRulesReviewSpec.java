package io.yupiik.kubernetes.bindings.v1_15_4;

import java.util.Objects;

public class SelfSubjectRulesReviewSpec {
    private String namespace;

    public SelfSubjectRulesReviewSpec() {
        // no-op
    }

    public SelfSubjectRulesReviewSpec(final String namespace) {
        // no-op
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(final String namespace) {
        this.namespace = namespace;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                namespace);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof SelfSubjectRulesReviewSpec)) {
            return false;
        }
        final SelfSubjectRulesReviewSpec __otherCasted = (SelfSubjectRulesReviewSpec) __other;
        return Objects.equals(namespace, __otherCasted.namespace);
    }
}
