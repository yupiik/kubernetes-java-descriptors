package io.yupiik.kubernetes.bindings.v1_14_9.v1;

import java.util.Objects;

public class PodListItemsStatusContainerStatusesLastStateRunning {
    private String startedAt;

    public PodListItemsStatusContainerStatusesLastStateRunning() {
        // no-op
    }

    public PodListItemsStatusContainerStatusesLastStateRunning(final String startedAt) {
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
        if (!(__other instanceof PodListItemsStatusContainerStatusesLastStateRunning)) {
            return false;
        }
        final PodListItemsStatusContainerStatusesLastStateRunning __otherCasted = (PodListItemsStatusContainerStatusesLastStateRunning) __other;
        return Objects.equals(startedAt, __otherCasted.startedAt);
    }
}
