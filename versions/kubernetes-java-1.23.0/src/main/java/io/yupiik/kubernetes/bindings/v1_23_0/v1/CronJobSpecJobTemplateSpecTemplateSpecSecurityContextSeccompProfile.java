package io.yupiik.kubernetes.bindings.v1_23_0.v1;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecSecurityContextSeccompProfile {
    private String localhostProfile;
    private CronJobSpecJobTemplateSpecTemplateSpecSecurityContextSeccompProfileType type;

    public CronJobSpecJobTemplateSpecTemplateSpecSecurityContextSeccompProfile() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecSecurityContextSeccompProfile(final String localhostProfile,
                                                                               final CronJobSpecJobTemplateSpecTemplateSpecSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final CronJobSpecJobTemplateSpecTemplateSpecSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecSecurityContextSeccompProfile)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecSecurityContextSeccompProfile __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
