package io.yupiik.kubernetes.bindings.v1_17_14.v1;

import io.yupiik.kubernetes.bindings.v1_17_14.Validable;
import io.yupiik.kubernetes.bindings.v1_17_14.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class VolumeNodeResources implements Validable<VolumeNodeResources> {
    private Integer count;

    public VolumeNodeResources() {
        // no-op
    }

    public VolumeNodeResources(final Integer count) {
        // no-op
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(final Integer count) {
        this.count = count;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                count);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VolumeNodeResources)) {
            return false;
        }
        final VolumeNodeResources __otherCasted = (VolumeNodeResources) __other;
        return Objects.equals(count, __otherCasted.count);
    }

    public VolumeNodeResources count(final Integer count) {
        this.count = count;
        return this;
    }

    @Override
    public VolumeNodeResources validate() {
        return this;
    }
}
