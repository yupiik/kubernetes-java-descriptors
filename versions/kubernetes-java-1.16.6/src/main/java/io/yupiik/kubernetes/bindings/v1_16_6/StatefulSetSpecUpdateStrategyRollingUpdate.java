package io.yupiik.kubernetes.bindings.v1_16_6;

import java.util.Objects;

public class StatefulSetSpecUpdateStrategyRollingUpdate {
    private Integer partition;

    public StatefulSetSpecUpdateStrategyRollingUpdate() {
        // no-op
    }

    public StatefulSetSpecUpdateStrategyRollingUpdate(final Integer partition) {
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
        if (!(__other instanceof StatefulSetSpecUpdateStrategyRollingUpdate)) {
            return false;
        }
        final StatefulSetSpecUpdateStrategyRollingUpdate __otherCasted = (StatefulSetSpecUpdateStrategyRollingUpdate) __other;
        return Objects.equals(partition, __otherCasted.partition);
    }
}
