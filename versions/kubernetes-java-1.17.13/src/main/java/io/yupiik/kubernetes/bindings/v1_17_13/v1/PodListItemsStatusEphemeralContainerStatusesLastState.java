package io.yupiik.kubernetes.bindings.v1_17_13.v1;

import java.util.Objects;

public class PodListItemsStatusEphemeralContainerStatusesLastState {
    private PodListItemsStatusEphemeralContainerStatusesLastStateRunning running;
    private PodListItemsStatusEphemeralContainerStatusesLastStateTerminated terminated;
    private PodListItemsStatusEphemeralContainerStatusesLastStateWaiting waiting;

    public PodListItemsStatusEphemeralContainerStatusesLastState() {
        // no-op
    }

    public PodListItemsStatusEphemeralContainerStatusesLastState(final PodListItemsStatusEphemeralContainerStatusesLastStateRunning running,
                                                                 final PodListItemsStatusEphemeralContainerStatusesLastStateTerminated terminated,
                                                                 final PodListItemsStatusEphemeralContainerStatusesLastStateWaiting waiting) {
        // no-op
    }

    public PodListItemsStatusEphemeralContainerStatusesLastStateRunning getRunning() {
        return running;
    }

    public void setRunning(final PodListItemsStatusEphemeralContainerStatusesLastStateRunning running) {
        this.running = running;
    }

    public PodListItemsStatusEphemeralContainerStatusesLastStateTerminated getTerminated() {
        return terminated;
    }

    public void setTerminated(final PodListItemsStatusEphemeralContainerStatusesLastStateTerminated terminated) {
        this.terminated = terminated;
    }

    public PodListItemsStatusEphemeralContainerStatusesLastStateWaiting getWaiting() {
        return waiting;
    }

    public void setWaiting(final PodListItemsStatusEphemeralContainerStatusesLastStateWaiting waiting) {
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
        if (!(__other instanceof PodListItemsStatusEphemeralContainerStatusesLastState)) {
            return false;
        }
        final PodListItemsStatusEphemeralContainerStatusesLastState __otherCasted = (PodListItemsStatusEphemeralContainerStatusesLastState) __other;
        return Objects.equals(running, __otherCasted.running) &&
            Objects.equals(terminated, __otherCasted.terminated) &&
            Objects.equals(waiting, __otherCasted.waiting);
    }
}
