package io.yupiik.kubernetes.bindings.v1_14_9.v1;

import java.util.Objects;

public class APIServiceListItemsMetadataInitializersPending {
    private String name;

    public APIServiceListItemsMetadataInitializersPending() {
        // no-op
    }

    public APIServiceListItemsMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof APIServiceListItemsMetadataInitializersPending)) {
            return false;
        }
        final APIServiceListItemsMetadataInitializersPending __otherCasted = (APIServiceListItemsMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
