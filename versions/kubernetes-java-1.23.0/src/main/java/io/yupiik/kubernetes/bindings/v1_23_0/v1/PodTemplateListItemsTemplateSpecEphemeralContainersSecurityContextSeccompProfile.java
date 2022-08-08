package io.yupiik.kubernetes.bindings.v1_23_0.v1;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecEphemeralContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private PodTemplateListItemsTemplateSpecEphemeralContainersSecurityContextSeccompProfileType type;

    public PodTemplateListItemsTemplateSpecEphemeralContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecEphemeralContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                                                            final PodTemplateListItemsTemplateSpecEphemeralContainersSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public PodTemplateListItemsTemplateSpecEphemeralContainersSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final PodTemplateListItemsTemplateSpecEphemeralContainersSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecEphemeralContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecEphemeralContainersSecurityContextSeccompProfile __otherCasted = (PodTemplateListItemsTemplateSpecEphemeralContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
