package io.yupiik.kubernetes.bindings.v1_19_11;

import java.util.Objects;

public class PodStatusConditions {
    private String lastProbeTime;
    private String lastTransitionTime;
    private String message;
    private String reason;
    private String status;
    private String type;

    public PodStatusConditions() {
        // no-op
    }

    public PodStatusConditions(final String lastProbeTime,
                               final String lastTransitionTime,
                               final String message,
                               final String reason,
                               final String status,
                               final String type) {
        // no-op
    }

    public String getLastProbeTime() {
        return lastProbeTime;
    }

    public void setLastProbeTime(final String lastProbeTime) {
        this.lastProbeTime = lastProbeTime;
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
                lastProbeTime,
                lastTransitionTime,
                message,
                reason,
                status,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodStatusConditions)) {
            return false;
        }
        final PodStatusConditions __otherCasted = (PodStatusConditions) __other;
        return Objects.equals(lastProbeTime, __otherCasted.lastProbeTime) &&
            Objects.equals(lastTransitionTime, __otherCasted.lastTransitionTime) &&
            Objects.equals(message, __otherCasted.message) &&
            Objects.equals(reason, __otherCasted.reason) &&
            Objects.equals(status, __otherCasted.status) &&
            Objects.equals(type, __otherCasted.type);
    }
}
