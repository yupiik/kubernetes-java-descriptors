package io.yupiik.kubernetes.bindings.v1_21_1.v1;

import java.util.Objects;

public class CSINodeListItemsSpecDriversAllocatable {
    private Integer count;

    public CSINodeListItemsSpecDriversAllocatable() {
        // no-op
    }

    public CSINodeListItemsSpecDriversAllocatable(final Integer count) {
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
        if (!(__other instanceof CSINodeListItemsSpecDriversAllocatable)) {
            return false;
        }
        final CSINodeListItemsSpecDriversAllocatable __otherCasted = (CSINodeListItemsSpecDriversAllocatable) __other;
        return Objects.equals(count, __otherCasted.count);
    }
}
