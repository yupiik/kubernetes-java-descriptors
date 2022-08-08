package io.yupiik.kubernetes.bindings.v1_14_9.v1;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecVolumesStorageosSecretRef {
    private String name;

    public ReplicaSetListItemsSpecTemplateSpecVolumesStorageosSecretRef() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesStorageosSecretRef(final String name) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecVolumesStorageosSecretRef)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecVolumesStorageosSecretRef __otherCasted = (ReplicaSetListItemsSpecTemplateSpecVolumesStorageosSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
