package io.yupiik.kubernetes.bindings.v1_13_3.v1beta1;

import io.yupiik.kubernetes.bindings.v1_13_3.Validable;
import io.yupiik.kubernetes.bindings.v1_13_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StatusCause implements Validable<StatusCause> {
    private String field;
    private String message;
    private String reason;

    public StatusCause() {
        // no-op
    }

    public StatusCause(final String field,
                       final String message,
                       final String reason) {
        // no-op
    }

    public String getField() {
        return field;
    }

    public void setField(final String field) {
        this.field = field;
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

    @Override
    public int hashCode() {
        return Objects.hash(
                field,
                message,
                reason);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StatusCause)) {
            return false;
        }
        final StatusCause __otherCasted = (StatusCause) __other;
        return Objects.equals(field, __otherCasted.field) &&
            Objects.equals(message, __otherCasted.message) &&
            Objects.equals(reason, __otherCasted.reason);
    }

    public StatusCause field(final String field) {
        this.field = field;
        return this;
    }

    public StatusCause message(final String message) {
        this.message = message;
        return this;
    }

    public StatusCause reason(final String reason) {
        this.reason = reason;
        return this;
    }

    @Override
    public StatusCause validate() {
        return this;
    }
}
