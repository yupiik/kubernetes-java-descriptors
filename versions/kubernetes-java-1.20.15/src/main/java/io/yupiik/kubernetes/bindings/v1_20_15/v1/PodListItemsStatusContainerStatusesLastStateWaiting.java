package io.yupiik.kubernetes.bindings.v1_20_15.v1;

import java.util.Objects;

public class PodListItemsStatusContainerStatusesLastStateWaiting {
    private String message;
    private String reason;

    public PodListItemsStatusContainerStatusesLastStateWaiting() {
        // no-op
    }

    public PodListItemsStatusContainerStatusesLastStateWaiting(final String message,
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
        if (!(__other instanceof PodListItemsStatusContainerStatusesLastStateWaiting)) {
            return false;
        }
        final PodListItemsStatusContainerStatusesLastStateWaiting __otherCasted = (PodListItemsStatusContainerStatusesLastStateWaiting) __other;
        return Objects.equals(message, __otherCasted.message) &&
            Objects.equals(reason, __otherCasted.reason);
    }
}
