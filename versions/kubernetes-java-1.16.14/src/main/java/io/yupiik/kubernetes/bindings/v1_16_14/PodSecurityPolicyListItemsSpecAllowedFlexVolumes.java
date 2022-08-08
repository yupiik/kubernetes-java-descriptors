package io.yupiik.kubernetes.bindings.v1_16_14;

import java.util.Objects;

public class PodSecurityPolicyListItemsSpecAllowedFlexVolumes {
    private String driver;

    public PodSecurityPolicyListItemsSpecAllowedFlexVolumes() {
        // no-op
    }

    public PodSecurityPolicyListItemsSpecAllowedFlexVolumes(final String driver) {
        // no-op
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(final String driver) {
        this.driver = driver;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                driver);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodSecurityPolicyListItemsSpecAllowedFlexVolumes)) {
            return false;
        }
        final PodSecurityPolicyListItemsSpecAllowedFlexVolumes __otherCasted = (PodSecurityPolicyListItemsSpecAllowedFlexVolumes) __other;
        return Objects.equals(driver, __otherCasted.driver);
    }
}
