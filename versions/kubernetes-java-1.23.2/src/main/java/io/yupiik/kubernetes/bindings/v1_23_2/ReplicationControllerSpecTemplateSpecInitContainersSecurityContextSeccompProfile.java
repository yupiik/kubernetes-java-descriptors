package io.yupiik.kubernetes.bindings.v1_23_2;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecInitContainersSecurityContextSeccompProfile {
    private String localhostProfile;
    private ReplicationControllerSpecTemplateSpecInitContainersSecurityContextSeccompProfileType type;

    public ReplicationControllerSpecTemplateSpecInitContainersSecurityContextSeccompProfile() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecInitContainersSecurityContextSeccompProfile(final String localhostProfile,
                                                                                            final ReplicationControllerSpecTemplateSpecInitContainersSecurityContextSeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public ReplicationControllerSpecTemplateSpecInitContainersSecurityContextSeccompProfileType getType() {
        return type;
    }

    public void setType(final ReplicationControllerSpecTemplateSpecInitContainersSecurityContextSeccompProfileType type) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecInitContainersSecurityContextSeccompProfile)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecInitContainersSecurityContextSeccompProfile __otherCasted = (ReplicationControllerSpecTemplateSpecInitContainersSecurityContextSeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }
}
