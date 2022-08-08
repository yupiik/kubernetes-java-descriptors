package io.yupiik.kubernetes.bindings.v1_23_3.v1;

import java.util.Objects;

public class PodTemplateTemplateSpecSecurityContextSeccompProfile {
    private String localhostProfile;
    private PodTemplateTemplateSpecSecurityContextSeccompProfileType type;

    public PodTemplateTemplateSpecSecurityContextSeccompProfile() {
        // no-op
    }

    public PodTemplateTemplateSpecSecurityContextSeccompProfile(final String localhostProfile,
                                                                final PodTemplateTemplateSpecSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public PodTemplateTemplateSpecSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final PodTemplateTemplateSpecSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof PodTemplateTemplateSpecSecurityContextSeccompProfile)) {
            return false;
        }
        final PodTemplateTemplateSpecSecurityContextSeccompProfile __otherCasted = (PodTemplateTemplateSpecSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
