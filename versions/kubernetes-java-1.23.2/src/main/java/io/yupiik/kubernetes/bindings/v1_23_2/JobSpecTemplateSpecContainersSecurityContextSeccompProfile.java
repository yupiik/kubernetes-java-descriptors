package io.yupiik.kubernetes.bindings.v1_23_2;

import java.util.Objects;

public class JobSpecTemplateSpecContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private JobSpecTemplateSpecContainersSecurityContextSeccompProfileType type;

    public JobSpecTemplateSpecContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public JobSpecTemplateSpecContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                                      final JobSpecTemplateSpecContainersSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public JobSpecTemplateSpecContainersSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final JobSpecTemplateSpecContainersSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof JobSpecTemplateSpecContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final JobSpecTemplateSpecContainersSecurityContextSeccompProfile __otherCasted = (JobSpecTemplateSpecContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
