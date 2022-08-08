package io.yupiik.kubernetes.bindings.v1_14_9.v1beta1;

import java.util.Objects;

public class DaemonSetListItemsSpecUpdateStrategyRollingUpdate {
    private String maxUnavailable;

    public DaemonSetListItemsSpecUpdateStrategyRollingUpdate() {
        // no-op
    }

    public DaemonSetListItemsSpecUpdateStrategyRollingUpdate(final String maxUnavailable) {
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
        if (!(__other instanceof DaemonSetListItemsSpecUpdateStrategyRollingUpdate)) {
            return false;
        }
        final DaemonSetListItemsSpecUpdateStrategyRollingUpdate __otherCasted = (DaemonSetListItemsSpecUpdateStrategyRollingUpdate) __other;
        return Objects.equals(maxUnavailable, __otherCasted.maxUnavailable);
    }
}
