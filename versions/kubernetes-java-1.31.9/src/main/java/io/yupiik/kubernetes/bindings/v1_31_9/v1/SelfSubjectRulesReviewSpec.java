package io.yupiik.kubernetes.bindings.v1_31_9.v1;

import io.yupiik.kubernetes.bindings.v1_31_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_9.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_9.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class SelfSubjectRulesReviewSpec implements Validable<SelfSubjectRulesReviewSpec>, Exportable {
    private String namespace;

    public SelfSubjectRulesReviewSpec() {
        // no-op
    }

    public SelfSubjectRulesReviewSpec(final String namespace) {
        this.namespace = namespace;
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

    @Override
    public String asJson() {
        return Stream.of(
                    (namespace != null ? "\"namespace\":\"" +  JsonStrings.escapeJson(namespace) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
