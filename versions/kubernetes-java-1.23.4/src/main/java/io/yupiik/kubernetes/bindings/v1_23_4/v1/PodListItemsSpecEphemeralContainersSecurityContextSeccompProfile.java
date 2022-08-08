package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import java.util.Objects;

public class PodListItemsSpecEphemeralContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private PodListItemsSpecEphemeralContainersSecurityContextSeccompProfileType type;

    public PodListItemsSpecEphemeralContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public PodListItemsSpecEphemeralContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                                            final PodListItemsSpecEphemeralContainersSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public PodListItemsSpecEphemeralContainersSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final PodListItemsSpecEphemeralContainersSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof PodListItemsSpecEphemeralContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final PodListItemsSpecEphemeralContainersSecurityContextSeccompProfile __otherCasted = (PodListItemsSpecEphemeralContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
