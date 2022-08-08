package io.yupiik.kubernetes.bindings.v1_15_10;

import java.util.Objects;

public class ClusterRoleBindingListItemsMetadataInitializersPending {
    private String name;

    public ClusterRoleBindingListItemsMetadataInitializersPending() {
        // no-op
    }

    public ClusterRoleBindingListItemsMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof ClusterRoleBindingListItemsMetadataInitializersPending)) {
            return false;
        }
        final ClusterRoleBindingListItemsMetadataInitializersPending __otherCasted = (ClusterRoleBindingListItemsMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
