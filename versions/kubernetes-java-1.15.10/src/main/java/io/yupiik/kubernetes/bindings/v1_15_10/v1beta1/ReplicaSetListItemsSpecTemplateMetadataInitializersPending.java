package io.yupiik.kubernetes.bindings.v1_15_10.v1beta1;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateMetadataInitializersPending {
    private String name;

    public ReplicaSetListItemsSpecTemplateMetadataInitializersPending() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateMetadataInitializersPending)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateMetadataInitializersPending __otherCasted = (ReplicaSetListItemsSpecTemplateMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
