package io.yupiik.kubernetes.bindings.v1_23_1;

import java.util.Objects;

public class JobSpecTemplateSpecInitContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private JobSpecTemplateSpecInitContainersSecurityContextSeccompProfileType type;

    public JobSpecTemplateSpecInitContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public JobSpecTemplateSpecInitContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                                          final JobSpecTemplateSpecInitContainersSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public JobSpecTemplateSpecInitContainersSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final JobSpecTemplateSpecInitContainersSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof JobSpecTemplateSpecInitContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final JobSpecTemplateSpecInitContainersSecurityContextSeccompProfile __otherCasted = (JobSpecTemplateSpecInitContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
