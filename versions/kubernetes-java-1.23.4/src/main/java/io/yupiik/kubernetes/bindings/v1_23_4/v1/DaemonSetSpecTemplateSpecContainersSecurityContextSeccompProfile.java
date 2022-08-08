package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private DaemonSetSpecTemplateSpecContainersSecurityContextSeccompProfileType type;

    public DaemonSetSpecTemplateSpecContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                                            final DaemonSetSpecTemplateSpecContainersSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public DaemonSetSpecTemplateSpecContainersSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final DaemonSetSpecTemplateSpecContainersSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecContainersSecurityContextSeccompProfile __otherCasted = (DaemonSetSpecTemplateSpecContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
