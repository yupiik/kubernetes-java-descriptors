package io.yupiik.kubernetes.bindings.v1_14_2.v1;

import java.util.Objects;

public class PodListItemsStatusInitContainerStatusesLastStateRunning {
    private String startedAt;

    public PodListItemsStatusInitContainerStatusesLastStateRunning() {
        // no-op
    }

    public PodListItemsStatusInitContainerStatusesLastStateRunning(final String startedAt) {
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
        if (!(__other instanceof PodListItemsStatusInitContainerStatusesLastStateRunning)) {
            return false;
        }
        final PodListItemsStatusInitContainerStatusesLastStateRunning __otherCasted = (PodListItemsStatusInitContainerStatusesLastStateRunning) __other;
        return Objects.equals(startedAt, __otherCasted.startedAt);
    }
}
