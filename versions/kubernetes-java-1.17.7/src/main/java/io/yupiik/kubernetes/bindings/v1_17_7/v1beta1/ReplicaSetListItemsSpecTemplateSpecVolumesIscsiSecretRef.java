package io.yupiik.kubernetes.bindings.v1_17_7.v1beta1;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecVolumesIscsiSecretRef {
    private String name;

    public ReplicaSetListItemsSpecTemplateSpecVolumesIscsiSecretRef() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesIscsiSecretRef(final String name) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecVolumesIscsiSecretRef)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecVolumesIscsiSecretRef __otherCasted = (ReplicaSetListItemsSpecTemplateSpecVolumesIscsiSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
