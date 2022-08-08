package io.yupiik.kubernetes.bindings.v1_23_8.v1;

import java.util.Objects;

public class PodStatusContainerStatusesStateRunning {
    private String startedAt;

    public PodStatusContainerStatusesStateRunning() {
        // no-op
    }

    public PodStatusContainerStatusesStateRunning(final String startedAt) {
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
        if (!(__other instanceof PodStatusContainerStatusesStateRunning)) {
            return false;
        }
        final PodStatusContainerStatusesStateRunning __otherCasted = (PodStatusContainerStatusesStateRunning) __other;
        return Objects.equals(startedAt, __otherCasted.startedAt);
    }
}
