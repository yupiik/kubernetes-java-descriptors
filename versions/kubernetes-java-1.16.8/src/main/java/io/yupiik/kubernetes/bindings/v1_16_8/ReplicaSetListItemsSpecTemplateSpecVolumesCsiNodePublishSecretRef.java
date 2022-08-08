package io.yupiik.kubernetes.bindings.v1_16_8;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecVolumesCsiNodePublishSecretRef {
    private String name;

    public ReplicaSetListItemsSpecTemplateSpecVolumesCsiNodePublishSecretRef() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesCsiNodePublishSecretRef(final String name) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecVolumesCsiNodePublishSecretRef)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecVolumesCsiNodePublishSecretRef __otherCasted = (ReplicaSetListItemsSpecTemplateSpecVolumesCsiNodePublishSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
