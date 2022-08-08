package io.yupiik.kubernetes.bindings.v1_23_3.v1;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private ReplicaSetListItemsSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfileType type;

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                                                               final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfile __otherCasted = (ReplicaSetListItemsSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
