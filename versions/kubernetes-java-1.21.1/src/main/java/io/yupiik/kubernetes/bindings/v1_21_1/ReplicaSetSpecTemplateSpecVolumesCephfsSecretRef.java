package io.yupiik.kubernetes.bindings.v1_21_1;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecVolumesCephfsSecretRef {
    private String name;

    public ReplicaSetSpecTemplateSpecVolumesCephfsSecretRef() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecVolumesCephfsSecretRef(final String name) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecVolumesCephfsSecretRef)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecVolumesCephfsSecretRef __otherCasted = (ReplicaSetSpecTemplateSpecVolumesCephfsSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
