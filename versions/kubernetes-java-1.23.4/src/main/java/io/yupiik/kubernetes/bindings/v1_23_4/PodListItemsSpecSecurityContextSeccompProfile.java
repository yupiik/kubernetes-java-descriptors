package io.yupiik.kubernetes.bindings.v1_23_4;

import java.util.Objects;

public class PodListItemsSpecSecurityContextSeccompProfile {
    private String localhostProfile;
    private PodListItemsSpecSecurityContextSeccompProfileType type;

    public PodListItemsSpecSecurityContextSeccompProfile() {
        // no-op
    }

    public PodListItemsSpecSecurityContextSeccompProfile(final String localhostProfile,
                                                         final PodListItemsSpecSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public PodListItemsSpecSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final PodListItemsSpecSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof PodListItemsSpecSecurityContextSeccompProfile)) {
            return false;
        }
        final PodListItemsSpecSecurityContextSeccompProfile __otherCasted = (PodListItemsSpecSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
