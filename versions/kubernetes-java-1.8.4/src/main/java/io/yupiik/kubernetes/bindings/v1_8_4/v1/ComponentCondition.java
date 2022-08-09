package io.yupiik.kubernetes.bindings.v1_8_4.v1;

import io.yupiik.kubernetes.bindings.v1_8_4.Exportable;
import io.yupiik.kubernetes.bindings.v1_8_4.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_8_4.Validable;
import io.yupiik.kubernetes.bindings.v1_8_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ComponentCondition implements Validable<ComponentCondition>, Exportable {
    private String error;
    private String message;
    private String status;
    private String type;

    public ComponentCondition() {
        // no-op
    }

    public ComponentCondition(final String error,
                              final String message,
                              final String status,
                              final String type) {
        // no-op
    }

    public String getError() {
        return error;
    }

    public void setError(final String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                error,
                message,
                status,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ComponentCondition)) {
            return false;
        }
        final ComponentCondition __otherCasted = (ComponentCondition) __other;
        return Objects.equals(error, __otherCasted.error) &&
            Objects.equals(message, __otherCasted.message) &&
            Objects.equals(status, __otherCasted.status) &&
            Objects.equals(type, __otherCasted.type);
    }

    public ComponentCondition error(final String error) {
        this.error = error;
        return this;
    }

    public ComponentCondition message(final String message) {
        this.message = message;
        return this;
    }

    public ComponentCondition status(final String status) {
        this.status = status;
        return this;
    }

    public ComponentCondition type(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public ComponentCondition validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (status == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "status", "status",
                "Missing 'status' attribute.", true));
        }
        if (type == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "type", "type",
                "Missing 'type' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (error != null ? "\"error\":\"" +  JsonStrings.escapeJson(error) + "\"" : ""),
                    (message != null ? "\"message\":\"" +  JsonStrings.escapeJson(message) + "\"" : ""),
                    (status != null ? "\"status\":\"" +  JsonStrings.escapeJson(status) + "\"" : ""),
                    (type != null ? "\"type\":\"" +  JsonStrings.escapeJson(type) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
