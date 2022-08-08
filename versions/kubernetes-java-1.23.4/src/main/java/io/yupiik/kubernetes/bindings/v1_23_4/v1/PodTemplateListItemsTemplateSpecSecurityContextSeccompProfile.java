package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecSecurityContextSeccompProfile {
    private String localhostProfile;
    private PodTemplateListItemsTemplateSpecSecurityContextSeccompProfileType type;

    public PodTemplateListItemsTemplateSpecSecurityContextSeccompProfile() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecSecurityContextSeccompProfile(final String localhostProfile,
                                                                         final PodTemplateListItemsTemplateSpecSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public PodTemplateListItemsTemplateSpecSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final PodTemplateListItemsTemplateSpecSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecSecurityContextSeccompProfile)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecSecurityContextSeccompProfile __otherCasted = (PodTemplateListItemsTemplateSpecSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
