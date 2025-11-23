package io.yupiik.kubernetes.bindings.v1_33_3.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_33_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_33_3.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ApplyConfiguration implements Validable<ApplyConfiguration>, Exportable {
    private String expression;

    public ApplyConfiguration() {
        // no-op
    }

    public ApplyConfiguration(final String expression) {
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(final String expression) {
        this.expression = expression;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                expression);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ApplyConfiguration)) {
            return false;
        }
        final ApplyConfiguration __otherCasted = (ApplyConfiguration) __other;
        return Objects.equals(expression, __otherCasted.expression);
    }

    public ApplyConfiguration expression(final String expression) {
        this.expression = expression;
        return this;
    }

    @Override
    public ApplyConfiguration validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (expression != null ? "\"expression\":\"" +  JsonStrings.escapeJson(expression) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
