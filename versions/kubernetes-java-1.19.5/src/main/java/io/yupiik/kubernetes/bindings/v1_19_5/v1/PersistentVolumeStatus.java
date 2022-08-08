package io.yupiik.kubernetes.bindings.v1_19_5.v1;

import java.util.Objects;

public class PersistentVolumeStatus {
    private String message;
    private String phase;
    private String reason;

    public PersistentVolumeStatus() {
        // no-op
    }

    public PersistentVolumeStatus(final String message,
                                  final String phase,
                                  final String reason) {
        // no-op
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(final String phase) {
        this.phase = phase;
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
                phase,
                reason);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PersistentVolumeStatus)) {
            return false;
        }
        final PersistentVolumeStatus __otherCasted = (PersistentVolumeStatus) __other;
        return Objects.equals(message, __otherCasted.message) &&
            Objects.equals(phase, __otherCasted.phase) &&
            Objects.equals(reason, __otherCasted.reason);
    }
}
