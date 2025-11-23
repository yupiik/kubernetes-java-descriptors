package io.yupiik.kubernetes.bindings.v1_29_6.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_29_6.Exportable;
import io.yupiik.kubernetes.bindings.v1_29_6.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class TypeChecking implements Validable<TypeChecking>, Exportable {
    private List<ExpressionWarning> expressionWarnings;

    public TypeChecking() {
        // no-op
    }

    public TypeChecking(final List<ExpressionWarning> expressionWarnings) {
        this.expressionWarnings = expressionWarnings;
    }

    public List<ExpressionWarning> getExpressionWarnings() {
        return expressionWarnings;
    }

    public void setExpressionWarnings(final List<ExpressionWarning> expressionWarnings) {
        this.expressionWarnings = expressionWarnings;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                expressionWarnings);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof TypeChecking)) {
            return false;
        }
        final TypeChecking __otherCasted = (TypeChecking) __other;
        return Objects.equals(expressionWarnings, __otherCasted.expressionWarnings);
    }

    public TypeChecking expressionWarnings(final List<ExpressionWarning> expressionWarnings) {
        this.expressionWarnings = expressionWarnings;
        return this;
    }

    @Override
    public TypeChecking validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (expressionWarnings != null ? "\"expressionWarnings\":" + expressionWarnings.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
