package io.yupiik.kubernetes.bindings.v1_14_4.v1;

import java.util.Objects;

public class ReplicationControllerMetadataInitializersPending {
    private String name;

    public ReplicationControllerMetadataInitializersPending() {
        // no-op
    }

    public ReplicationControllerMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof ReplicationControllerMetadataInitializersPending)) {
            return false;
        }
        final ReplicationControllerMetadataInitializersPending __otherCasted = (ReplicationControllerMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
