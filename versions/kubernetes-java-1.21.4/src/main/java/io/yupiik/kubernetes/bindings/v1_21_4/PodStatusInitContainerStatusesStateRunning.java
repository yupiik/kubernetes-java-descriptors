package io.yupiik.kubernetes.bindings.v1_21_4;

import java.util.Objects;

public class PodStatusInitContainerStatusesStateRunning {
    private String startedAt;

    public PodStatusInitContainerStatusesStateRunning() {
        // no-op
    }

    public PodStatusInitContainerStatusesStateRunning(final String startedAt) {
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
        if (!(__other instanceof PodStatusInitContainerStatusesStateRunning)) {
            return false;
        }
        final PodStatusInitContainerStatusesStateRunning __otherCasted = (PodStatusInitContainerStatusesStateRunning) __other;
        return Objects.equals(startedAt, __otherCasted.startedAt);
    }
}
