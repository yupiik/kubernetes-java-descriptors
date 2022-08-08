package io.yupiik.kubernetes.bindings.v1_15_7.v1beta2;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecVolumesCephfsSecretRef {
    private String name;

    public ReplicaSetListItemsSpecTemplateSpecVolumesCephfsSecretRef() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesCephfsSecretRef(final String name) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecVolumesCephfsSecretRef)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecVolumesCephfsSecretRef __otherCasted = (ReplicaSetListItemsSpecTemplateSpecVolumesCephfsSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
