package io.yupiik.kubernetes.bindings.v1_21_11;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecVolumesCinderSecretRef {
    private String name;

    public ReplicaSetSpecTemplateSpecVolumesCinderSecretRef() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecVolumesCinderSecretRef(final String name) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecVolumesCinderSecretRef)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecVolumesCinderSecretRef __otherCasted = (ReplicaSetSpecTemplateSpecVolumesCinderSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
