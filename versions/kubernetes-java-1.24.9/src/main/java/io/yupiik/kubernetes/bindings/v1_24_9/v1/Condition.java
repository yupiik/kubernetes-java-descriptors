package io.yupiik.kubernetes.bindings.v1_24_9.v1;

import io.yupiik.kubernetes.bindings.v1_24_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_24_9.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_24_9.Validable;
import io.yupiik.kubernetes.bindings.v1_24_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Condition implements Validable<Condition>, Exportable {
    private String lastTransitionTime;
    private String message;
    private Integer observedGeneration;
    private String reason;
    private String status;
    private String type;

    public Condition() {
        // no-op
    }

    public Condition(final String lastTransitionTime,
                     final String message,
                     final Integer observedGeneration,
                     final String reason,
                     final String status,
                     final String type) {
        this.lastTransitionTime = lastTransitionTime;
        this.message = message;
        this.observedGeneration = observedGeneration;
        this.reason = reason;
        this.status = status;
        this.type = type;
    }

    public String getLastTransitionTime() {
        return lastTransitionTime;
    }

    public void setLastTransitionTime(final String lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public Integer getObservedGeneration() {
        return observedGeneration;
    }

    public void setObservedGeneration(final Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
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
                lastTransitionTime,
                message,
                observedGeneration,
                reason,
                status,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Condition)) {
            return false;
        }
        final Condition __otherCasted = (Condition) __other;
        return Objects.equals(lastTransitionTime, __otherCasted.lastTransitionTime) &&
            Objects.equals(message, __otherCasted.message) &&
            Objects.equals(observedGeneration, __otherCasted.observedGeneration) &&
            Objects.equals(reason, __otherCasted.reason) &&
            Objects.equals(status, __otherCasted.status) &&
            Objects.equals(type, __otherCasted.type);
    }

    public Condition lastTransitionTime(final String lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
        return this;
    }

    public Condition message(final String message) {
        this.message = message;
        return this;
    }

    public Condition observedGeneration(final Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }

    public Condition reason(final String reason) {
        this.reason = reason;
        return this;
    }

    public Condition status(final String status) {
        this.status = status;
        return this;
    }

    public Condition type(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public Condition validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (lastTransitionTime == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "lastTransitionTime", "lastTransitionTime",
                "Missing 'lastTransitionTime' attribute.", true));
        }
        if (message == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "message", "message",
                "Missing 'message' attribute.", true));
        }
        if (reason == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "reason", "reason",
                "Missing 'reason' attribute.", true));
        }
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
                    (lastTransitionTime != null ? "\"lastTransitionTime\":\"" +  JsonStrings.escapeJson(lastTransitionTime) + "\"" : ""),
                    (message != null ? "\"message\":\"" +  JsonStrings.escapeJson(message) + "\"" : ""),
                    (observedGeneration != null ? "\"observedGeneration\":" + observedGeneration : ""),
                    (reason != null ? "\"reason\":\"" +  JsonStrings.escapeJson(reason) + "\"" : ""),
                    (status != null ? "\"status\":\"" +  JsonStrings.escapeJson(status) + "\"" : ""),
                    (type != null ? "\"type\":\"" +  JsonStrings.escapeJson(type) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
