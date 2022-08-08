package io.yupiik.kubernetes.bindings.v1_23_3.v1;

import java.util.Objects;

public class PodTemplateTemplateSpecContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private PodTemplateTemplateSpecContainersSecurityContextSeccompProfileType type;

    public PodTemplateTemplateSpecContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public PodTemplateTemplateSpecContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                                          final PodTemplateTemplateSpecContainersSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public PodTemplateTemplateSpecContainersSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final PodTemplateTemplateSpecContainersSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof PodTemplateTemplateSpecContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final PodTemplateTemplateSpecContainersSecurityContextSeccompProfile __otherCasted = (PodTemplateTemplateSpecContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
