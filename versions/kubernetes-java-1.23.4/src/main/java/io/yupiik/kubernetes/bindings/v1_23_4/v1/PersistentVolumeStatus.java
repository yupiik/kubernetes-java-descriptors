package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import io.yupiik.kubernetes.bindings.v1_23_4.Validable;
import io.yupiik.kubernetes.bindings.v1_23_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PersistentVolumeStatus implements Validable<PersistentVolumeStatus> {
    private String message;
    private PersistentVolumeStatusPhase phase;
    private String reason;

    public PersistentVolumeStatus() {
        // no-op
    }

    public PersistentVolumeStatus(final String message,
                                  final PersistentVolumeStatusPhase phase,
                                  final String reason) {
        // no-op
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public PersistentVolumeStatusPhase getPhase() {
        return phase;
    }

    public void setPhase(final PersistentVolumeStatusPhase phase) {
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

    public PersistentVolumeStatus message(final String message) {
        this.message = message;
        return this;
    }

    public PersistentVolumeStatus phase(final PersistentVolumeStatusPhase phase) {
        this.phase = phase;
        return this;
    }

    public PersistentVolumeStatus reason(final String reason) {
        this.reason = reason;
        return this;
    }

    @Override
    public PersistentVolumeStatus validate() {
        return this;
    }
}
