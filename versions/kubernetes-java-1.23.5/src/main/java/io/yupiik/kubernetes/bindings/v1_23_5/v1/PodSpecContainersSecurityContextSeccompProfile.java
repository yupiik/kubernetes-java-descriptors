package io.yupiik.kubernetes.bindings.v1_23_5.v1;

import java.util.Objects;

public class PodSpecContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private PodSpecContainersSecurityContextSeccompProfileType type;

    public PodSpecContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public PodSpecContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                          final PodSpecContainersSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public PodSpecContainersSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final PodSpecContainersSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof PodSpecContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final PodSpecContainersSecurityContextSeccompProfile __otherCasted = (PodSpecContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
