package io.yupiik.kubernetes.bindings.v1_17_0;

import java.util.Objects;

public class PersistentVolumeListItemsStatus {
    private String message;
    private String phase;
    private String reason;

    public PersistentVolumeListItemsStatus() {
        // no-op
    }

    public PersistentVolumeListItemsStatus(final String message,
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
        if (!(__other instanceof PersistentVolumeListItemsStatus)) {
            return false;
        }
        final PersistentVolumeListItemsStatus __otherCasted = (PersistentVolumeListItemsStatus) __other;
        return Objects.equals(message, __otherCasted.message) &&
            Objects.equals(phase, __otherCasted.phase) &&
            Objects.equals(reason, __otherCasted.reason);
    }
}
