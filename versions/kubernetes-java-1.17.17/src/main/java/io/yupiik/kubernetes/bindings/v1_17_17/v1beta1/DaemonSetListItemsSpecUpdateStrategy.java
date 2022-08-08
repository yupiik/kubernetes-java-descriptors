package io.yupiik.kubernetes.bindings.v1_17_17.v1beta1;

import java.util.Objects;

public class DaemonSetListItemsSpecUpdateStrategy {
    private DaemonSetListItemsSpecUpdateStrategyRollingUpdate rollingUpdate;
    private String type;

    public DaemonSetListItemsSpecUpdateStrategy() {
        // no-op
    }

    public DaemonSetListItemsSpecUpdateStrategy(final DaemonSetListItemsSpecUpdateStrategyRollingUpdate rollingUpdate,
                                                final String type) {
        // no-op
    }

    public DaemonSetListItemsSpecUpdateStrategyRollingUpdate getRollingUpdate() {
        return rollingUpdate;
    }

    public void setRollingUpdate(final DaemonSetListItemsSpecUpdateStrategyRollingUpdate rollingUpdate) {
        this.rollingUpdate = rollingUpdate;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                rollingUpdate,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DaemonSetListItemsSpecUpdateStrategy)) {
            return false;
        }
        final DaemonSetListItemsSpecUpdateStrategy __otherCasted = (DaemonSetListItemsSpecUpdateStrategy) __other;
        return Objects.equals(rollingUpdate, __otherCasted.rollingUpdate) &&
            Objects.equals(type, __otherCasted.type);
    }
}
