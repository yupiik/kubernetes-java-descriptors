package io.yupiik.kubernetes.bindings.v1_14_0.v1beta1;

import java.util.Objects;

public class RoleListItemsMetadataInitializersPending {
    private String name;

    public RoleListItemsMetadataInitializersPending() {
        // no-op
    }

    public RoleListItemsMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof RoleListItemsMetadataInitializersPending)) {
            return false;
        }
        final RoleListItemsMetadataInitializersPending __otherCasted = (RoleListItemsMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
