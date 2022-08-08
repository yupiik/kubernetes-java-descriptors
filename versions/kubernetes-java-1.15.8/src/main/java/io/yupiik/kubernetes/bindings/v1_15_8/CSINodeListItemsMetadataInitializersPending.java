package io.yupiik.kubernetes.bindings.v1_15_8;

import java.util.Objects;

public class CSINodeListItemsMetadataInitializersPending {
    private String name;

    public CSINodeListItemsMetadataInitializersPending() {
        // no-op
    }

    public CSINodeListItemsMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof CSINodeListItemsMetadataInitializersPending)) {
            return false;
        }
        final CSINodeListItemsMetadataInitializersPending __otherCasted = (CSINodeListItemsMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
