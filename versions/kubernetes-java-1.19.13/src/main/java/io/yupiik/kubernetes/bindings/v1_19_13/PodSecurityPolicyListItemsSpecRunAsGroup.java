package io.yupiik.kubernetes.bindings.v1_19_13;

import java.util.List;
import java.util.Objects;

public class PodSecurityPolicyListItemsSpecRunAsGroup {
    private List<PodSecurityPolicyListItemsSpecRunAsGroupRanges> ranges;
    private String rule;

    public PodSecurityPolicyListItemsSpecRunAsGroup() {
        // no-op
    }

    public PodSecurityPolicyListItemsSpecRunAsGroup(final List<PodSecurityPolicyListItemsSpecRunAsGroupRanges> ranges,
                                                    final String rule) {
        // no-op
    }

    public List<PodSecurityPolicyListItemsSpecRunAsGroupRanges> getRanges() {
        return ranges;
    }

    public void setRanges(final List<PodSecurityPolicyListItemsSpecRunAsGroupRanges> ranges) {
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
        if (!(__other instanceof PodSecurityPolicyListItemsSpecRunAsGroup)) {
            return false;
        }
        final PodSecurityPolicyListItemsSpecRunAsGroup __otherCasted = (PodSecurityPolicyListItemsSpecRunAsGroup) __other;
        return Objects.equals(ranges, __otherCasted.ranges) &&
            Objects.equals(rule, __otherCasted.rule);
    }
}
