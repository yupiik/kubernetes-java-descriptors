package io.yupiik.kubernetes.bindings.v1_20_8;

import java.util.Objects;

public class PodStatusEphemeralContainerStatusesLastStateRunning {
    private String startedAt;

    public PodStatusEphemeralContainerStatusesLastStateRunning() {
        // no-op
    }

    public PodStatusEphemeralContainerStatusesLastStateRunning(final String startedAt) {
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
        if (!(__other instanceof PodStatusEphemeralContainerStatusesLastStateRunning)) {
            return false;
        }
        final PodStatusEphemeralContainerStatusesLastStateRunning __otherCasted = (PodStatusEphemeralContainerStatusesLastStateRunning) __other;
        return Objects.equals(startedAt, __otherCasted.startedAt);
    }
}
