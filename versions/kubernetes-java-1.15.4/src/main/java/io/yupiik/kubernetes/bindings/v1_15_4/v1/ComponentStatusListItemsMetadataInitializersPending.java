package io.yupiik.kubernetes.bindings.v1_15_4.v1;

import java.util.Objects;

public class ComponentStatusListItemsMetadataInitializersPending {
    private String name;

    public ComponentStatusListItemsMetadataInitializersPending() {
        // no-op
    }

    public ComponentStatusListItemsMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof ComponentStatusListItemsMetadataInitializersPending)) {
            return false;
        }
        final ComponentStatusListItemsMetadataInitializersPending __otherCasted = (ComponentStatusListItemsMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
