package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecInitContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private StatefulSetSpecTemplateSpecInitContainersSecurityContextSeccompProfileType type;

    public StatefulSetSpecTemplateSpecInitContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecInitContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                                                  final StatefulSetSpecTemplateSpecInitContainersSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public StatefulSetSpecTemplateSpecInitContainersSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final StatefulSetSpecTemplateSpecInitContainersSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecInitContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecInitContainersSecurityContextSeccompProfile __otherCasted = (StatefulSetSpecTemplateSpecInitContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
