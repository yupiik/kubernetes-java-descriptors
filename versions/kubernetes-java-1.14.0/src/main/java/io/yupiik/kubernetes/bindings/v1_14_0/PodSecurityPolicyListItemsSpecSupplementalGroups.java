package io.yupiik.kubernetes.bindings.v1_14_0;

import java.util.List;
import java.util.Objects;

public class PodSecurityPolicyListItemsSpecSupplementalGroups {
    private List<PodSecurityPolicyListItemsSpecSupplementalGroupsRanges> ranges;
    private String rule;

    public PodSecurityPolicyListItemsSpecSupplementalGroups() {
        // no-op
    }

    public PodSecurityPolicyListItemsSpecSupplementalGroups(final List<PodSecurityPolicyListItemsSpecSupplementalGroupsRanges> ranges,
                                                            final String rule) {
        // no-op
    }

    public List<PodSecurityPolicyListItemsSpecSupplementalGroupsRanges> getRanges() {
        return ranges;
    }

    public void setRanges(final List<PodSecurityPolicyListItemsSpecSupplementalGroupsRanges> ranges) {
        this.ranges = ranges;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(final String rule) {
        this.rule = rule;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                ranges,
                rule);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodSecurityPolicyListItemsSpecSupplementalGroups)) {
            return false;
        }
        final PodSecurityPolicyListItemsSpecSupplementalGroups __otherCasted = (PodSecurityPolicyListItemsSpecSupplementalGroups) __other;
        return Objects.equals(ranges, __otherCasted.ranges) &&
            Objects.equals(rule, __otherCasted.rule);
    }
}
