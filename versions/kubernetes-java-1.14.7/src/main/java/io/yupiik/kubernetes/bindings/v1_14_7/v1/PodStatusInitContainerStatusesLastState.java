package io.yupiik.kubernetes.bindings.v1_14_7.v1;

import java.util.Objects;

public class PodStatusInitContainerStatusesLastState {
    private PodStatusInitContainerStatusesLastStateRunning running;
    private PodStatusInitContainerStatusesLastStateTerminated terminated;
    private PodStatusInitContainerStatusesLastStateWaiting waiting;

    public PodStatusInitContainerStatusesLastState() {
        // no-op
    }

    public PodStatusInitContainerStatusesLastState(final PodStatusInitContainerStatusesLastStateRunning running,
                                                   final PodStatusInitContainerStatusesLastStateTerminated terminated,
                                                   final PodStatusInitContainerStatusesLastStateWaiting waiting) {
        // no-op
    }

    public PodStatusInitContainerStatusesLastStateRunning getRunning() {
        return running;
    }

    public void setRunning(final PodStatusInitContainerStatusesLastStateRunning running) {
        this.running = running;
    }

    public PodStatusInitContainerStatusesLastStateTerminated getTerminated() {
        return terminated;
    }

    public void setTerminated(final PodStatusInitContainerStatusesLastStateTerminated terminated) {
        this.terminated = terminated;
    }

    public PodStatusInitContainerStatusesLastStateWaiting getWaiting() {
        return waiting;
    }

    public void setWaiting(final PodStatusInitContainerStatusesLastStateWaiting waiting) {
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
        if (!(__other instanceof PodStatusInitContainerStatusesLastState)) {
            return false;
        }
        final PodStatusInitContainerStatusesLastState __otherCasted = (PodStatusInitContainerStatusesLastState) __other;
        return Objects.equals(running, __otherCasted.running) &&
            Objects.equals(terminated, __otherCasted.terminated) &&
            Objects.equals(waiting, __otherCasted.waiting);
    }
}
