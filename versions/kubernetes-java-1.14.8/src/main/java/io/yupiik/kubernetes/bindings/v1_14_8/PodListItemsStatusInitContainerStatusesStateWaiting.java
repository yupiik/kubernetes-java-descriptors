package io.yupiik.kubernetes.bindings.v1_14_8;

import java.util.Objects;

public class PodListItemsStatusInitContainerStatusesStateWaiting {
    private String message;
    private String reason;

    public PodListItemsStatusInitContainerStatusesStateWaiting() {
        // no-op
    }

    public PodListItemsStatusInitContainerStatusesStateWaiting(final String message,
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
        if (!(__other instanceof PodListItemsStatusInitContainerStatusesStateWaiting)) {
            return false;
        }
        final PodListItemsStatusInitContainerStatusesStateWaiting __otherCasted = (PodListItemsStatusInitContainerStatusesStateWaiting) __other;
        return Objects.equals(message, __otherCasted.message) &&
            Objects.equals(reason, __otherCasted.reason);
    }
}
