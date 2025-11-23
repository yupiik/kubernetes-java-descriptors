package io.yupiik.kubernetes.bindings.v1_33_1.v1beta1;

import io.yupiik.kubernetes.bindings.v1_33_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_33_1.Validable;
import io.yupiik.kubernetes.bindings.v1_33_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class CELDeviceSelector implements Validable<CELDeviceSelector>, Exportable {
    private String expression;

    public CELDeviceSelector() {
        // no-op
    }

    public CELDeviceSelector(final String expression) {
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
        if (!(__other instanceof CELDeviceSelector)) {
            return false;
        }
        final CELDeviceSelector __otherCasted = (CELDeviceSelector) __other;
        return Objects.equals(expression, __otherCasted.expression);
    }

    public CELDeviceSelector expression(final String expression) {
        this.expression = expression;
        return this;
    }

    @Override
    public CELDeviceSelector validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (expression == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "expression", "expression",
                "Missing 'expression' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
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
