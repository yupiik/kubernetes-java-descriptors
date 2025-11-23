package io.yupiik.kubernetes.bindings.v1_31_9.v1beta1;

import io.yupiik.kubernetes.bindings.v1_31_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_9.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_9.Validable;
import io.yupiik.kubernetes.bindings.v1_31_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class AuditAnnotation implements Validable<AuditAnnotation>, Exportable {
    private String key;
    private String valueExpression;

    public AuditAnnotation() {
        // no-op
    }

    public AuditAnnotation(final String key,
                           final String valueExpression) {
        this.key = key;
        this.valueExpression = valueExpression;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public String getValueExpression() {
        return valueExpression;
    }

    public void setValueExpression(final String valueExpression) {
        this.valueExpression = valueExpression;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                key,
                valueExpression);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof AuditAnnotation)) {
            return false;
        }
        final AuditAnnotation __otherCasted = (AuditAnnotation) __other;
        return Objects.equals(key, __otherCasted.key) &&
            Objects.equals(valueExpression, __otherCasted.valueExpression);
    }

    public AuditAnnotation key(final String key) {
        this.key = key;
        return this;
    }

    public AuditAnnotation valueExpression(final String valueExpression) {
        this.valueExpression = valueExpression;
        return this;
    }

    @Override
    public AuditAnnotation validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (key == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "key", "key",
                "Missing 'key' attribute.", true));
        }
        if (valueExpression == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "valueExpression", "valueExpression",
                "Missing 'valueExpression' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (key != null ? "\"key\":\"" +  JsonStrings.escapeJson(key) + "\"" : ""),
                    (valueExpression != null ? "\"valueExpression\":\"" +  JsonStrings.escapeJson(valueExpression) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
