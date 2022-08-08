package io.yupiik.kubernetes.bindings.v1_14_5.v1;

import io.yupiik.kubernetes.bindings.v1_14_5.Validable;
import io.yupiik.kubernetes.bindings.v1_14_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ContainerStateWaiting implements Validable<ContainerStateWaiting> {
    private String message;
    private String reason;

    public ContainerStateWaiting() {
        // no-op
    }

    public ContainerStateWaiting(final String message,
                                 final String reason) {
        // no-op
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
                message,
                reason);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ContainerStateWaiting)) {
            return false;
        }
        final ContainerStateWaiting __otherCasted = (ContainerStateWaiting) __other;
        return Objects.equals(message, __otherCasted.message) &&
            Objects.equals(reason, __otherCasted.reason);
    }

    public ContainerStateWaiting message(final String message) {
        this.message = message;
        return this;
    }

    public ContainerStateWaiting reason(final String reason) {
        this.reason = reason;
        return this;
    }

    @Override
    public ContainerStateWaiting validate() {
        return this;
    }
}
