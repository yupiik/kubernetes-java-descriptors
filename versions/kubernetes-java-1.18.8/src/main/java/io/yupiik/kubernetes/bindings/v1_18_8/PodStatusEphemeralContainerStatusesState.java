package io.yupiik.kubernetes.bindings.v1_18_8;

import java.util.Objects;

public class PodStatusEphemeralContainerStatusesState {
    private PodStatusEphemeralContainerStatusesStateRunning running;
    private PodStatusEphemeralContainerStatusesStateTerminated terminated;
    private PodStatusEphemeralContainerStatusesStateWaiting waiting;

    public PodStatusEphemeralContainerStatusesState() {
        // no-op
    }

    public PodStatusEphemeralContainerStatusesState(final PodStatusEphemeralContainerStatusesStateRunning running,
                                                    final PodStatusEphemeralContainerStatusesStateTerminated terminated,
                                                    final PodStatusEphemeralContainerStatusesStateWaiting waiting) {
        // no-op
    }

    public PodStatusEphemeralContainerStatusesStateRunning getRunning() {
        return running;
    }

    public void setRunning(final PodStatusEphemeralContainerStatusesStateRunning running) {
        this.running = running;
    }

    public PodStatusEphemeralContainerStatusesStateTerminated getTerminated() {
        return terminated;
    }

    public void setTerminated(final PodStatusEphemeralContainerStatusesStateTerminated terminated) {
        this.terminated = terminated;
    }

    public PodStatusEphemeralContainerStatusesStateWaiting getWaiting() {
        return waiting;
    }

    public void setWaiting(final PodStatusEphemeralContainerStatusesStateWaiting waiting) {
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
        if (!(__other instanceof PodStatusEphemeralContainerStatusesState)) {
            return false;
        }
        final PodStatusEphemeralContainerStatusesState __otherCasted = (PodStatusEphemeralContainerStatusesState) __other;
        return Objects.equals(running, __otherCasted.running) &&
            Objects.equals(terminated, __otherCasted.terminated) &&
            Objects.equals(waiting, __otherCasted.waiting);
    }
}
