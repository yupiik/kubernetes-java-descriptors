package io.yupiik.kubernetes.bindings.v1_14_6;

import java.util.List;
import java.util.Objects;

public class PodSecurityPolicyListItemsSpecFsGroup {
    private List<PodSecurityPolicyListItemsSpecFsGroupRanges> ranges;
    private String rule;

    public PodSecurityPolicyListItemsSpecFsGroup() {
        // no-op
    }

    public PodSecurityPolicyListItemsSpecFsGroup(final List<PodSecurityPolicyListItemsSpecFsGroupRanges> ranges,
                                                 final String rule) {
        // no-op
    }

    public List<PodSecurityPolicyListItemsSpecFsGroupRanges> getRanges() {
        return ranges;
    }

    public void setRanges(final List<PodSecurityPolicyListItemsSpecFsGroupRanges> ranges) {
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
        if (!(__other instanceof PodSecurityPolicyListItemsSpecFsGroup)) {
            return false;
        }
        final PodSecurityPolicyListItemsSpecFsGroup __otherCasted = (PodSecurityPolicyListItemsSpecFsGroup) __other;
        return Objects.equals(ranges, __otherCasted.ranges) &&
            Objects.equals(rule, __otherCasted.rule);
    }
}
