package io.yupiik.kubernetes.bindings.v1_17_12.v1;

import java.util.Objects;

public class PodStatusEphemeralContainerStatusesLastState {
    private PodStatusEphemeralContainerStatusesLastStateRunning running;
    private PodStatusEphemeralContainerStatusesLastStateTerminated terminated;
    private PodStatusEphemeralContainerStatusesLastStateWaiting waiting;

    public PodStatusEphemeralContainerStatusesLastState() {
        // no-op
    }

    public PodStatusEphemeralContainerStatusesLastState(final PodStatusEphemeralContainerStatusesLastStateRunning running,
                                                        final PodStatusEphemeralContainerStatusesLastStateTerminated terminated,
                                                        final PodStatusEphemeralContainerStatusesLastStateWaiting waiting) {
        // no-op
    }

    public PodStatusEphemeralContainerStatusesLastStateRunning getRunning() {
        return running;
    }

    public void setRunning(final PodStatusEphemeralContainerStatusesLastStateRunning running) {
        this.running = running;
    }

    public PodStatusEphemeralContainerStatusesLastStateTerminated getTerminated() {
        return terminated;
    }

    public void setTerminated(final PodStatusEphemeralContainerStatusesLastStateTerminated terminated) {
        this.terminated = terminated;
    }

    public PodStatusEphemeralContainerStatusesLastStateWaiting getWaiting() {
        return waiting;
    }

    public void setWaiting(final PodStatusEphemeralContainerStatusesLastStateWaiting waiting) {
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
        if (!(__other instanceof PodStatusEphemeralContainerStatusesLastState)) {
            return false;
        }
        final PodStatusEphemeralContainerStatusesLastState __otherCasted = (PodStatusEphemeralContainerStatusesLastState) __other;
        return Objects.equals(running, __otherCasted.running) &&
            Objects.equals(terminated, __otherCasted.terminated) &&
            Objects.equals(waiting, __otherCasted.waiting);
    }
}
