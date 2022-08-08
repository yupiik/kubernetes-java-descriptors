package io.yupiik.kubernetes.bindings.v1_17_9;

import java.util.List;
import java.util.Objects;

public class PodSecurityPolicySpecRunAsGroup {
    private List<PodSecurityPolicySpecRunAsGroupRanges> ranges;
    private String rule;

    public PodSecurityPolicySpecRunAsGroup() {
        // no-op
    }

    public PodSecurityPolicySpecRunAsGroup(final List<PodSecurityPolicySpecRunAsGroupRanges> ranges,
                                           final String rule) {
        // no-op
    }

    public List<PodSecurityPolicySpecRunAsGroupRanges> getRanges() {
        return ranges;
    }

    public void setRanges(final List<PodSecurityPolicySpecRunAsGroupRanges> ranges) {
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
        if (!(__other instanceof PodSecurityPolicySpecRunAsGroup)) {
            return false;
        }
        final PodSecurityPolicySpecRunAsGroup __otherCasted = (PodSecurityPolicySpecRunAsGroup) __other;
        return Objects.equals(ranges, __otherCasted.ranges) &&
            Objects.equals(rule, __otherCasted.rule);
    }
}
