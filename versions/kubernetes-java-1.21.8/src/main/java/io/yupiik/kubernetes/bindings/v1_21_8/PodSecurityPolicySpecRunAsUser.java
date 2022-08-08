package io.yupiik.kubernetes.bindings.v1_21_8;

import java.util.List;
import java.util.Objects;

public class PodSecurityPolicySpecRunAsUser {
    private List<PodSecurityPolicySpecRunAsUserRanges> ranges;
    private String rule;

    public PodSecurityPolicySpecRunAsUser() {
        // no-op
    }

    public PodSecurityPolicySpecRunAsUser(final List<PodSecurityPolicySpecRunAsUserRanges> ranges,
                                          final String rule) {
        // no-op
    }

    public List<PodSecurityPolicySpecRunAsUserRanges> getRanges() {
        return ranges;
    }

    public void setRanges(final List<PodSecurityPolicySpecRunAsUserRanges> ranges) {
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
        if (!(__other instanceof PodSecurityPolicySpecRunAsUser)) {
            return false;
        }
        final PodSecurityPolicySpecRunAsUser __otherCasted = (PodSecurityPolicySpecRunAsUser) __other;
        return Objects.equals(ranges, __otherCasted.ranges) &&
            Objects.equals(rule, __otherCasted.rule);
    }
}
