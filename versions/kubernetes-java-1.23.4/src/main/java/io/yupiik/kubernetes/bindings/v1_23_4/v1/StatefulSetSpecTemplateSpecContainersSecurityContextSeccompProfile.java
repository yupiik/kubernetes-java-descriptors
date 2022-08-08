package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private StatefulSetSpecTemplateSpecContainersSecurityContextSeccompProfileType type;

    public StatefulSetSpecTemplateSpecContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                                              final StatefulSetSpecTemplateSpecContainersSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public StatefulSetSpecTemplateSpecContainersSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final StatefulSetSpecTemplateSpecContainersSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecContainersSecurityContextSeccompProfile __otherCasted = (StatefulSetSpecTemplateSpecContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
