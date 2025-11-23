package io.yupiik.kubernetes.bindings.v1_26_1.v1beta3;

import io.yupiik.kubernetes.bindings.v1_26_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_26_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_26_1.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class FlowSchemaCondition implements Validable<FlowSchemaCondition>, Exportable {
    private String lastTransitionTime;
    private String message;
    private String reason;
    private String status;
    private String type;

    public FlowSchemaCondition() {
        // no-op
    }

    public FlowSchemaCondition(final String lastTransitionTime,
                               final String message,
                               final String reason,
                               final String status,
                               final String type) {
        this.lastTransitionTime = lastTransitionTime;
        this.message = message;
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
                reason,
                status,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof FlowSchemaCondition)) {
            return false;
        }
        final FlowSchemaCondition __otherCasted = (FlowSchemaCondition) __other;
        return Objects.equals(lastTransitionTime, __otherCasted.lastTransitionTime) &&
            Objects.equals(message, __otherCasted.message) &&
            Objects.equals(reason, __otherCasted.reason) &&
            Objects.equals(status, __otherCasted.status) &&
            Objects.equals(type, __otherCasted.type);
    }

    public FlowSchemaCondition lastTransitionTime(final String lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
        return this;
    }

    public FlowSchemaCondition message(final String message) {
        this.message = message;
        return this;
    }

    public FlowSchemaCondition reason(final String reason) {
        this.reason = reason;
        return this;
    }

    public FlowSchemaCondition status(final String status) {
        this.status = status;
        return this;
    }

    public FlowSchemaCondition type(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public FlowSchemaCondition validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (lastTransitionTime != null ? "\"lastTransitionTime\":\"" +  JsonStrings.escapeJson(lastTransitionTime) + "\"" : ""),
                    (message != null ? "\"message\":\"" +  JsonStrings.escapeJson(message) + "\"" : ""),
                    (reason != null ? "\"reason\":\"" +  JsonStrings.escapeJson(reason) + "\"" : ""),
                    (status != null ? "\"status\":\"" +  JsonStrings.escapeJson(status) + "\"" : ""),
                    (type != null ? "\"type\":\"" +  JsonStrings.escapeJson(type) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
