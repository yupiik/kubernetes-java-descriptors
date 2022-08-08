package io.yupiik.kubernetes.bindings.v1_15_7.v1;

import java.util.Objects;

public class ServiceListItemsMetadataInitializersPending {
    private String name;

    public ServiceListItemsMetadataInitializersPending() {
        // no-op
    }

    public ServiceListItemsMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof ServiceListItemsMetadataInitializersPending)) {
            return false;
        }
        final ServiceListItemsMetadataInitializersPending __otherCasted = (ServiceListItemsMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
