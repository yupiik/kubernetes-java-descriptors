package io.yupiik.kubernetes.bindings.v1_23_0.v1beta1;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersSecurityContextSeccompProfileType type;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersSecurityContextSeccompProfile __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
