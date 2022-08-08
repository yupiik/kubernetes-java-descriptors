package io.yupiik.kubernetes.bindings.v1_23_1;

import java.util.Objects;

public class PodTemplateTemplateSpecInitContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private PodTemplateTemplateSpecInitContainersSecurityContextSeccompProfileType type;

    public PodTemplateTemplateSpecInitContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public PodTemplateTemplateSpecInitContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                                              final PodTemplateTemplateSpecInitContainersSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public PodTemplateTemplateSpecInitContainersSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final PodTemplateTemplateSpecInitContainersSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof PodTemplateTemplateSpecInitContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final PodTemplateTemplateSpecInitContainersSecurityContextSeccompProfile __otherCasted = (PodTemplateTemplateSpecInitContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
