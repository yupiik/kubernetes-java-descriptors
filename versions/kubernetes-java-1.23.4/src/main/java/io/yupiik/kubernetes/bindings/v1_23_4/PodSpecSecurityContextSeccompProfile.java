package io.yupiik.kubernetes.bindings.v1_23_4;

import java.util.Objects;

public class PodSpecSecurityContextSeccompProfile {
    private String localhostProfile;
    private PodSpecSecurityContextSeccompProfileType type;

    public PodSpecSecurityContextSeccompProfile() {
        // no-op
    }

    public PodSpecSecurityContextSeccompProfile(final String localhostProfile,
                                                final PodSpecSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public PodSpecSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final PodSpecSecurityContextSeccompProfileType type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                localhostProfile,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodSpecSecurityContextSeccompProfile)) {
            return false;
        }
        final PodSpecSecurityContextSeccompProfile __otherCasted = (PodSpecSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
