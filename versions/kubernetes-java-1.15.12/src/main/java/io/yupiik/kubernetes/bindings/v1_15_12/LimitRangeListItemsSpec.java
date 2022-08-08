package io.yupiik.kubernetes.bindings.v1_15_12;

import java.util.List;
import java.util.Objects;

public class LimitRangeListItemsSpec {
    private List<LimitRangeListItemsSpecLimits> limits;

    public LimitRangeListItemsSpec() {
        // no-op
    }

    public LimitRangeListItemsSpec(final List<LimitRangeListItemsSpecLimits> limits) {
        // no-op
    }

    public List<LimitRangeListItemsSpecLimits> getLimits() {
        return limits;
    }

    public void setLimits(final List<LimitRangeListItemsSpecLimits> limits) {
        this.limits = limits;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                limits);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof LimitRangeListItemsSpec)) {
            return false;
        }
        final LimitRangeListItemsSpec __otherCasted = (LimitRangeListItemsSpec) __other;
        return Objects.equals(limits, __otherCasted.limits);
    }
}
