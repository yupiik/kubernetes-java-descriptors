package io.yupiik.kubernetes.bindings.v1_23_4;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private DeploymentListItemsSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfileType type;

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                                                               final DeploymentListItemsSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final DeploymentListItemsSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfile __otherCasted = (DeploymentListItemsSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
