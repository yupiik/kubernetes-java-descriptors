package io.yupiik.kubernetes.bindings.v1_17_13;

import java.util.Objects;

public class PodStatusContainerStatusesLastStateRunning {
    private String startedAt;

    public PodStatusContainerStatusesLastStateRunning() {
        // no-op
    }

    public PodStatusContainerStatusesLastStateRunning(final String startedAt) {
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
        if (!(__other instanceof PodStatusContainerStatusesLastStateRunning)) {
            return false;
        }
        final PodStatusContainerStatusesLastStateRunning __otherCasted = (PodStatusContainerStatusesLastStateRunning) __other;
        return Objects.equals(startedAt, __otherCasted.startedAt);
    }
}
