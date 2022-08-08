package io.yupiik.kubernetes.bindings.v1_14_2.v1;

import java.util.Objects;

public class ServiceAccountListItemsMetadataInitializersPending {
    private String name;

    public ServiceAccountListItemsMetadataInitializersPending() {
        // no-op
    }

    public ServiceAccountListItemsMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof ServiceAccountListItemsMetadataInitializersPending)) {
            return false;
        }
        final ServiceAccountListItemsMetadataInitializersPending __otherCasted = (ServiceAccountListItemsMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
