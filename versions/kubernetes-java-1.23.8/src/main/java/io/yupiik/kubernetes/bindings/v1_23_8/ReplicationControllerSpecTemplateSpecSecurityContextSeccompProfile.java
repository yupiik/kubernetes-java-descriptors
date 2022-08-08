package io.yupiik.kubernetes.bindings.v1_23_8;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecSecurityContextSeccompProfile {
    private String localhostProfile;
    private String type;

    public ReplicationControllerSpecTemplateSpecSecurityContextSeccompProfile() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecSecurityContextSeccompProfile(final String localhostProfile,
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecSecurityContextSeccompProfile)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecSecurityContextSeccompProfile __otherCasted = (ReplicationControllerSpecTemplateSpecSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
