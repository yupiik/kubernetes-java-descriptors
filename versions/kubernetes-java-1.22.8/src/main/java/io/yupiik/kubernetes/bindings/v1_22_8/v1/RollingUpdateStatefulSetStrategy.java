package io.yupiik.kubernetes.bindings.v1_22_8.v1;

import io.yupiik.kubernetes.bindings.v1_22_8.Validable;
import io.yupiik.kubernetes.bindings.v1_22_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RollingUpdateStatefulSetStrategy implements Validable<RollingUpdateStatefulSetStrategy> {
    private Integer partition;

    public RollingUpdateStatefulSetStrategy() {
        // no-op
    }

    public RollingUpdateStatefulSetStrategy(final Integer partition) {
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
        if (!(__other instanceof RollingUpdateStatefulSetStrategy)) {
            return false;
        }
        final RollingUpdateStatefulSetStrategy __otherCasted = (RollingUpdateStatefulSetStrategy) __other;
        return Objects.equals(partition, __otherCasted.partition);
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
