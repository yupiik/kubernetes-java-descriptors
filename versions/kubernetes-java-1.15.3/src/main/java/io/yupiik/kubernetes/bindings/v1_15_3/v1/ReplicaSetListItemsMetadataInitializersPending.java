package io.yupiik.kubernetes.bindings.v1_15_3.v1;

import java.util.Objects;

public class ReplicaSetListItemsMetadataInitializersPending {
    private String name;

    public ReplicaSetListItemsMetadataInitializersPending() {
        // no-op
    }

    public ReplicaSetListItemsMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof ReplicaSetListItemsMetadataInitializersPending)) {
            return false;
        }
        final ReplicaSetListItemsMetadataInitializersPending __otherCasted = (ReplicaSetListItemsMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
