package io.yupiik.kubernetes.bindings.v1_15_5;

import java.util.Objects;

public class PodSecurityPolicySpecSupplementalGroupsRanges {
    private int max;
    private int min;

    public PodSecurityPolicySpecSupplementalGroupsRanges() {
        // no-op
    }

    public PodSecurityPolicySpecSupplementalGroupsRanges(final int max,
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
        if (!(__other instanceof PodSecurityPolicySpecSupplementalGroupsRanges)) {
            return false;
        }
        final PodSecurityPolicySpecSupplementalGroupsRanges __otherCasted = (PodSecurityPolicySpecSupplementalGroupsRanges) __other;
        return Objects.equals(max, __otherCasted.max) &&
            Objects.equals(min, __otherCasted.min);
    }
}
