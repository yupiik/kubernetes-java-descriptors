package io.yupiik.kubernetes.bindings.v1_23_0;

import java.util.Objects;

public class DeploymentSpecTemplateSpecSecurityContextSeccompProfile {
    private String localhostProfile;
    private DeploymentSpecTemplateSpecSecurityContextSeccompProfileType type;

    public DeploymentSpecTemplateSpecSecurityContextSeccompProfile() {
        // no-op
    }

    public DeploymentSpecTemplateSpecSecurityContextSeccompProfile(final String localhostProfile,
                                                                   final DeploymentSpecTemplateSpecSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public DeploymentSpecTemplateSpecSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final DeploymentSpecTemplateSpecSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecSecurityContextSeccompProfile)) {
            return false;
        }
        final DeploymentSpecTemplateSpecSecurityContextSeccompProfile __otherCasted = (DeploymentSpecTemplateSpecSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
