package io.yupiik.kubernetes.bindings.v1_23_5.v1;

import io.yupiik.kubernetes.bindings.v1_23_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_23_5.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_23_5.Validable;
import io.yupiik.kubernetes.bindings.v1_23_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NodeCondition implements Validable<NodeCondition>, Exportable {
    private String lastHeartbeatTime;
    private String lastTransitionTime;
    private String message;
    private String reason;
    private String status;
    private NodeConditionType type;

    public NodeCondition() {
        // no-op
    }

    public NodeCondition(final String lastHeartbeatTime,
                         final String lastTransitionTime,
                         final String message,
                         final String reason,
                         final String status,
                         final NodeConditionType type) {
        // no-op
    }

    public String getLastHeartbeatTime() {
        return lastHeartbeatTime;
    }

    public void setLastHeartbeatTime(final String lastHeartbeatTime) {
        this.lastHeartbeatTime = lastHeartbeatTime;
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

    public NodeConditionType getType() {
        return type;
    }

    public void setType(final NodeConditionType type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                lastHeartbeatTime,
                lastTransitionTime,
                message,
                reason,
                status,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeCondition)) {
            return false;
        }
        final NodeCondition __otherCasted = (NodeCondition) __other;
        return Objects.equals(lastHeartbeatTime, __otherCasted.lastHeartbeatTime) &&
            Objects.equals(lastTransitionTime, __otherCasted.lastTransitionTime) &&
            Objects.equals(message, __otherCasted.message) &&
            Objects.equals(reason, __otherCasted.reason) &&
            Objects.equals(status, __otherCasted.status) &&
            Objects.equals(type, __otherCasted.type);
    }

    public NodeCondition lastHeartbeatTime(final String lastHeartbeatTime) {
        this.lastHeartbeatTime = lastHeartbeatTime;
        return this;
    }

    public NodeCondition lastTransitionTime(final String lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
        return this;
    }

    public NodeCondition message(final String message) {
        this.message = message;
        return this;
    }

    public NodeCondition reason(final String reason) {
        this.reason = reason;
        return this;
    }

    public NodeCondition status(final String status) {
        this.status = status;
        return this;
    }

    public NodeCondition type(final NodeConditionType type) {
        this.type = type;
        return this;
    }

    @Override
    public NodeCondition validate() {
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
                    (lastHeartbeatTime != null ? "\"lastHeartbeatTime\":\"" +  JsonStrings.escapeJson(lastHeartbeatTime) + "\"" : ""),
                    (lastTransitionTime != null ? "\"lastTransitionTime\":\"" +  JsonStrings.escapeJson(lastTransitionTime) + "\"" : ""),
                    (message != null ? "\"message\":\"" +  JsonStrings.escapeJson(message) + "\"" : ""),
                    (reason != null ? "\"reason\":\"" +  JsonStrings.escapeJson(reason) + "\"" : ""),
                    (status != null ? "\"status\":\"" +  JsonStrings.escapeJson(status) + "\"" : ""),
                    (type != null ? "\"type\":" + type.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
