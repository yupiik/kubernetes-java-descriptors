package io.yupiik.kubernetes.bindings.v1_32_0.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_32_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_32_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_32_0.Validable;
import io.yupiik.kubernetes.bindings.v1_32_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class MigrationCondition implements Validable<MigrationCondition>, Exportable {
    private String lastUpdateTime;
    private String message;
    private String reason;
    private String status;
    private String type;

    public MigrationCondition() {
        // no-op
    }

    public MigrationCondition(final String lastUpdateTime,
                              final String message,
                              final String reason,
                              final String status,
                              final String type) {
        this.lastUpdateTime = lastUpdateTime;
        this.message = message;
        this.reason = reason;
        this.status = status;
        this.type = type;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(final String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(final String reason) {
        this.reason = reason;
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
                lastUpdateTime,
                message,
                reason,
                status,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof MigrationCondition)) {
            return false;
        }
        final MigrationCondition __otherCasted = (MigrationCondition) __other;
        return Objects.equals(lastUpdateTime, __otherCasted.lastUpdateTime) &&
            Objects.equals(message, __otherCasted.message) &&
            Objects.equals(reason, __otherCasted.reason) &&
            Objects.equals(status, __otherCasted.status) &&
            Objects.equals(type, __otherCasted.type);
    }

    public MigrationCondition lastUpdateTime(final String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    public MigrationCondition message(final String message) {
        this.message = message;
        return this;
    }

    public MigrationCondition reason(final String reason) {
        this.reason = reason;
        return this;
    }

    public MigrationCondition status(final String status) {
        this.status = status;
        return this;
    }

    public MigrationCondition type(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public MigrationCondition validate() {
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
                    (lastUpdateTime != null ? "\"lastUpdateTime\":\"" +  JsonStrings.escapeJson(lastUpdateTime) + "\"" : ""),
                    (message != null ? "\"message\":\"" +  JsonStrings.escapeJson(message) + "\"" : ""),
                    (reason != null ? "\"reason\":\"" +  JsonStrings.escapeJson(reason) + "\"" : ""),
                    (status != null ? "\"status\":\"" +  JsonStrings.escapeJson(status) + "\"" : ""),
                    (type != null ? "\"type\":\"" +  JsonStrings.escapeJson(type) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
