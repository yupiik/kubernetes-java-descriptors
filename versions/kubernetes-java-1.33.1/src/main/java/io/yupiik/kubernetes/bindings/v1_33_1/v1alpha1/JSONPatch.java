package io.yupiik.kubernetes.bindings.v1_33_1.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_33_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_33_1.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class JSONPatch implements Validable<JSONPatch>, Exportable {
    private String expression;

    public JSONPatch() {
        // no-op
    }

    public JSONPatch(final String expression) {
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
        if (!(__other instanceof JSONPatch)) {
            return false;
        }
        final JSONPatch __otherCasted = (JSONPatch) __other;
        return Objects.equals(expression, __otherCasted.expression);
    }

    public JSONPatch expression(final String expression) {
        this.expression = expression;
        return this;
    }

    @Override
    public JSONPatch validate() {
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
