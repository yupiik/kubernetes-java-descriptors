package io.yupiik.kubernetes.bindings.v1_18_15.v1;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecVolumesCinderSecretRef {
    private String name;

    public ReplicationControllerSpecTemplateSpecVolumesCinderSecretRef() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecVolumesCinderSecretRef(final String name) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecVolumesCinderSecretRef)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecVolumesCinderSecretRef __otherCasted = (ReplicationControllerSpecTemplateSpecVolumesCinderSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
