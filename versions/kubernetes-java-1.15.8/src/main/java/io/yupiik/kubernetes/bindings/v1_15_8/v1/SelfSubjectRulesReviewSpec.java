package io.yupiik.kubernetes.bindings.v1_15_8.v1;

import io.yupiik.kubernetes.bindings.v1_15_8.Exportable;
import io.yupiik.kubernetes.bindings.v1_15_8.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_15_8.Validable;
import io.yupiik.kubernetes.bindings.v1_15_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class SelfSubjectRulesReviewSpec implements Validable<SelfSubjectRulesReviewSpec>, Exportable {
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

    @Override
    public String asJson() {
        return Stream.of(
                    (namespace != null ? "\"namespace\":\"" +  JsonStrings.escapeJson(namespace) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
