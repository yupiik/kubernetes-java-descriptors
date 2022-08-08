package io.yupiik.kubernetes.bindings.v1_23_2.v1;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private CronJobSpecJobTemplateSpecTemplateSpecContainersSecurityContextSeccompProfileType type;

    public CronJobSpecJobTemplateSpecTemplateSpecContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                                                         final CronJobSpecJobTemplateSpecTemplateSpecContainersSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecContainersSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final CronJobSpecJobTemplateSpecTemplateSpecContainersSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecContainersSecurityContextSeccompProfile __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
