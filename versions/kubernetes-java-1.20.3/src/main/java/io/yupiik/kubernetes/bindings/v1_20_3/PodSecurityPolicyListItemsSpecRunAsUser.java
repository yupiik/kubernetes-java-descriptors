package io.yupiik.kubernetes.bindings.v1_20_3;

import java.util.List;
import java.util.Objects;

public class PodSecurityPolicyListItemsSpecRunAsUser {
    private List<PodSecurityPolicyListItemsSpecRunAsUserRanges> ranges;
    private String rule;

    public PodSecurityPolicyListItemsSpecRunAsUser() {
        // no-op
    }

    public PodSecurityPolicyListItemsSpecRunAsUser(final List<PodSecurityPolicyListItemsSpecRunAsUserRanges> ranges,
                                                   final String rule) {
        // no-op
    }

    public List<PodSecurityPolicyListItemsSpecRunAsUserRanges> getRanges() {
        return ranges;
    }

    public void setRanges(final List<PodSecurityPolicyListItemsSpecRunAsUserRanges> ranges) {
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
        if (!(__other instanceof PodSecurityPolicyListItemsSpecRunAsUser)) {
            return false;
        }
        final PodSecurityPolicyListItemsSpecRunAsUser __otherCasted = (PodSecurityPolicyListItemsSpecRunAsUser) __other;
        return Objects.equals(ranges, __otherCasted.ranges) &&
            Objects.equals(rule, __otherCasted.rule);
    }
}
