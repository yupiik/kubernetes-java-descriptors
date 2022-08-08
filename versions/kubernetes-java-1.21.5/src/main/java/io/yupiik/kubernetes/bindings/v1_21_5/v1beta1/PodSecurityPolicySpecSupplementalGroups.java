package io.yupiik.kubernetes.bindings.v1_21_5.v1beta1;

import java.util.List;
import java.util.Objects;

public class PodSecurityPolicySpecSupplementalGroups {
    private List<PodSecurityPolicySpecSupplementalGroupsRanges> ranges;
    private String rule;

    public PodSecurityPolicySpecSupplementalGroups() {
        // no-op
    }

    public PodSecurityPolicySpecSupplementalGroups(final List<PodSecurityPolicySpecSupplementalGroupsRanges> ranges,
                                                   final String rule) {
        // no-op
    }

    public List<PodSecurityPolicySpecSupplementalGroupsRanges> getRanges() {
        return ranges;
    }

    public void setRanges(final List<PodSecurityPolicySpecSupplementalGroupsRanges> ranges) {
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
        if (!(__other instanceof PodSecurityPolicySpecSupplementalGroups)) {
            return false;
        }
        final PodSecurityPolicySpecSupplementalGroups __otherCasted = (PodSecurityPolicySpecSupplementalGroups) __other;
        return Objects.equals(ranges, __otherCasted.ranges) &&
            Objects.equals(rule, __otherCasted.rule);
    }
}
