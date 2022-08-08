package io.yupiik.kubernetes.bindings.v1_17_7;

import java.util.Objects;

public class ComponentStatusConditions {
    private String error;
    private String message;
    private String status;
    private String type;

    public ComponentStatusConditions() {
        // no-op
    }

    public ComponentStatusConditions(final String error,
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
        if (!(__other instanceof ComponentStatusConditions)) {
            return false;
        }
        final ComponentStatusConditions __otherCasted = (ComponentStatusConditions) __other;
        return Objects.equals(error, __otherCasted.error) &&
            Objects.equals(message, __otherCasted.message) &&
            Objects.equals(status, __otherCasted.status) &&
            Objects.equals(type, __otherCasted.type);
    }
}
