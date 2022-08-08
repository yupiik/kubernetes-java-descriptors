package io.yupiik.kubernetes.bindings.v1_23_1.v1;

import java.util.Objects;

public class PersistentVolumeClaimStatusConditions {
    private String lastProbeTime;
    private String lastTransitionTime;
    private String message;
    private String reason;
    private String status;
    private PersistentVolumeClaimStatusConditionsType type;

    public PersistentVolumeClaimStatusConditions() {
        // no-op
    }

    public PersistentVolumeClaimStatusConditions(final String lastProbeTime,
                                                 final String lastTransitionTime,
                                                 final String message,
                                                 final String reason,
                                                 final String status,
                                                 final PersistentVolumeClaimStatusConditionsType type) {
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

    public PersistentVolumeClaimStatusConditionsType getType() {
        return type;
    }

    public void setType(final PersistentVolumeClaimStatusConditionsType type) {
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
        if (!(__other instanceof PersistentVolumeClaimStatusConditions)) {
            return false;
        }
        final PersistentVolumeClaimStatusConditions __otherCasted = (PersistentVolumeClaimStatusConditions) __other;
        return Objects.equals(lastProbeTime, __otherCasted.lastProbeTime) &&
            Objects.equals(lastTransitionTime, __otherCasted.lastTransitionTime) &&
            Objects.equals(message, __otherCasted.message) &&
            Objects.equals(reason, __otherCasted.reason) &&
            Objects.equals(status, __otherCasted.status) &&
            Objects.equals(type, __otherCasted.type);
    }
}
