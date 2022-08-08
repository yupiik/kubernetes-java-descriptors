package io.yupiik.kubernetes.bindings.v1_21_8.v1;

import java.util.Objects;

public class DaemonSetListItemsSpecUpdateStrategyRollingUpdate {
    private String maxSurge;
    private String maxUnavailable;

    public DaemonSetListItemsSpecUpdateStrategyRollingUpdate() {
        // no-op
    }

    public DaemonSetListItemsSpecUpdateStrategyRollingUpdate(final String maxSurge,
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
        if (!(__other instanceof DaemonSetListItemsSpecUpdateStrategyRollingUpdate)) {
            return false;
        }
        final DaemonSetListItemsSpecUpdateStrategyRollingUpdate __otherCasted = (DaemonSetListItemsSpecUpdateStrategyRollingUpdate) __other;
        return Objects.equals(maxSurge, __otherCasted.maxSurge) &&
            Objects.equals(maxUnavailable, __otherCasted.maxUnavailable);
    }
}
