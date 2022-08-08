package io.yupiik.kubernetes.bindings.v1_16_4.v1;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecVolumesCinderSecretRef {
    private String name;

    public ReplicaSetListItemsSpecTemplateSpecVolumesCinderSecretRef() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesCinderSecretRef(final String name) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecVolumesCinderSecretRef)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecVolumesCinderSecretRef __otherCasted = (ReplicaSetListItemsSpecTemplateSpecVolumesCinderSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
