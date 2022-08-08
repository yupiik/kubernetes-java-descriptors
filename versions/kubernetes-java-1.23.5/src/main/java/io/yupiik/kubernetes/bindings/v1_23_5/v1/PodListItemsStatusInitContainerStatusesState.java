package io.yupiik.kubernetes.bindings.v1_23_5.v1;

import java.util.Objects;

public class PodListItemsStatusInitContainerStatusesState {
    private PodListItemsStatusInitContainerStatusesStateRunning running;
    private PodListItemsStatusInitContainerStatusesStateTerminated terminated;
    private PodListItemsStatusInitContainerStatusesStateWaiting waiting;

    public PodListItemsStatusInitContainerStatusesState() {
        // no-op
    }

    public PodListItemsStatusInitContainerStatusesState(final PodListItemsStatusInitContainerStatusesStateRunning running,
                                                        final PodListItemsStatusInitContainerStatusesStateTerminated terminated,
                                                        final PodListItemsStatusInitContainerStatusesStateWaiting waiting) {
        // no-op
    }

    public PodListItemsStatusInitContainerStatusesStateRunning getRunning() {
        return running;
    }

    public void setRunning(final PodListItemsStatusInitContainerStatusesStateRunning running) {
        this.running = running;
    }

    public PodListItemsStatusInitContainerStatusesStateTerminated getTerminated() {
        return terminated;
    }

    public void setTerminated(final PodListItemsStatusInitContainerStatusesStateTerminated terminated) {
        this.terminated = terminated;
    }

    public PodListItemsStatusInitContainerStatusesStateWaiting getWaiting() {
        return waiting;
    }

    public void setWaiting(final PodListItemsStatusInitContainerStatusesStateWaiting waiting) {
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
        if (!(__other instanceof PodListItemsStatusInitContainerStatusesState)) {
            return false;
        }
        final PodListItemsStatusInitContainerStatusesState __otherCasted = (PodListItemsStatusInitContainerStatusesState) __other;
        return Objects.equals(running, __otherCasted.running) &&
            Objects.equals(terminated, __otherCasted.terminated) &&
            Objects.equals(waiting, __otherCasted.waiting);
    }
}
