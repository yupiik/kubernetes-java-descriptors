package io.yupiik.kubernetes.bindings.v1_23_5.v1;

import java.util.Objects;

public class PodListItemsStatusInitContainerStatusesLastState {
    private PodListItemsStatusInitContainerStatusesLastStateRunning running;
    private PodListItemsStatusInitContainerStatusesLastStateTerminated terminated;
    private PodListItemsStatusInitContainerStatusesLastStateWaiting waiting;

    public PodListItemsStatusInitContainerStatusesLastState() {
        // no-op
    }

    public PodListItemsStatusInitContainerStatusesLastState(final PodListItemsStatusInitContainerStatusesLastStateRunning running,
                                                            final PodListItemsStatusInitContainerStatusesLastStateTerminated terminated,
                                                            final PodListItemsStatusInitContainerStatusesLastStateWaiting waiting) {
        // no-op
    }

    public PodListItemsStatusInitContainerStatusesLastStateRunning getRunning() {
        return running;
    }

    public void setRunning(final PodListItemsStatusInitContainerStatusesLastStateRunning running) {
        this.running = running;
    }

    public PodListItemsStatusInitContainerStatusesLastStateTerminated getTerminated() {
        return terminated;
    }

    public void setTerminated(final PodListItemsStatusInitContainerStatusesLastStateTerminated terminated) {
        this.terminated = terminated;
    }

    public PodListItemsStatusInitContainerStatusesLastStateWaiting getWaiting() {
        return waiting;
    }

    public void setWaiting(final PodListItemsStatusInitContainerStatusesLastStateWaiting waiting) {
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
        if (!(__other instanceof PodListItemsStatusInitContainerStatusesLastState)) {
            return false;
        }
        final PodListItemsStatusInitContainerStatusesLastState __otherCasted = (PodListItemsStatusInitContainerStatusesLastState) __other;
        return Objects.equals(running, __otherCasted.running) &&
            Objects.equals(terminated, __otherCasted.terminated) &&
            Objects.equals(waiting, __otherCasted.waiting);
    }
}
