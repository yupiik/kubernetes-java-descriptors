package io.yupiik.kubernetes.bindings.v1_16_10.v1;

import java.util.Objects;

public class PodListItemsStatusContainerStatusesStateRunning {
    private String startedAt;

    public PodListItemsStatusContainerStatusesStateRunning() {
        // no-op
    }

    public PodListItemsStatusContainerStatusesStateRunning(final String startedAt) {
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
        if (!(__other instanceof PodListItemsStatusContainerStatusesStateRunning)) {
            return false;
        }
        final PodListItemsStatusContainerStatusesStateRunning __otherCasted = (PodListItemsStatusContainerStatusesStateRunning) __other;
        return Objects.equals(startedAt, __otherCasted.startedAt);
    }
}
