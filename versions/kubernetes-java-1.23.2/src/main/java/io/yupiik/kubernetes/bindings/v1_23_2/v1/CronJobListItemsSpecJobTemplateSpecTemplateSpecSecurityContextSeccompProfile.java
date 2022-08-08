package io.yupiik.kubernetes.bindings.v1_23_2.v1;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecSecurityContextSeccompProfile {
    private String localhostProfile;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecSecurityContextSeccompProfileType type;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecSecurityContextSeccompProfile() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecSecurityContextSeccompProfile(final String localhostProfile,
                                                                                        final CronJobListItemsSpecJobTemplateSpecTemplateSpecSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final CronJobListItemsSpecJobTemplateSpecTemplateSpecSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecSecurityContextSeccompProfile)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecSecurityContextSeccompProfile __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
