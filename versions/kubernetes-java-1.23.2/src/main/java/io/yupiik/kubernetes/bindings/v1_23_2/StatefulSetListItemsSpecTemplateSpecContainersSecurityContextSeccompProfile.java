package io.yupiik.kubernetes.bindings.v1_23_2;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private StatefulSetListItemsSpecTemplateSpecContainersSecurityContextSeccompProfileType type;

    public StatefulSetListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                                                       final StatefulSetListItemsSpecTemplateSpecContainersSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public StatefulSetListItemsSpecTemplateSpecContainersSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final StatefulSetListItemsSpecTemplateSpecContainersSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile __otherCasted = (StatefulSetListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
