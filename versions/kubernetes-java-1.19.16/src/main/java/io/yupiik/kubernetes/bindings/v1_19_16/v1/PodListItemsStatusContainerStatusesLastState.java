package io.yupiik.kubernetes.bindings.v1_19_16.v1;

import java.util.Objects;

public class PodListItemsStatusContainerStatusesLastState {
    private PodListItemsStatusContainerStatusesLastStateRunning running;
    private PodListItemsStatusContainerStatusesLastStateTerminated terminated;
    private PodListItemsStatusContainerStatusesLastStateWaiting waiting;

    public PodListItemsStatusContainerStatusesLastState() {
        // no-op
    }

    public PodListItemsStatusContainerStatusesLastState(final PodListItemsStatusContainerStatusesLastStateRunning running,
                                                        final PodListItemsStatusContainerStatusesLastStateTerminated terminated,
                                                        final PodListItemsStatusContainerStatusesLastStateWaiting waiting) {
        // no-op
    }

    public PodListItemsStatusContainerStatusesLastStateRunning getRunning() {
        return running;
    }

    public void setRunning(final PodListItemsStatusContainerStatusesLastStateRunning running) {
        this.running = running;
    }

    public PodListItemsStatusContainerStatusesLastStateTerminated getTerminated() {
        return terminated;
    }

    public void setTerminated(final PodListItemsStatusContainerStatusesLastStateTerminated terminated) {
        this.terminated = terminated;
    }

    public PodListItemsStatusContainerStatusesLastStateWaiting getWaiting() {
        return waiting;
    }

    public void setWaiting(final PodListItemsStatusContainerStatusesLastStateWaiting waiting) {
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
        if (!(__other instanceof PodListItemsStatusContainerStatusesLastState)) {
            return false;
        }
        final PodListItemsStatusContainerStatusesLastState __otherCasted = (PodListItemsStatusContainerStatusesLastState) __other;
        return Objects.equals(running, __otherCasted.running) &&
            Objects.equals(terminated, __otherCasted.terminated) &&
            Objects.equals(waiting, __otherCasted.waiting);
    }
}
