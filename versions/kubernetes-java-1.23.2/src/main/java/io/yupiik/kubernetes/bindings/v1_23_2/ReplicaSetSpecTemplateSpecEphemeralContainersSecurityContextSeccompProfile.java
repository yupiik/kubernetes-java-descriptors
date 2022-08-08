package io.yupiik.kubernetes.bindings.v1_23_2;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private ReplicaSetSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfileType type;

    public ReplicaSetSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                                                      final ReplicaSetSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public ReplicaSetSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final ReplicaSetSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfile __otherCasted = (ReplicaSetSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
