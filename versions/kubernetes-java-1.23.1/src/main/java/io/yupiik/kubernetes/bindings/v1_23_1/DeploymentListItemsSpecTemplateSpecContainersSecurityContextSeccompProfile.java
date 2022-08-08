package io.yupiik.kubernetes.bindings.v1_23_1;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private DeploymentListItemsSpecTemplateSpecContainersSecurityContextSeccompProfileType type;

    public DeploymentListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                                                      final DeploymentListItemsSpecTemplateSpecContainersSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public DeploymentListItemsSpecTemplateSpecContainersSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final DeploymentListItemsSpecTemplateSpecContainersSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile __otherCasted = (DeploymentListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
