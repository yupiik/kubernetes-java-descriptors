package io.yupiik.kubernetes.bindings.v1_16_8.v1beta1;

import io.yupiik.kubernetes.bindings.v1_16_8.Validable;
import io.yupiik.kubernetes.bindings.v1_16_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HostPortRange implements Validable<HostPortRange> {
    private int max;
    private int min;

    public HostPortRange() {
        // no-op
    }

    public HostPortRange(final int max,
                         final int min) {
        // no-op
    }

    public int getMax() {
        return max;
    }

    public void setMax(final int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(final int min) {
        this.min = min;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                max,
                min);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HostPortRange)) {
            return false;
        }
        final HostPortRange __otherCasted = (HostPortRange) __other;
        return Objects.equals(max, __otherCasted.max) &&
            Objects.equals(min, __otherCasted.min);
    }

    public HostPortRange max(final int max) {
        this.max = max;
        return this;
    }

    public HostPortRange min(final int min) {
        this.min = min;
        return this;
    }

    @Override
    public HostPortRange validate() {
        return this;
    }
}
