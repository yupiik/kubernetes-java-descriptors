package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecInitContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private DaemonSetListItemsSpecTemplateSpecInitContainersSecurityContextSeccompProfileType type;

    public DaemonSetListItemsSpecTemplateSpecInitContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                                                         final DaemonSetListItemsSpecTemplateSpecInitContainersSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final DaemonSetListItemsSpecTemplateSpecInitContainersSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecInitContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecInitContainersSecurityContextSeccompProfile __otherCasted = (DaemonSetListItemsSpecTemplateSpecInitContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
