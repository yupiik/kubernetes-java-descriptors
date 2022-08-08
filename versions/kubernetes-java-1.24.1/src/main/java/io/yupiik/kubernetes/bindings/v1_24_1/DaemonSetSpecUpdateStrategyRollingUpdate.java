package io.yupiik.kubernetes.bindings.v1_24_1;

import java.util.Objects;

public class DaemonSetSpecUpdateStrategyRollingUpdate {
    private String maxSurge;
    private String maxUnavailable;

    public DaemonSetSpecUpdateStrategyRollingUpdate() {
        // no-op
    }

    public DaemonSetSpecUpdateStrategyRollingUpdate(final String maxSurge,
                                                    final String maxUnavailable) {
        // no-op
    }

    public String getMaxSurge() {
        return maxSurge;
    }

    public void setMaxSurge(final String maxSurge) {
        this.maxSurge = maxSurge;
    }

    public String getMaxUnavailable() {
        return maxUnavailable;
    }

    public void setMaxUnavailable(final String maxUnavailable) {
        this.maxUnavailable = maxUnavailable;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                maxSurge,
                maxUnavailable);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DaemonSetSpecUpdateStrategyRollingUpdate)) {
            return false;
        }
        final DaemonSetSpecUpdateStrategyRollingUpdate __otherCasted = (DaemonSetSpecUpdateStrategyRollingUpdate) __other;
        return Objects.equals(maxSurge, __otherCasted.maxSurge) &&
            Objects.equals(maxUnavailable, __otherCasted.maxUnavailable);
    }
}
