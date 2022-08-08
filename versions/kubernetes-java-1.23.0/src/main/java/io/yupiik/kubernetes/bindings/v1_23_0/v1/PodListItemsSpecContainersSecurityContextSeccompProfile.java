package io.yupiik.kubernetes.bindings.v1_23_0.v1;

import java.util.Objects;

public class PodListItemsSpecContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private PodListItemsSpecContainersSecurityContextSeccompProfileType type;

    public PodListItemsSpecContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public PodListItemsSpecContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                                   final PodListItemsSpecContainersSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public PodListItemsSpecContainersSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final PodListItemsSpecContainersSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof PodListItemsSpecContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final PodListItemsSpecContainersSecurityContextSeccompProfile __otherCasted = (PodListItemsSpecContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
