package io.yupiik.kubernetes.bindings.v1_23_2.v1;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecSecurityContextSeccompProfile {
    private String localhostProfile;
    private DaemonSetSpecTemplateSpecSecurityContextSeccompProfileType type;

    public DaemonSetSpecTemplateSpecSecurityContextSeccompProfile() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecSecurityContextSeccompProfile(final String localhostProfile,
                                                                  final DaemonSetSpecTemplateSpecSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public DaemonSetSpecTemplateSpecSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final DaemonSetSpecTemplateSpecSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecSecurityContextSeccompProfile)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecSecurityContextSeccompProfile __otherCasted = (DaemonSetSpecTemplateSpecSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
