package io.yupiik.kubernetes.bindings.v1_20_3;

import java.util.Objects;

public class PodStatusEphemeralContainerStatusesStateRunning {
    private String startedAt;

    public PodStatusEphemeralContainerStatusesStateRunning() {
        // no-op
    }

    public PodStatusEphemeralContainerStatusesStateRunning(final String startedAt) {
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
        if (!(__other instanceof PodStatusEphemeralContainerStatusesStateRunning)) {
            return false;
        }
        final PodStatusEphemeralContainerStatusesStateRunning __otherCasted = (PodStatusEphemeralContainerStatusesStateRunning) __other;
        return Objects.equals(startedAt, __otherCasted.startedAt);
    }
}
