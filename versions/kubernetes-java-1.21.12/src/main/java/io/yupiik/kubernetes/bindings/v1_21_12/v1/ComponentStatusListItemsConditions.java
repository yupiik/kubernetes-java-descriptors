package io.yupiik.kubernetes.bindings.v1_21_12.v1;

import java.util.Objects;

public class ComponentStatusListItemsConditions {
    private String error;
    private String message;
    private String status;
    private String type;

    public ComponentStatusListItemsConditions() {
        // no-op
    }

    public ComponentStatusListItemsConditions(final String error,
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
        if (!(__other instanceof ComponentStatusListItemsConditions)) {
            return false;
        }
        final ComponentStatusListItemsConditions __otherCasted = (ComponentStatusListItemsConditions) __other;
        return Objects.equals(error, __otherCasted.error) &&
            Objects.equals(message, __otherCasted.message) &&
            Objects.equals(status, __otherCasted.status) &&
            Objects.equals(type, __otherCasted.type);
    }
}
