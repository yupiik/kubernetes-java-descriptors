package io.yupiik.kubernetes.bindings.v1_22_2.v1beta1;

import io.yupiik.kubernetes.bindings.v1_22_2.Validable;
import io.yupiik.kubernetes.bindings.v1_22_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IDRange implements Validable<IDRange> {
    private int max;
    private int min;

    public IDRange() {
        // no-op
    }

    public IDRange(final int max,
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
        if (!(__other instanceof IDRange)) {
            return false;
        }
        final IDRange __otherCasted = (IDRange) __other;
        return Objects.equals(max, __otherCasted.max) &&
            Objects.equals(min, __otherCasted.min);
    }

    public IDRange max(final int max) {
        this.max = max;
        return this;
    }

    public IDRange min(final int min) {
        this.min = min;
        return this;
    }

    @Override
    public IDRange validate() {
        return this;
    }
}
