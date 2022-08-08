package io.yupiik.kubernetes.bindings.v1_21_4;

import java.util.List;
import java.util.Objects;

public class LimitRangeSpec {
    private List<LimitRangeSpecLimits> limits;

    public LimitRangeSpec() {
        // no-op
    }

    public LimitRangeSpec(final List<LimitRangeSpecLimits> limits) {
        // no-op
    }

    public List<LimitRangeSpecLimits> getLimits() {
        return limits;
    }

    public void setLimits(final List<LimitRangeSpecLimits> limits) {
        this.limits = limits;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                limits);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof LimitRangeSpec)) {
            return false;
        }
        final LimitRangeSpec __otherCasted = (LimitRangeSpec) __other;
        return Objects.equals(limits, __otherCasted.limits);
    }
}
