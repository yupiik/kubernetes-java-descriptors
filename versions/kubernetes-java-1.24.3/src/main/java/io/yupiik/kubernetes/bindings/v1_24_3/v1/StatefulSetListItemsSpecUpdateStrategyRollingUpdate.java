package io.yupiik.kubernetes.bindings.v1_24_3.v1;

import java.util.Objects;

public class StatefulSetListItemsSpecUpdateStrategyRollingUpdate {
    private String maxUnavailable;
    private Integer partition;

    public StatefulSetListItemsSpecUpdateStrategyRollingUpdate() {
        // no-op
    }

    public StatefulSetListItemsSpecUpdateStrategyRollingUpdate(final String maxUnavailable,
                                                               final Integer partition) {
        // no-op
    }

    public String getMaxUnavailable() {
        return maxUnavailable;
    }

    public void setMaxUnavailable(final String maxUnavailable) {
        this.maxUnavailable = maxUnavailable;
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
                maxUnavailable,
                partition);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StatefulSetListItemsSpecUpdateStrategyRollingUpdate)) {
            return false;
        }
        final StatefulSetListItemsSpecUpdateStrategyRollingUpdate __otherCasted = (StatefulSetListItemsSpecUpdateStrategyRollingUpdate) __other;
        return Objects.equals(maxUnavailable, __otherCasted.maxUnavailable) &&
            Objects.equals(partition, __otherCasted.partition);
    }
}
