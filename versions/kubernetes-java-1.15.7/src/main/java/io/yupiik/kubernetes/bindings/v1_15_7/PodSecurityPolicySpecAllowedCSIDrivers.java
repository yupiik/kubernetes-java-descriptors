package io.yupiik.kubernetes.bindings.v1_15_7;

import java.util.Objects;

public class PodSecurityPolicySpecAllowedCSIDrivers {
    private String name;

    public PodSecurityPolicySpecAllowedCSIDrivers() {
        // no-op
    }

    public PodSecurityPolicySpecAllowedCSIDrivers(final String name) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodSecurityPolicySpecAllowedCSIDrivers)) {
            return false;
        }
        final PodSecurityPolicySpecAllowedCSIDrivers __otherCasted = (PodSecurityPolicySpecAllowedCSIDrivers) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
