package io.yupiik.kubernetes.bindings.v1_22_0.v1;

import java.util.Objects;

public class PodListItemsStatusEphemeralContainerStatusesLastStateRunning {
    private String startedAt;

    public PodListItemsStatusEphemeralContainerStatusesLastStateRunning() {
        // no-op
    }

    public PodListItemsStatusEphemeralContainerStatusesLastStateRunning(final String startedAt) {
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
        if (!(__other instanceof PodListItemsStatusEphemeralContainerStatusesLastStateRunning)) {
            return false;
        }
        final PodListItemsStatusEphemeralContainerStatusesLastStateRunning __otherCasted = (PodListItemsStatusEphemeralContainerStatusesLastStateRunning) __other;
        return Objects.equals(startedAt, __otherCasted.startedAt);
    }
}
