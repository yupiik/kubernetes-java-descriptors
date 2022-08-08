package io.yupiik.kubernetes.bindings.v1_24_0.v1;

import io.yupiik.kubernetes.bindings.v1_24_0.Validable;
import io.yupiik.kubernetes.bindings.v1_24_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RollingUpdateStatefulSetStrategy implements Validable<RollingUpdateStatefulSetStrategy> {
    private String maxUnavailable;
    private Integer partition;

    public RollingUpdateStatefulSetStrategy() {
        // no-op
    }

    public RollingUpdateStatefulSetStrategy(final String maxUnavailable,
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
        if (!(__other instanceof RollingUpdateStatefulSetStrategy)) {
            return false;
        }
        final RollingUpdateStatefulSetStrategy __otherCasted = (RollingUpdateStatefulSetStrategy) __other;
        return Objects.equals(maxUnavailable, __otherCasted.maxUnavailable) &&
            Objects.equals(partition, __otherCasted.partition);
    }

    public RollingUpdateStatefulSetStrategy maxUnavailable(final String maxUnavailable) {
        this.maxUnavailable = maxUnavailable;
        return this;
    }

    public RollingUpdateStatefulSetStrategy partition(final Integer partition) {
        this.partition = partition;
        return this;
    }

    @Override
    public RollingUpdateStatefulSetStrategy validate() {
        return this;
    }
}
