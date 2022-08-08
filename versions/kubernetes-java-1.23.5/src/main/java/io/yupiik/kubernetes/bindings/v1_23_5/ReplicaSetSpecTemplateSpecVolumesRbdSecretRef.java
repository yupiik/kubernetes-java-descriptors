package io.yupiik.kubernetes.bindings.v1_23_5;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecVolumesRbdSecretRef {
    private String name;

    public ReplicaSetSpecTemplateSpecVolumesRbdSecretRef() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecVolumesRbdSecretRef(final String name) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecVolumesRbdSecretRef)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecVolumesRbdSecretRef __otherCasted = (ReplicaSetSpecTemplateSpecVolumesRbdSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
