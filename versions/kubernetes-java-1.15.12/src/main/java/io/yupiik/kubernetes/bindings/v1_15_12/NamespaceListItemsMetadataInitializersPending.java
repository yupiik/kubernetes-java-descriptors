package io.yupiik.kubernetes.bindings.v1_15_12;

import java.util.Objects;

public class NamespaceListItemsMetadataInitializersPending {
    private String name;

    public NamespaceListItemsMetadataInitializersPending() {
        // no-op
    }

    public NamespaceListItemsMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof NamespaceListItemsMetadataInitializersPending)) {
            return false;
        }
        final NamespaceListItemsMetadataInitializersPending __otherCasted = (NamespaceListItemsMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
