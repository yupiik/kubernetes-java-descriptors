package io.yupiik.kubernetes.bindings.v1_23_1.v1;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersSecurityContextSeccompProfileType type;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                                                                      final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersSecurityContextSeccompProfile __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
