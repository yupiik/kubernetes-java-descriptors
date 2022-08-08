package io.yupiik.kubernetes.bindings.v1_19_6.v1;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecVolumesRbdSecretRef {
    private String name;

    public ReplicaSetListItemsSpecTemplateSpecVolumesRbdSecretRef() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesRbdSecretRef(final String name) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecVolumesRbdSecretRef)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecVolumesRbdSecretRef __otherCasted = (ReplicaSetListItemsSpecTemplateSpecVolumesRbdSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
