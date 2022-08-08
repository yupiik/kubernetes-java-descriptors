package io.yupiik.kubernetes.bindings.v1_19_7;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private String type;

    public DaemonSetSpecTemplateSpecContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                                            final String type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
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
