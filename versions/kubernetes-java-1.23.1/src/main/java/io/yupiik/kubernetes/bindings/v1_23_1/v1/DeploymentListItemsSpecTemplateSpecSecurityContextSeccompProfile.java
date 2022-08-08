package io.yupiik.kubernetes.bindings.v1_23_1.v1;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecSecurityContextSeccompProfile {
    private String localhostProfile;
    private DeploymentListItemsSpecTemplateSpecSecurityContextSeccompProfileType type;

    public DeploymentListItemsSpecTemplateSpecSecurityContextSeccompProfile() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecSecurityContextSeccompProfile(final String localhostProfile,
                                                                            final DeploymentListItemsSpecTemplateSpecSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public DeploymentListItemsSpecTemplateSpecSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final DeploymentListItemsSpecTemplateSpecSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecSecurityContextSeccompProfile)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecSecurityContextSeccompProfile __otherCasted = (DeploymentListItemsSpecTemplateSpecSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
