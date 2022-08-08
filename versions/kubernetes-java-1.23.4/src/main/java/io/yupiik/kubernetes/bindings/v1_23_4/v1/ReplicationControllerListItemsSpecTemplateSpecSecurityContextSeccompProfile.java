package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecSecurityContextSeccompProfile {
    private String localhostProfile;
    private ReplicationControllerListItemsSpecTemplateSpecSecurityContextSeccompProfileType type;

    public ReplicationControllerListItemsSpecTemplateSpecSecurityContextSeccompProfile() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecSecurityContextSeccompProfile(final String localhostProfile,
                                                                                       final ReplicationControllerListItemsSpecTemplateSpecSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public ReplicationControllerListItemsSpecTemplateSpecSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final ReplicationControllerListItemsSpecTemplateSpecSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecSecurityContextSeccompProfile)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecSecurityContextSeccompProfile __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
