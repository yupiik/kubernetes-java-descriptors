package io.yupiik.kubernetes.bindings.v1_26_3.v1;

import io.yupiik.kubernetes.bindings.v1_26_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_26_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_26_3.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ContainerStateTerminated implements Validable<ContainerStateTerminated>, Exportable {
    private String containerID;
    private int exitCode;
    private String finishedAt;
    private String message;
    private String reason;
    private Integer signal;
    private String startedAt;

    public ContainerStateTerminated() {
        // no-op
    }

    public ContainerStateTerminated(final String containerID,
                                    final int exitCode,
                                    final String finishedAt,
                                    final String message,
                                    final String reason,
                                    final Integer signal,
                                    final String startedAt) {
        this.containerID = containerID;
        this.exitCode = exitCode;
        this.finishedAt = finishedAt;
        this.message = message;
        this.reason = reason;
        this.signal = signal;
        this.startedAt = startedAt;
    }

    public String getContainerID() {
        return containerID;
    }

    public void setContainerID(final String containerID) {
        this.containerID = containerID;
    }

    public int getExitCode() {
        return exitCode;
    }

    public void setExitCode(final int exitCode) {
        this.exitCode = exitCode;
    }

    public String getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(final String finishedAt) {
        this.finishedAt = finishedAt;
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

    public Integer getSignal() {
        return signal;
    }

    public void setSignal(final Integer signal) {
        this.signal = signal;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(final String startedAt) {
        this.startedAt = startedAt;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                containerID,
                exitCode,
                finishedAt,
                message,
                reason,
                signal,
                startedAt);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ContainerStateTerminated)) {
            return false;
        }
        final ContainerStateTerminated __otherCasted = (ContainerStateTerminated) __other;
        return Objects.equals(containerID, __otherCasted.containerID) &&
            Objects.equals(exitCode, __otherCasted.exitCode) &&
            Objects.equals(finishedAt, __otherCasted.finishedAt) &&
            Objects.equals(message, __otherCasted.message) &&
            Objects.equals(reason, __otherCasted.reason) &&
            Objects.equals(signal, __otherCasted.signal) &&
            Objects.equals(startedAt, __otherCasted.startedAt);
    }

    public ContainerStateTerminated containerID(final String containerID) {
        this.containerID = containerID;
        return this;
    }

    public ContainerStateTerminated exitCode(final int exitCode) {
        this.exitCode = exitCode;
        return this;
    }

    public ContainerStateTerminated finishedAt(final String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }

    public ContainerStateTerminated message(final String message) {
        this.message = message;
        return this;
    }

    public ContainerStateTerminated reason(final String reason) {
        this.reason = reason;
        return this;
    }

    public ContainerStateTerminated signal(final Integer signal) {
        this.signal = signal;
        return this;
    }

    public ContainerStateTerminated startedAt(final String startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    @Override
    public ContainerStateTerminated validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (containerID != null ? "\"containerID\":\"" +  JsonStrings.escapeJson(containerID) + "\"" : ""),
                    "\"exitCode\":" + exitCode,
                    (finishedAt != null ? "\"finishedAt\":\"" +  JsonStrings.escapeJson(finishedAt) + "\"" : ""),
                    (message != null ? "\"message\":\"" +  JsonStrings.escapeJson(message) + "\"" : ""),
                    (reason != null ? "\"reason\":\"" +  JsonStrings.escapeJson(reason) + "\"" : ""),
                    (signal != null ? "\"signal\":" + signal : ""),
                    (startedAt != null ? "\"startedAt\":\"" +  JsonStrings.escapeJson(startedAt) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
