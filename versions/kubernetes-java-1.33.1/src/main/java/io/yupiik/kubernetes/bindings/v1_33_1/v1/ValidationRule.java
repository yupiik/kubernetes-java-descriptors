package io.yupiik.kubernetes.bindings.v1_33_1.v1;

import io.yupiik.kubernetes.bindings.v1_33_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_33_1.Validable;
import io.yupiik.kubernetes.bindings.v1_33_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ValidationRule implements Validable<ValidationRule>, Exportable {
    private String fieldPath;
    private String message;
    private String messageExpression;
    private Boolean optionalOldSelf;
    private String reason;
    private String rule;

    public ValidationRule() {
        // no-op
    }

    public ValidationRule(final String fieldPath,
                          final String message,
                          final String messageExpression,
                          final Boolean optionalOldSelf,
                          final String reason,
                          final String rule) {
        this.fieldPath = fieldPath;
        this.message = message;
        this.messageExpression = messageExpression;
        this.optionalOldSelf = optionalOldSelf;
        this.reason = reason;
        this.rule = rule;
    }

    public String getFieldPath() {
        return fieldPath;
    }

    public void setFieldPath(final String fieldPath) {
        this.fieldPath = fieldPath;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public String getMessageExpression() {
        return messageExpression;
    }

    public void setMessageExpression(final String messageExpression) {
        this.messageExpression = messageExpression;
    }

    public Boolean getOptionalOldSelf() {
        return optionalOldSelf;
    }

    public void setOptionalOldSelf(final Boolean optionalOldSelf) {
        this.optionalOldSelf = optionalOldSelf;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(final String reason) {
        this.reason = reason;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(final String rule) {
        this.rule = rule;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                fieldPath,
                message,
                messageExpression,
                optionalOldSelf,
                reason,
                rule);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ValidationRule)) {
            return false;
        }
        final ValidationRule __otherCasted = (ValidationRule) __other;
        return Objects.equals(fieldPath, __otherCasted.fieldPath) &&
            Objects.equals(message, __otherCasted.message) &&
            Objects.equals(messageExpression, __otherCasted.messageExpression) &&
            Objects.equals(optionalOldSelf, __otherCasted.optionalOldSelf) &&
            Objects.equals(reason, __otherCasted.reason) &&
            Objects.equals(rule, __otherCasted.rule);
    }

    public ValidationRule fieldPath(final String fieldPath) {
        this.fieldPath = fieldPath;
        return this;
    }

    public ValidationRule message(final String message) {
        this.message = message;
        return this;
    }

    public ValidationRule messageExpression(final String messageExpression) {
        this.messageExpression = messageExpression;
        return this;
    }

    public ValidationRule optionalOldSelf(final Boolean optionalOldSelf) {
        this.optionalOldSelf = optionalOldSelf;
        return this;
    }

    public ValidationRule reason(final String reason) {
        this.reason = reason;
        return this;
    }

    public ValidationRule rule(final String rule) {
        this.rule = rule;
        return this;
    }

    @Override
    public ValidationRule validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (rule == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "rule", "rule",
                "Missing 'rule' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (fieldPath != null ? "\"fieldPath\":\"" +  JsonStrings.escapeJson(fieldPath) + "\"" : ""),
                    (message != null ? "\"message\":\"" +  JsonStrings.escapeJson(message) + "\"" : ""),
                    (messageExpression != null ? "\"messageExpression\":\"" +  JsonStrings.escapeJson(messageExpression) + "\"" : ""),
                    (optionalOldSelf != null ? "\"optionalOldSelf\":" + optionalOldSelf : ""),
                    (reason != null ? "\"reason\":\"" +  JsonStrings.escapeJson(reason) + "\"" : ""),
                    (rule != null ? "\"rule\":\"" +  JsonStrings.escapeJson(rule) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
