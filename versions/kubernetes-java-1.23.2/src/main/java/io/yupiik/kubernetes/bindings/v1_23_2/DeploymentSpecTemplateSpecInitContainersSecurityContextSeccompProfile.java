package io.yupiik.kubernetes.bindings.v1_23_2;

import java.util.Objects;

public class DeploymentSpecTemplateSpecInitContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private DeploymentSpecTemplateSpecInitContainersSecurityContextSeccompProfileType type;

    public DeploymentSpecTemplateSpecInitContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public DeploymentSpecTemplateSpecInitContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                                                 final DeploymentSpecTemplateSpecInitContainersSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public DeploymentSpecTemplateSpecInitContainersSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final DeploymentSpecTemplateSpecInitContainersSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecInitContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final DeploymentSpecTemplateSpecInitContainersSecurityContextSeccompProfile __otherCasted = (DeploymentSpecTemplateSpecInitContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
