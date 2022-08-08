package io.yupiik.kubernetes.bindings.v1_17_13.v1beta2;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecImagePullSecrets {
    private String name;

    public ReplicaSetListItemsSpecTemplateSpecImagePullSecrets() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecImagePullSecrets(final String name) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecImagePullSecrets)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecImagePullSecrets __otherCasted = (ReplicaSetListItemsSpecTemplateSpecImagePullSecrets) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
