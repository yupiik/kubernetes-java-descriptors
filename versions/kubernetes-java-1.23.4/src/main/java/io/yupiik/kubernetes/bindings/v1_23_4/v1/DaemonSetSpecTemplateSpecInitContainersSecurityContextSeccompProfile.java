package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecInitContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private DaemonSetSpecTemplateSpecInitContainersSecurityContextSeccompProfileType type;

    public DaemonSetSpecTemplateSpecInitContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecInitContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                                                final DaemonSetSpecTemplateSpecInitContainersSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public DaemonSetSpecTemplateSpecInitContainersSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final DaemonSetSpecTemplateSpecInitContainersSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecInitContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecInitContainersSecurityContextSeccompProfile __otherCasted = (DaemonSetSpecTemplateSpecInitContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
