package io.yupiik.kubernetes.bindings.v1_21_8.v1;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private String type;

    public DaemonSetListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                                                     final String type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile __otherCasted = (DaemonSetListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
