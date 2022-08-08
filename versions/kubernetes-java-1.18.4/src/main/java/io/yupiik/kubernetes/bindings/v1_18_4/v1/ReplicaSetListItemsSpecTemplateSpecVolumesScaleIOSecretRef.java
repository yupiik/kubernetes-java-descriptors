package io.yupiik.kubernetes.bindings.v1_18_4.v1;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecVolumesScaleIOSecretRef {
    private String name;

    public ReplicaSetListItemsSpecTemplateSpecVolumesScaleIOSecretRef() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesScaleIOSecretRef(final String name) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecVolumesScaleIOSecretRef)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecVolumesScaleIOSecretRef __otherCasted = (ReplicaSetListItemsSpecTemplateSpecVolumesScaleIOSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
