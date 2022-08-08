package io.yupiik.kubernetes.bindings.v1_23_1.v1;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private DaemonSetSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfileType type;

    public DaemonSetSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                                                     final DaemonSetSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public DaemonSetSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final DaemonSetSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfile __otherCasted = (DaemonSetSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
