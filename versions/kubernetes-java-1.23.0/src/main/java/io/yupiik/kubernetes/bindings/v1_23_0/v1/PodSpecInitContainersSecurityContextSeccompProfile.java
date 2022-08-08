package io.yupiik.kubernetes.bindings.v1_23_0.v1;

import java.util.Objects;

public class PodSpecInitContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private PodSpecInitContainersSecurityContextSeccompProfileType type;

    public PodSpecInitContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public PodSpecInitContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                              final PodSpecInitContainersSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public PodSpecInitContainersSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final PodSpecInitContainersSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof PodSpecInitContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final PodSpecInitContainersSecurityContextSeccompProfile __otherCasted = (PodSpecInitContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
