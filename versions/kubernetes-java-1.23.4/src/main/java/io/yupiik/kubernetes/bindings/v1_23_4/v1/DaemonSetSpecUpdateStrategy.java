package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import java.util.Objects;

public class DaemonSetSpecUpdateStrategy {
    private DaemonSetSpecUpdateStrategyRollingUpdate rollingUpdate;
    private DaemonSetSpecUpdateStrategyType type;

    public DaemonSetSpecUpdateStrategy() {
        // no-op
    }

    public DaemonSetSpecUpdateStrategy(final DaemonSetSpecUpdateStrategyRollingUpdate rollingUpdate,
                                       final DaemonSetSpecUpdateStrategyType type) {
        // no-op
    }

    public DaemonSetSpecUpdateStrategyRollingUpdate getRollingUpdate() {
        return rollingUpdate;
    }

    public void setRollingUpdate(final DaemonSetSpecUpdateStrategyRollingUpdate rollingUpdate) {
        this.rollingUpdate = rollingUpdate;
    }

    public DaemonSetSpecUpdateStrategyType getType() {
        return type;
    }

    public void setType(final DaemonSetSpecUpdateStrategyType type) {
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
        if (!(__other instanceof DaemonSetSpecUpdateStrategy)) {
            return false;
        }
        final DaemonSetSpecUpdateStrategy __otherCasted = (DaemonSetSpecUpdateStrategy) __other;
        return Objects.equals(rollingUpdate, __otherCasted.rollingUpdate) &&
            Objects.equals(type, __otherCasted.type);
    }
}
