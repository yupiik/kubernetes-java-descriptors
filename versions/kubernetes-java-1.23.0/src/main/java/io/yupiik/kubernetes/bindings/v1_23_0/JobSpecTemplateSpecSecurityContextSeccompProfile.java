package io.yupiik.kubernetes.bindings.v1_23_0;

import java.util.Objects;

public class JobSpecTemplateSpecSecurityContextSeccompProfile {
    private String localhostProfile;
    private JobSpecTemplateSpecSecurityContextSeccompProfileType type;

    public JobSpecTemplateSpecSecurityContextSeccompProfile() {
        // no-op
    }

    public JobSpecTemplateSpecSecurityContextSeccompProfile(final String localhostProfile,
                                                            final JobSpecTemplateSpecSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public JobSpecTemplateSpecSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final JobSpecTemplateSpecSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof JobSpecTemplateSpecSecurityContextSeccompProfile)) {
            return false;
        }
        final JobSpecTemplateSpecSecurityContextSeccompProfile __otherCasted = (JobSpecTemplateSpecSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
