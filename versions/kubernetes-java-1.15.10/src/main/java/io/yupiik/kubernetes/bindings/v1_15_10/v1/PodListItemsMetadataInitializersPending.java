package io.yupiik.kubernetes.bindings.v1_15_10.v1;

import java.util.Objects;

public class PodListItemsMetadataInitializersPending {
    private String name;

    public PodListItemsMetadataInitializersPending() {
        // no-op
    }

    public PodListItemsMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof PodListItemsMetadataInitializersPending)) {
            return false;
        }
        final PodListItemsMetadataInitializersPending __otherCasted = (PodListItemsMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
