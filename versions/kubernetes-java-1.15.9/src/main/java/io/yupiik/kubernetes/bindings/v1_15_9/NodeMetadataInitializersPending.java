package io.yupiik.kubernetes.bindings.v1_15_9;

import java.util.Objects;

public class NodeMetadataInitializersPending {
    private String name;

    public NodeMetadataInitializersPending() {
        // no-op
    }

    public NodeMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof NodeMetadataInitializersPending)) {
            return false;
        }
        final NodeMetadataInitializersPending __otherCasted = (NodeMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
