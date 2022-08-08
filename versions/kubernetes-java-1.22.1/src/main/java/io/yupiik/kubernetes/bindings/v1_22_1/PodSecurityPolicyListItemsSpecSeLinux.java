package io.yupiik.kubernetes.bindings.v1_22_1;

import java.util.Objects;

public class PodSecurityPolicyListItemsSpecSeLinux {
    private String rule;
    private PodSecurityPolicyListItemsSpecSeLinuxSeLinuxOptions seLinuxOptions;

    public PodSecurityPolicyListItemsSpecSeLinux() {
        // no-op
    }

    public PodSecurityPolicyListItemsSpecSeLinux(final String rule,
                                                 final PodSecurityPolicyListItemsSpecSeLinuxSeLinuxOptions seLinuxOptions) {
        // no-op
    }

    public String getRule() {
        return rule;
    }

    public void setRule(final String rule) {
        this.rule = rule;
    }

    public PodSecurityPolicyListItemsSpecSeLinuxSeLinuxOptions getSeLinuxOptions() {
        return seLinuxOptions;
    }

    public void setSeLinuxOptions(final PodSecurityPolicyListItemsSpecSeLinuxSeLinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                rule,
                seLinuxOptions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodSecurityPolicyListItemsSpecSeLinux)) {
            return false;
        }
        final PodSecurityPolicyListItemsSpecSeLinux __otherCasted = (PodSecurityPolicyListItemsSpecSeLinux) __other;
        return Objects.equals(rule, __otherCasted.rule) &&
            Objects.equals(seLinuxOptions, __otherCasted.seLinuxOptions);
    }
}
