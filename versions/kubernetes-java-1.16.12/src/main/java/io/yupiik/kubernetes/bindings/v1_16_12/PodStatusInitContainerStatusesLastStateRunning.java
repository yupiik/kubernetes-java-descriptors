package io.yupiik.kubernetes.bindings.v1_16_12;

import java.util.Objects;

public class PodStatusInitContainerStatusesLastStateRunning {
    private String startedAt;

    public PodStatusInitContainerStatusesLastStateRunning() {
        // no-op
    }

    public PodStatusInitContainerStatusesLastStateRunning(final String startedAt) {
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
        if (!(__other instanceof PodStatusInitContainerStatusesLastStateRunning)) {
            return false;
        }
        final PodStatusInitContainerStatusesLastStateRunning __otherCasted = (PodStatusInitContainerStatusesLastStateRunning) __other;
        return Objects.equals(startedAt, __otherCasted.startedAt);
    }
}
