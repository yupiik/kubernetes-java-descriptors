package io.yupiik.kubernetes.bindings.v1_17_1;

import java.util.Objects;

public class PodListItemsStatusInitContainerStatusesStateRunning {
    private String startedAt;

    public PodListItemsStatusInitContainerStatusesStateRunning() {
        // no-op
    }

    public PodListItemsStatusInitContainerStatusesStateRunning(final String startedAt) {
        // no-op
    }

    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(final String startedAt) {
        this.startedAt = startedAt;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                startedAt);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodListItemsStatusInitContainerStatusesStateRunning)) {
            return false;
        }
        final PodListItemsStatusInitContainerStatusesStateRunning __otherCasted = (PodListItemsStatusInitContainerStatusesStateRunning) __other;
        return Objects.equals(startedAt, __otherCasted.startedAt);
    }
}
