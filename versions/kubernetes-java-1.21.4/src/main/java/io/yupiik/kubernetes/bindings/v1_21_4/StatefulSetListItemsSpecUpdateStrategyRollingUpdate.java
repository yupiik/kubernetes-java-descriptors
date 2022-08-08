package io.yupiik.kubernetes.bindings.v1_21_4;

import java.util.Objects;

public class StatefulSetListItemsSpecUpdateStrategyRollingUpdate {
    private Integer partition;

    public StatefulSetListItemsSpecUpdateStrategyRollingUpdate() {
        // no-op
    }

    public StatefulSetListItemsSpecUpdateStrategyRollingUpdate(final Integer partition) {
        // no-op
    }

    public Integer getPartition() {
        return partition;
    }

    public void setPartition(final Integer partition) {
        this.partition = partition;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                partition);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StatefulSetListItemsSpecUpdateStrategyRollingUpdate)) {
            return false;
        }
        final StatefulSetListItemsSpecUpdateStrategyRollingUpdate __otherCasted = (StatefulSetListItemsSpecUpdateStrategyRollingUpdate) __other;
        return Objects.equals(partition, __otherCasted.partition);
    }
}
