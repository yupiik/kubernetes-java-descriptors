package io.yupiik.kubernetes.bindings.v1_23_0;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecSecurityContextSeccompProfile {
    private String localhostProfile;
    private ReplicaSetListItemsSpecTemplateSpecSecurityContextSeccompProfileType type;

    public ReplicaSetListItemsSpecTemplateSpecSecurityContextSeccompProfile() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecSecurityContextSeccompProfile(final String localhostProfile,
                                                                            final ReplicaSetListItemsSpecTemplateSpecSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public ReplicaSetListItemsSpecTemplateSpecSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final ReplicaSetListItemsSpecTemplateSpecSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecSecurityContextSeccompProfile)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecSecurityContextSeccompProfile __otherCasted = (ReplicaSetListItemsSpecTemplateSpecSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
