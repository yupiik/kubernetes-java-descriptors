package io.yupiik.kubernetes.bindings.v1_14_10;

import java.util.Objects;

public class ClusterRoleBindingMetadataInitializersPending {
    private String name;

    public ClusterRoleBindingMetadataInitializersPending() {
        // no-op
    }

    public ClusterRoleBindingMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof ClusterRoleBindingMetadataInitializersPending)) {
            return false;
        }
        final ClusterRoleBindingMetadataInitializersPending __otherCasted = (ClusterRoleBindingMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
