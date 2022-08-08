package io.yupiik.kubernetes.bindings.v1_14_9.v1;

import java.util.Objects;

public class RoleBindingListItemsMetadataInitializersPending {
    private String name;

    public RoleBindingListItemsMetadataInitializersPending() {
        // no-op
    }

    public RoleBindingListItemsMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof RoleBindingListItemsMetadataInitializersPending)) {
            return false;
        }
        final RoleBindingListItemsMetadataInitializersPending __otherCasted = (RoleBindingListItemsMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
