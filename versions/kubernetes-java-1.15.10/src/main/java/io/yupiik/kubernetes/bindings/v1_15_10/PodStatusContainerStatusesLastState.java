package io.yupiik.kubernetes.bindings.v1_15_10;

import java.util.Objects;

public class PodStatusContainerStatusesLastState {
    private PodStatusContainerStatusesLastStateRunning running;
    private PodStatusContainerStatusesLastStateTerminated terminated;
    private PodStatusContainerStatusesLastStateWaiting waiting;

    public PodStatusContainerStatusesLastState() {
        // no-op
    }

    public PodStatusContainerStatusesLastState(final PodStatusContainerStatusesLastStateRunning running,
                                               final PodStatusContainerStatusesLastStateTerminated terminated,
                                               final PodStatusContainerStatusesLastStateWaiting waiting) {
        // no-op
    }

    public PodStatusContainerStatusesLastStateRunning getRunning() {
        return running;
    }

    public void setRunning(final PodStatusContainerStatusesLastStateRunning running) {
        this.running = running;
    }

    public PodStatusContainerStatusesLastStateTerminated getTerminated() {
        return terminated;
    }

    public void setTerminated(final PodStatusContainerStatusesLastStateTerminated terminated) {
        this.terminated = terminated;
    }

    public PodStatusContainerStatusesLastStateWaiting getWaiting() {
        return waiting;
    }

    public void setWaiting(final PodStatusContainerStatusesLastStateWaiting waiting) {
        this.waiting = waiting;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                running,
                terminated,
                waiting);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodStatusContainerStatusesLastState)) {
            return false;
        }
        final PodStatusContainerStatusesLastState __otherCasted = (PodStatusContainerStatusesLastState) __other;
        return Objects.equals(running, __otherCasted.running) &&
            Objects.equals(terminated, __otherCasted.terminated) &&
            Objects.equals(waiting, __otherCasted.waiting);
    }
}
