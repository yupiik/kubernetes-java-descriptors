package io.yupiik.kubernetes.bindings.v1_15_6.v1beta2;

import java.util.Objects;

public class StatefulSetSpecUpdateStrategy {
    private StatefulSetSpecUpdateStrategyRollingUpdate rollingUpdate;
    private String type;

    public StatefulSetSpecUpdateStrategy() {
        // no-op
    }

    public StatefulSetSpecUpdateStrategy(final StatefulSetSpecUpdateStrategyRollingUpdate rollingUpdate,
                                         final String type) {
        // no-op
    }

    public StatefulSetSpecUpdateStrategyRollingUpdate getRollingUpdate() {
        return rollingUpdate;
    }

    public void setRollingUpdate(final StatefulSetSpecUpdateStrategyRollingUpdate rollingUpdate) {
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
        if (!(__other instanceof StatefulSetSpecUpdateStrategy)) {
            return false;
        }
        final StatefulSetSpecUpdateStrategy __otherCasted = (StatefulSetSpecUpdateStrategy) __other;
        return Objects.equals(rollingUpdate, __otherCasted.rollingUpdate) &&
            Objects.equals(type, __otherCasted.type);
    }
}
