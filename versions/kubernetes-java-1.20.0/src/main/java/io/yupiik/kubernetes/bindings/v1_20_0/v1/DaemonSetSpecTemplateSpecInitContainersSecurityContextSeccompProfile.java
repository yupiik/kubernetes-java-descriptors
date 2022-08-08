package io.yupiik.kubernetes.bindings.v1_20_0.v1;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecInitContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private String type;

    public DaemonSetSpecTemplateSpecInitContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecInitContainersSecurityContextSeccompProfile(final String localhostProfile,
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecInitContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecInitContainersSecurityContextSeccompProfile __otherCasted = (DaemonSetSpecTemplateSpecInitContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
