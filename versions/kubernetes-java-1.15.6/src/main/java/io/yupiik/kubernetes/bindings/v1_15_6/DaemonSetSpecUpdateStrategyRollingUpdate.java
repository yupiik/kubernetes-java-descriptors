package io.yupiik.kubernetes.bindings.v1_15_6;

import java.util.Objects;

public class DaemonSetSpecUpdateStrategyRollingUpdate {
    private String maxUnavailable;

    public DaemonSetSpecUpdateStrategyRollingUpdate() {
        // no-op
    }

    public DaemonSetSpecUpdateStrategyRollingUpdate(final String maxUnavailable) {
        // no-op
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
                maxUnavailable);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DaemonSetSpecUpdateStrategyRollingUpdate)) {
            return false;
        }
        final DaemonSetSpecUpdateStrategyRollingUpdate __otherCasted = (DaemonSetSpecUpdateStrategyRollingUpdate) __other;
        return Objects.equals(maxUnavailable, __otherCasted.maxUnavailable);
    }
}
