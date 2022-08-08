package io.yupiik.kubernetes.bindings.v1_14_3;

import java.util.Objects;

public class RoleMetadataInitializersPending {
    private String name;

    public RoleMetadataInitializersPending() {
        // no-op
    }

    public RoleMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof RoleMetadataInitializersPending)) {
            return false;
        }
        final RoleMetadataInitializersPending __otherCasted = (RoleMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
