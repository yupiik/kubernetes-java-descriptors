package io.yupiik.kubernetes.bindings.v1_19_0;

import java.util.Objects;

public class PodListItemsStatusEphemeralContainerStatusesState {
    private PodListItemsStatusEphemeralContainerStatusesStateRunning running;
    private PodListItemsStatusEphemeralContainerStatusesStateTerminated terminated;
    private PodListItemsStatusEphemeralContainerStatusesStateWaiting waiting;

    public PodListItemsStatusEphemeralContainerStatusesState() {
        // no-op
    }

    public PodListItemsStatusEphemeralContainerStatusesState(final PodListItemsStatusEphemeralContainerStatusesStateRunning running,
                                                             final PodListItemsStatusEphemeralContainerStatusesStateTerminated terminated,
                                                             final PodListItemsStatusEphemeralContainerStatusesStateWaiting waiting) {
        // no-op
    }

    public PodListItemsStatusEphemeralContainerStatusesStateRunning getRunning() {
        return running;
    }

    public void setRunning(final PodListItemsStatusEphemeralContainerStatusesStateRunning running) {
        this.running = running;
    }

    public PodListItemsStatusEphemeralContainerStatusesStateTerminated getTerminated() {
        return terminated;
    }

    public void setTerminated(final PodListItemsStatusEphemeralContainerStatusesStateTerminated terminated) {
        this.terminated = terminated;
    }

    public PodListItemsStatusEphemeralContainerStatusesStateWaiting getWaiting() {
        return waiting;
    }

    public void setWaiting(final PodListItemsStatusEphemeralContainerStatusesStateWaiting waiting) {
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
        if (!(__other instanceof PodListItemsStatusEphemeralContainerStatusesState)) {
            return false;
        }
        final PodListItemsStatusEphemeralContainerStatusesState __otherCasted = (PodListItemsStatusEphemeralContainerStatusesState) __other;
        return Objects.equals(running, __otherCasted.running) &&
            Objects.equals(terminated, __otherCasted.terminated) &&
            Objects.equals(waiting, __otherCasted.waiting);
    }
}
