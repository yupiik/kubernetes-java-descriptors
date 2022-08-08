package io.yupiik.kubernetes.bindings.v1_20_10;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecVolumesCephfsSecretRef {
    private String name;

    public ReplicationControllerSpecTemplateSpecVolumesCephfsSecretRef() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecVolumesCephfsSecretRef(final String name) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecVolumesCephfsSecretRef)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecVolumesCephfsSecretRef __otherCasted = (ReplicationControllerSpecTemplateSpecVolumesCephfsSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
