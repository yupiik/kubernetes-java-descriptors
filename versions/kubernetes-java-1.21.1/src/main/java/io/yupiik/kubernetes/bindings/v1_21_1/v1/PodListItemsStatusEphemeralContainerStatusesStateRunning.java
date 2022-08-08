package io.yupiik.kubernetes.bindings.v1_21_1.v1;

import java.util.Objects;

public class PodListItemsStatusEphemeralContainerStatusesStateRunning {
    private String startedAt;

    public PodListItemsStatusEphemeralContainerStatusesStateRunning() {
        // no-op
    }

    public PodListItemsStatusEphemeralContainerStatusesStateRunning(final String startedAt) {
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
        if (!(__other instanceof PodListItemsStatusEphemeralContainerStatusesStateRunning)) {
            return false;
        }
        final PodListItemsStatusEphemeralContainerStatusesStateRunning __otherCasted = (PodListItemsStatusEphemeralContainerStatusesStateRunning) __other;
        return Objects.equals(startedAt, __otherCasted.startedAt);
    }
}
