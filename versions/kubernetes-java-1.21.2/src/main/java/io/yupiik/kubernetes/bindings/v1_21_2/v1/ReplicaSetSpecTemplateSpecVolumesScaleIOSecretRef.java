package io.yupiik.kubernetes.bindings.v1_21_2.v1;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecVolumesScaleIOSecretRef {
    private String name;

    public ReplicaSetSpecTemplateSpecVolumesScaleIOSecretRef() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecVolumesScaleIOSecretRef(final String name) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecVolumesScaleIOSecretRef)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecVolumesScaleIOSecretRef __otherCasted = (ReplicaSetSpecTemplateSpecVolumesScaleIOSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
