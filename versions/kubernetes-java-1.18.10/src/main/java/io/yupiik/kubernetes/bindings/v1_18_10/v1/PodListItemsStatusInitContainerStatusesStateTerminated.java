package io.yupiik.kubernetes.bindings.v1_18_10.v1;

import java.util.Objects;

public class PodListItemsStatusInitContainerStatusesStateTerminated {
    private String containerID;
    private int exitCode;
    private String finishedAt;
    private String message;
    private String reason;
    private Integer signal;
    private String startedAt;

    public PodListItemsStatusInitContainerStatusesStateTerminated() {
        // no-op
    }

    public PodListItemsStatusInitContainerStatusesStateTerminated(final String containerID,
                                                                  final int exitCode,
                                                                  final String finishedAt,
                                                                  final String message,
                                                                  final String reason,
                                                                  final Integer signal,
                                                                  final String startedAt) {
        // no-op
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
        if (!(__other instanceof PodListItemsStatusInitContainerStatusesStateTerminated)) {
            return false;
        }
        final PodListItemsStatusInitContainerStatusesStateTerminated __otherCasted = (PodListItemsStatusInitContainerStatusesStateTerminated) __other;
        return Objects.equals(containerID, __otherCasted.containerID) &&
            Objects.equals(exitCode, __otherCasted.exitCode) &&
            Objects.equals(finishedAt, __otherCasted.finishedAt) &&
            Objects.equals(message, __otherCasted.message) &&
            Objects.equals(reason, __otherCasted.reason) &&
            Objects.equals(signal, __otherCasted.signal) &&
            Objects.equals(startedAt, __otherCasted.startedAt);
    }
}
