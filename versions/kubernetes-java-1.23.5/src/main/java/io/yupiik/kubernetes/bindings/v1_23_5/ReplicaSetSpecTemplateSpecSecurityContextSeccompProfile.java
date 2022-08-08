package io.yupiik.kubernetes.bindings.v1_23_5;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecSecurityContextSeccompProfile {
    private String localhostProfile;
    private ReplicaSetSpecTemplateSpecSecurityContextSeccompProfileType type;

    public ReplicaSetSpecTemplateSpecSecurityContextSeccompProfile() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecSecurityContextSeccompProfile(final String localhostProfile,
                                                                   final ReplicaSetSpecTemplateSpecSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public ReplicaSetSpecTemplateSpecSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final ReplicaSetSpecTemplateSpecSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecSecurityContextSeccompProfile)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecSecurityContextSeccompProfile __otherCasted = (ReplicaSetSpecTemplateSpecSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
