package io.yupiik.kubernetes.bindings.v1_18_8.v1beta1;

import java.util.Objects;

public class PodSecurityPolicyListItemsSpecSupplementalGroupsRanges {
    private int max;
    private int min;

    public PodSecurityPolicyListItemsSpecSupplementalGroupsRanges() {
        // no-op
    }

    public PodSecurityPolicyListItemsSpecSupplementalGroupsRanges(final int max,
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
        if (!(__other instanceof PodSecurityPolicyListItemsSpecSupplementalGroupsRanges)) {
            return false;
        }
        final PodSecurityPolicyListItemsSpecSupplementalGroupsRanges __otherCasted = (PodSecurityPolicyListItemsSpecSupplementalGroupsRanges) __other;
        return Objects.equals(max, __otherCasted.max) &&
            Objects.equals(min, __otherCasted.min);
    }
}
