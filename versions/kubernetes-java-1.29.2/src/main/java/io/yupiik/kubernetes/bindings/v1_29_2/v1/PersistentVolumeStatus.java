package io.yupiik.kubernetes.bindings.v1_29_2.v1;

import io.yupiik.kubernetes.bindings.v1_29_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_29_2.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_29_2.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PersistentVolumeStatus implements Validable<PersistentVolumeStatus>, Exportable {
    private String lastPhaseTransitionTime;
    private String message;
    private String phase;
    private String reason;

    public PersistentVolumeStatus() {
        // no-op
    }

    public PersistentVolumeStatus(final String lastPhaseTransitionTime,
                                  final String message,
                                  final String phase,
                                  final String reason) {
        this.lastPhaseTransitionTime = lastPhaseTransitionTime;
        this.message = message;
        this.phase = phase;
        this.reason = reason;
    }

    public String getLastPhaseTransitionTime() {
        return lastPhaseTransitionTime;
    }

    public void setLastPhaseTransitionTime(final String lastPhaseTransitionTime) {
        this.lastPhaseTransitionTime = lastPhaseTransitionTime;
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
                lastPhaseTransitionTime,
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
        return Objects.equals(lastPhaseTransitionTime, __otherCasted.lastPhaseTransitionTime) &&
            Objects.equals(message, __otherCasted.message) &&
            Objects.equals(phase, __otherCasted.phase) &&
            Objects.equals(reason, __otherCasted.reason);
    }

    public PersistentVolumeStatus lastPhaseTransitionTime(final String lastPhaseTransitionTime) {
        this.lastPhaseTransitionTime = lastPhaseTransitionTime;
        return this;
    }

    public PersistentVolumeStatus message(final String message) {
        this.message = message;
        return this;
    }

    public PersistentVolumeStatus phase(final String phase) {
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

    @Override
    public String asJson() {
        return Stream.of(
                    (lastPhaseTransitionTime != null ? "\"lastPhaseTransitionTime\":\"" +  JsonStrings.escapeJson(lastPhaseTransitionTime) + "\"" : ""),
                    (message != null ? "\"message\":\"" +  JsonStrings.escapeJson(message) + "\"" : ""),
                    (phase != null ? "\"phase\":\"" +  JsonStrings.escapeJson(phase) + "\"" : ""),
                    (reason != null ? "\"reason\":\"" +  JsonStrings.escapeJson(reason) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
