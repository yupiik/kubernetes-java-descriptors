package io.yupiik.kubernetes.bindings.v1_23_3.v1;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecSecurityContextSeccompProfile {
    private String localhostProfile;
    private StatefulSetSpecTemplateSpecSecurityContextSeccompProfileType type;

    public StatefulSetSpecTemplateSpecSecurityContextSeccompProfile() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecSecurityContextSeccompProfile(final String localhostProfile,
                                                                    final StatefulSetSpecTemplateSpecSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public StatefulSetSpecTemplateSpecSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final StatefulSetSpecTemplateSpecSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecSecurityContextSeccompProfile)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecSecurityContextSeccompProfile __otherCasted = (StatefulSetSpecTemplateSpecSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
