package io.yupiik.kubernetes.bindings.v1_12_5.v1beta1;

import java.util.Objects;

public class PodSecurityPolicySpecSeLinux {
    private String rule;
    private PodSecurityPolicySpecSeLinuxSeLinuxOptions seLinuxOptions;

    public PodSecurityPolicySpecSeLinux() {
        // no-op
    }

    public PodSecurityPolicySpecSeLinux(final String rule,
                                        final PodSecurityPolicySpecSeLinuxSeLinuxOptions seLinuxOptions) {
        // no-op
    }

    public String getRule() {
        return rule;
    }

    public void setRule(final String rule) {
        this.rule = rule;
    }

    public PodSecurityPolicySpecSeLinuxSeLinuxOptions getSeLinuxOptions() {
        return seLinuxOptions;
    }

    public void setSeLinuxOptions(final PodSecurityPolicySpecSeLinuxSeLinuxOptions seLinuxOptions) {
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
        if (!(__other instanceof PodSecurityPolicySpecSeLinux)) {
            return false;
        }
        final PodSecurityPolicySpecSeLinux __otherCasted = (PodSecurityPolicySpecSeLinux) __other;
        return Objects.equals(rule, __otherCasted.rule) &&
            Objects.equals(seLinuxOptions, __otherCasted.seLinuxOptions);
    }
}
