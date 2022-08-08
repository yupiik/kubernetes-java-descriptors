package io.yupiik.kubernetes.bindings.v1_23_3.v1;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private ReplicationControllerListItemsSpecTemplateSpecContainersSecurityContextSeccompProfileType type;

    public ReplicationControllerListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                                                                 final ReplicationControllerListItemsSpecTemplateSpecContainersSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public ReplicationControllerListItemsSpecTemplateSpecContainersSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final ReplicationControllerListItemsSpecTemplateSpecContainersSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
