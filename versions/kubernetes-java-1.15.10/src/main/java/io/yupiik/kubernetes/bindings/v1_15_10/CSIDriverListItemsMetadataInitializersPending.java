package io.yupiik.kubernetes.bindings.v1_15_10;

import java.util.Objects;

public class CSIDriverListItemsMetadataInitializersPending {
    private String name;

    public CSIDriverListItemsMetadataInitializersPending() {
        // no-op
    }

    public CSIDriverListItemsMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof CSIDriverListItemsMetadataInitializersPending)) {
            return false;
        }
        final CSIDriverListItemsMetadataInitializersPending __otherCasted = (CSIDriverListItemsMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
