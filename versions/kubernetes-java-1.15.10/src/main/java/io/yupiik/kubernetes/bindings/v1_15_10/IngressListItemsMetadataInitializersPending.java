package io.yupiik.kubernetes.bindings.v1_15_10;

import java.util.Objects;

public class IngressListItemsMetadataInitializersPending {
    private String name;

    public IngressListItemsMetadataInitializersPending() {
        // no-op
    }

    public IngressListItemsMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof IngressListItemsMetadataInitializersPending)) {
            return false;
        }
        final IngressListItemsMetadataInitializersPending __otherCasted = (IngressListItemsMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
