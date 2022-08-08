package io.yupiik.kubernetes.bindings.v1_20_4;

import java.util.Objects;

public class CSINodeSpecDriversAllocatable {
    private Integer count;

    public CSINodeSpecDriversAllocatable() {
        // no-op
    }

    public CSINodeSpecDriversAllocatable(final Integer count) {
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
        if (!(__other instanceof CSINodeSpecDriversAllocatable)) {
            return false;
        }
        final CSINodeSpecDriversAllocatable __otherCasted = (CSINodeSpecDriversAllocatable) __other;
        return Objects.equals(count, __otherCasted.count);
    }
}
