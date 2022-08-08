package io.yupiik.kubernetes.bindings.v1_14_4.v1beta1;

import java.util.Objects;

public class PodSecurityPolicyListItemsSpecAllowedCSIDrivers {
    private String name;

    public PodSecurityPolicyListItemsSpecAllowedCSIDrivers() {
        // no-op
    }

    public PodSecurityPolicyListItemsSpecAllowedCSIDrivers(final String name) {
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
        if (!(__other instanceof PodSecurityPolicyListItemsSpecAllowedCSIDrivers)) {
            return false;
        }
        final PodSecurityPolicyListItemsSpecAllowedCSIDrivers __otherCasted = (PodSecurityPolicyListItemsSpecAllowedCSIDrivers) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
