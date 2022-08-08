package io.yupiik.kubernetes.bindings.v1_23_1;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private ReplicaSetListItemsSpecTemplateSpecContainersSecurityContextSeccompProfileType type;

    public ReplicaSetListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                                                      final ReplicaSetListItemsSpecTemplateSpecContainersSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public ReplicaSetListItemsSpecTemplateSpecContainersSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final ReplicaSetListItemsSpecTemplateSpecContainersSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile __otherCasted = (ReplicaSetListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
