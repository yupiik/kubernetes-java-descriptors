package io.yupiik.kubernetes.bindings.v1_23_4;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private ReplicaSetSpecTemplateSpecContainersSecurityContextSeccompProfileType type;

    public ReplicaSetSpecTemplateSpecContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                                             final ReplicaSetSpecTemplateSpecContainersSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public ReplicaSetSpecTemplateSpecContainersSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final ReplicaSetSpecTemplateSpecContainersSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecContainersSecurityContextSeccompProfile __otherCasted = (ReplicaSetSpecTemplateSpecContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
