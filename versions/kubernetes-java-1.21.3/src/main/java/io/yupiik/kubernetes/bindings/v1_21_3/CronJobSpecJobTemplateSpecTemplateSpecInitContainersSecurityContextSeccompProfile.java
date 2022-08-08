package io.yupiik.kubernetes.bindings.v1_21_3;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecInitContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private String type;

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                                                             final String type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecInitContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecInitContainersSecurityContextSeccompProfile __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecInitContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
