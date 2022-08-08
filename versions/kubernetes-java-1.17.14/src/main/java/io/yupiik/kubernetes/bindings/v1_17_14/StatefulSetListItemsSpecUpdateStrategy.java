package io.yupiik.kubernetes.bindings.v1_17_14;

import java.util.Objects;

public class StatefulSetListItemsSpecUpdateStrategy {
    private StatefulSetListItemsSpecUpdateStrategyRollingUpdate rollingUpdate;
    private String type;

    public StatefulSetListItemsSpecUpdateStrategy() {
        // no-op
    }

    public StatefulSetListItemsSpecUpdateStrategy(final StatefulSetListItemsSpecUpdateStrategyRollingUpdate rollingUpdate,
                                                  final String type) {
        // no-op
    }

    public StatefulSetListItemsSpecUpdateStrategyRollingUpdate getRollingUpdate() {
        return rollingUpdate;
    }

    public void setRollingUpdate(final StatefulSetListItemsSpecUpdateStrategyRollingUpdate rollingUpdate) {
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
        if (!(__other instanceof StatefulSetListItemsSpecUpdateStrategy)) {
            return false;
        }
        final StatefulSetListItemsSpecUpdateStrategy __otherCasted = (StatefulSetListItemsSpecUpdateStrategy) __other;
        return Objects.equals(rollingUpdate, __otherCasted.rollingUpdate) &&
            Objects.equals(type, __otherCasted.type);
    }
}
