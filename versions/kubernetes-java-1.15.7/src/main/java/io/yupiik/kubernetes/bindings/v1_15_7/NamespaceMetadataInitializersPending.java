package io.yupiik.kubernetes.bindings.v1_15_7;

import java.util.Objects;

public class NamespaceMetadataInitializersPending {
    private String name;

    public NamespaceMetadataInitializersPending() {
        // no-op
    }

    public NamespaceMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof NamespaceMetadataInitializersPending)) {
            return false;
        }
        final NamespaceMetadataInitializersPending __otherCasted = (NamespaceMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
