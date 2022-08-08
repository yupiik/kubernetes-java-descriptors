package io.yupiik.kubernetes.bindings.v1_23_2;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private JobListItemsSpecTemplateSpecContainersSecurityContextSeccompProfileType type;

    public JobListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                                               final JobListItemsSpecTemplateSpecContainersSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public JobListItemsSpecTemplateSpecContainersSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final JobListItemsSpecTemplateSpecContainersSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile __otherCasted = (JobListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
