package io.yupiik.kubernetes.bindings.v1_21_5.v1beta1;

import java.util.Objects;

public class PriorityLevelConfigurationListItemsStatusConditions {
    private String lastTransitionTime;
    private String message;
    private String reason;
    private String status;
    private String type;

    public PriorityLevelConfigurationListItemsStatusConditions() {
        // no-op
    }

    public PriorityLevelConfigurationListItemsStatusConditions(final String lastTransitionTime,
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
        if (!(__other instanceof PriorityLevelConfigurationListItemsStatusConditions)) {
            return false;
        }
        final PriorityLevelConfigurationListItemsStatusConditions __otherCasted = (PriorityLevelConfigurationListItemsStatusConditions) __other;
        return Objects.equals(lastTransitionTime, __otherCasted.lastTransitionTime) &&
            Objects.equals(message, __otherCasted.message) &&
            Objects.equals(reason, __otherCasted.reason) &&
            Objects.equals(status, __otherCasted.status) &&
            Objects.equals(type, __otherCasted.type);
    }
}
