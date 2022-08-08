package io.yupiik.kubernetes.bindings.v1_14_10.v1;

import java.util.Objects;

public class ReplicaSetMetadataInitializersPending {
    private String name;

    public ReplicaSetMetadataInitializersPending() {
        // no-op
    }

    public ReplicaSetMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof ReplicaSetMetadataInitializersPending)) {
            return false;
        }
        final ReplicaSetMetadataInitializersPending __otherCasted = (ReplicaSetMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
