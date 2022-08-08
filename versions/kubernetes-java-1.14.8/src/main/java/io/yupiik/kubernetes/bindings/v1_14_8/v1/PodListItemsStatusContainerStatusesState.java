package io.yupiik.kubernetes.bindings.v1_14_8.v1;

import java.util.Objects;

public class PodListItemsStatusContainerStatusesState {
    private PodListItemsStatusContainerStatusesStateRunning running;
    private PodListItemsStatusContainerStatusesStateTerminated terminated;
    private PodListItemsStatusContainerStatusesStateWaiting waiting;

    public PodListItemsStatusContainerStatusesState() {
        // no-op
    }

    public PodListItemsStatusContainerStatusesState(final PodListItemsStatusContainerStatusesStateRunning running,
                                                    final PodListItemsStatusContainerStatusesStateTerminated terminated,
                                                    final PodListItemsStatusContainerStatusesStateWaiting waiting) {
        // no-op
    }

    public PodListItemsStatusContainerStatusesStateRunning getRunning() {
        return running;
    }

    public void setRunning(final PodListItemsStatusContainerStatusesStateRunning running) {
        this.running = running;
    }

    public PodListItemsStatusContainerStatusesStateTerminated getTerminated() {
        return terminated;
    }

    public void setTerminated(final PodListItemsStatusContainerStatusesStateTerminated terminated) {
        this.terminated = terminated;
    }

    public PodListItemsStatusContainerStatusesStateWaiting getWaiting() {
        return waiting;
    }

    public void setWaiting(final PodListItemsStatusContainerStatusesStateWaiting waiting) {
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
        if (!(__other instanceof PodListItemsStatusContainerStatusesState)) {
            return false;
        }
        final PodListItemsStatusContainerStatusesState __otherCasted = (PodListItemsStatusContainerStatusesState) __other;
        return Objects.equals(running, __otherCasted.running) &&
            Objects.equals(terminated, __otherCasted.terminated) &&
            Objects.equals(waiting, __otherCasted.waiting);
    }
}
