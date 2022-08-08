package io.yupiik.kubernetes.bindings.v1_18_19;

import java.util.Objects;

public class PodStatusInitContainerStatusesState {
    private PodStatusInitContainerStatusesStateRunning running;
    private PodStatusInitContainerStatusesStateTerminated terminated;
    private PodStatusInitContainerStatusesStateWaiting waiting;

    public PodStatusInitContainerStatusesState() {
        // no-op
    }

    public PodStatusInitContainerStatusesState(final PodStatusInitContainerStatusesStateRunning running,
                                               final PodStatusInitContainerStatusesStateTerminated terminated,
                                               final PodStatusInitContainerStatusesStateWaiting waiting) {
        // no-op
    }

    public PodStatusInitContainerStatusesStateRunning getRunning() {
        return running;
    }

    public void setRunning(final PodStatusInitContainerStatusesStateRunning running) {
        this.running = running;
    }

    public PodStatusInitContainerStatusesStateTerminated getTerminated() {
        return terminated;
    }

    public void setTerminated(final PodStatusInitContainerStatusesStateTerminated terminated) {
        this.terminated = terminated;
    }

    public PodStatusInitContainerStatusesStateWaiting getWaiting() {
        return waiting;
    }

    public void setWaiting(final PodStatusInitContainerStatusesStateWaiting waiting) {
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
        if (!(__other instanceof PodStatusInitContainerStatusesState)) {
            return false;
        }
        final PodStatusInitContainerStatusesState __otherCasted = (PodStatusInitContainerStatusesState) __other;
        return Objects.equals(running, __otherCasted.running) &&
            Objects.equals(terminated, __otherCasted.terminated) &&
            Objects.equals(waiting, __otherCasted.waiting);
    }
}
