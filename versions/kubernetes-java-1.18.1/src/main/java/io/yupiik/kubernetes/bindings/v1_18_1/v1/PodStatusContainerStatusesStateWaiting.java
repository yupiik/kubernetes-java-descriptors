package io.yupiik.kubernetes.bindings.v1_18_1.v1;

import java.util.Objects;

public class PodStatusContainerStatusesStateWaiting {
    private String message;
    private String reason;

    public PodStatusContainerStatusesStateWaiting() {
        // no-op
    }

    public PodStatusContainerStatusesStateWaiting(final String message,
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
        if (!(__other instanceof PodStatusContainerStatusesStateWaiting)) {
            return false;
        }
        final PodStatusContainerStatusesStateWaiting __otherCasted = (PodStatusContainerStatusesStateWaiting) __other;
        return Objects.equals(message, __otherCasted.message) &&
            Objects.equals(reason, __otherCasted.reason);
    }
}
