package io.yupiik.kubernetes.bindings.v1_19_3;

import java.util.Objects;

public class PodSecurityPolicySpecAllowedFlexVolumes {
    private String driver;

    public PodSecurityPolicySpecAllowedFlexVolumes() {
        // no-op
    }

    public PodSecurityPolicySpecAllowedFlexVolumes(final String driver) {
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
        if (!(__other instanceof PodSecurityPolicySpecAllowedFlexVolumes)) {
            return false;
        }
        final PodSecurityPolicySpecAllowedFlexVolumes __otherCasted = (PodSecurityPolicySpecAllowedFlexVolumes) __other;
        return Objects.equals(driver, __otherCasted.driver);
    }
}
