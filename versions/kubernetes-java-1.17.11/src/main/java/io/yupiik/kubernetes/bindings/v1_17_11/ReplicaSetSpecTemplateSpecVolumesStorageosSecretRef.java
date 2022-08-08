package io.yupiik.kubernetes.bindings.v1_17_11;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecVolumesStorageosSecretRef {
    private String name;

    public ReplicaSetSpecTemplateSpecVolumesStorageosSecretRef() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecVolumesStorageosSecretRef(final String name) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecVolumesStorageosSecretRef)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecVolumesStorageosSecretRef __otherCasted = (ReplicaSetSpecTemplateSpecVolumesStorageosSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
