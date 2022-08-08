package io.yupiik.kubernetes.bindings.v1_23_3;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecInitContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private PodTemplateListItemsTemplateSpecInitContainersSecurityContextSeccompProfileType type;

    public PodTemplateListItemsTemplateSpecInitContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecInitContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                                                       final PodTemplateListItemsTemplateSpecInitContainersSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public PodTemplateListItemsTemplateSpecInitContainersSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final PodTemplateListItemsTemplateSpecInitContainersSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecInitContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecInitContainersSecurityContextSeccompProfile __otherCasted = (PodTemplateListItemsTemplateSpecInitContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
