package io.yupiik.kubernetes.bindings.v1_23_2.v1;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecInitContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private ReplicaSetSpecTemplateSpecInitContainersSecurityContextSeccompProfileType type;

    public ReplicaSetSpecTemplateSpecInitContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecInitContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                                                 final ReplicaSetSpecTemplateSpecInitContainersSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public ReplicaSetSpecTemplateSpecInitContainersSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final ReplicaSetSpecTemplateSpecInitContainersSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecInitContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecInitContainersSecurityContextSeccompProfile __otherCasted = (ReplicaSetSpecTemplateSpecInitContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
