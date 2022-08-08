package io.yupiik.kubernetes.bindings.v1_15_0.v1;

import java.util.Objects;

public class StorageClassListItemsMetadataInitializersPending {
    private String name;

    public StorageClassListItemsMetadataInitializersPending() {
        // no-op
    }

    public StorageClassListItemsMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof StorageClassListItemsMetadataInitializersPending)) {
            return false;
        }
        final StorageClassListItemsMetadataInitializersPending __otherCasted = (StorageClassListItemsMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
