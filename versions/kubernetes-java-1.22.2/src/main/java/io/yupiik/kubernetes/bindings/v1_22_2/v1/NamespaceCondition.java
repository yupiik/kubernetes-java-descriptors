package io.yupiik.kubernetes.bindings.v1_22_2.v1;

import io.yupiik.kubernetes.bindings.v1_22_2.Validable;
import io.yupiik.kubernetes.bindings.v1_22_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NamespaceCondition implements Validable<NamespaceCondition> {
    private String lastTransitionTime;
    private String message;
    private String reason;
    private String status;
    private String type;

    public NamespaceCondition() {
        // no-op
    }

    public NamespaceCondition(final String lastTransitionTime,
                              final String message,
                              final String reason,
                              final String status,
                              final String type) {
        // no-op
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
        if (!(__other instanceof NamespaceCondition)) {
            return false;
        }
        final NamespaceCondition __otherCasted = (NamespaceCondition) __other;
        return Objects.equals(lastTransitionTime, __otherCasted.lastTransitionTime) &&
            Objects.equals(message, __otherCasted.message) &&
            Objects.equals(reason, __otherCasted.reason) &&
            Objects.equals(status, __otherCasted.status) &&
            Objects.equals(type, __otherCasted.type);
    }

    public NamespaceCondition lastTransitionTime(final String lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
        return this;
    }

    public NamespaceCondition message(final String message) {
        this.message = message;
        return this;
    }

    public NamespaceCondition reason(final String reason) {
        this.reason = reason;
        return this;
    }

    public NamespaceCondition status(final String status) {
        this.status = status;
        return this;
    }

    public NamespaceCondition type(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public NamespaceCondition validate() {
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
}
