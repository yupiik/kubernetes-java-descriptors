package io.yupiik.kubernetes.bindings.v1_21_4.v1;

import io.yupiik.kubernetes.bindings.v1_21_4.Validable;
import io.yupiik.kubernetes.bindings.v1_21_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SelfSubjectRulesReviewSpec implements Validable<SelfSubjectRulesReviewSpec> {
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

    public SelfSubjectRulesReviewSpec namespace(final String namespace) {
        this.namespace = namespace;
        return this;
    }

    @Override
    public SelfSubjectRulesReviewSpec validate() {
        return this;
    }
}
