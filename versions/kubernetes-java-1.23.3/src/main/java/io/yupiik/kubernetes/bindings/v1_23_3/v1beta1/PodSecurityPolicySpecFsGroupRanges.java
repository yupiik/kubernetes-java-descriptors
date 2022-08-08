package io.yupiik.kubernetes.bindings.v1_23_3.v1beta1;

import java.util.Objects;

public class PodSecurityPolicySpecFsGroupRanges {
    private int max;
    private int min;

    public PodSecurityPolicySpecFsGroupRanges() {
        // no-op
    }

    public PodSecurityPolicySpecFsGroupRanges(final int max,
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
        if (!(__other instanceof PodSecurityPolicySpecFsGroupRanges)) {
            return false;
        }
        final PodSecurityPolicySpecFsGroupRanges __otherCasted = (PodSecurityPolicySpecFsGroupRanges) __other;
        return Objects.equals(max, __otherCasted.max) &&
            Objects.equals(min, __otherCasted.min);
    }
}
