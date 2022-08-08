package io.yupiik.kubernetes.bindings.v1_22_3;

import java.util.Objects;

public class PodStatusContainerStatusesState {
    private PodStatusContainerStatusesStateRunning running;
    private PodStatusContainerStatusesStateTerminated terminated;
    private PodStatusContainerStatusesStateWaiting waiting;

    public PodStatusContainerStatusesState() {
        // no-op
    }

    public PodStatusContainerStatusesState(final PodStatusContainerStatusesStateRunning running,
                                           final PodStatusContainerStatusesStateTerminated terminated,
                                           final PodStatusContainerStatusesStateWaiting waiting) {
        // no-op
    }

    public PodStatusContainerStatusesStateRunning getRunning() {
        return running;
    }

    public void setRunning(final PodStatusContainerStatusesStateRunning running) {
        this.running = running;
    }

    public PodStatusContainerStatusesStateTerminated getTerminated() {
        return terminated;
    }

    public void setTerminated(final PodStatusContainerStatusesStateTerminated terminated) {
        this.terminated = terminated;
    }

    public PodStatusContainerStatusesStateWaiting getWaiting() {
        return waiting;
    }

    public void setWaiting(final PodStatusContainerStatusesStateWaiting waiting) {
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
        if (!(__other instanceof PodStatusContainerStatusesState)) {
            return false;
        }
        final PodStatusContainerStatusesState __otherCasted = (PodStatusContainerStatusesState) __other;
        return Objects.equals(running, __otherCasted.running) &&
            Objects.equals(terminated, __otherCasted.terminated) &&
            Objects.equals(waiting, __otherCasted.waiting);
    }
}
