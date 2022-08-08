package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private PodTemplateListItemsTemplateSpecContainersSecurityContextSeccompProfileType type;

    public PodTemplateListItemsTemplateSpecContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                                                   final PodTemplateListItemsTemplateSpecContainersSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public PodTemplateListItemsTemplateSpecContainersSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final PodTemplateListItemsTemplateSpecContainersSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecContainersSecurityContextSeccompProfile __otherCasted = (PodTemplateListItemsTemplateSpecContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
