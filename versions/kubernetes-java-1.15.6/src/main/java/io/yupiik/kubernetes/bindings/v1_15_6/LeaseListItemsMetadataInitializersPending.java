package io.yupiik.kubernetes.bindings.v1_15_6;

import java.util.Objects;

public class LeaseListItemsMetadataInitializersPending {
    private String name;

    public LeaseListItemsMetadataInitializersPending() {
        // no-op
    }

    public LeaseListItemsMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof LeaseListItemsMetadataInitializersPending)) {
            return false;
        }
        final LeaseListItemsMetadataInitializersPending __otherCasted = (LeaseListItemsMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
