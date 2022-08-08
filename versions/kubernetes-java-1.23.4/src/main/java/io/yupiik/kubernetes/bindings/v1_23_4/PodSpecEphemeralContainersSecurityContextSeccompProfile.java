package io.yupiik.kubernetes.bindings.v1_23_4;

import java.util.Objects;

public class PodSpecEphemeralContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private PodSpecEphemeralContainersSecurityContextSeccompProfileType type;

    public PodSpecEphemeralContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public PodSpecEphemeralContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                                   final PodSpecEphemeralContainersSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public PodSpecEphemeralContainersSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final PodSpecEphemeralContainersSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof PodSpecEphemeralContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final PodSpecEphemeralContainersSecurityContextSeccompProfile __otherCasted = (PodSpecEphemeralContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
