package io.yupiik.kubernetes.bindings.v1_23_1.v1;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecSecurityContextSeccompProfile {
    private String localhostProfile;
    private StatefulSetListItemsSpecTemplateSpecSecurityContextSeccompProfileType type;

    public StatefulSetListItemsSpecTemplateSpecSecurityContextSeccompProfile() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecSecurityContextSeccompProfile(final String localhostProfile,
                                                                             final StatefulSetListItemsSpecTemplateSpecSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public StatefulSetListItemsSpecTemplateSpecSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final StatefulSetListItemsSpecTemplateSpecSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecSecurityContextSeccompProfile)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecSecurityContextSeccompProfile __otherCasted = (StatefulSetListItemsSpecTemplateSpecSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
