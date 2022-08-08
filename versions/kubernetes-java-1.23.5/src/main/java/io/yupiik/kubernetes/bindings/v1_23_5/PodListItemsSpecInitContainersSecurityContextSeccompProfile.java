package io.yupiik.kubernetes.bindings.v1_23_5;

import java.util.Objects;

public class PodListItemsSpecInitContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private PodListItemsSpecInitContainersSecurityContextSeccompProfileType type;

    public PodListItemsSpecInitContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public PodListItemsSpecInitContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                                       final PodListItemsSpecInitContainersSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public PodListItemsSpecInitContainersSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final PodListItemsSpecInitContainersSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof PodListItemsSpecInitContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final PodListItemsSpecInitContainersSecurityContextSeccompProfile __otherCasted = (PodListItemsSpecInitContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
