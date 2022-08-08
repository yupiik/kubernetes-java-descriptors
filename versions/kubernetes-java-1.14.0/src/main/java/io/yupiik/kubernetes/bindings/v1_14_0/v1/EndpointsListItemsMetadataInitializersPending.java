package io.yupiik.kubernetes.bindings.v1_14_0.v1;

import java.util.Objects;

public class EndpointsListItemsMetadataInitializersPending {
    private String name;

    public EndpointsListItemsMetadataInitializersPending() {
        // no-op
    }

    public EndpointsListItemsMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof EndpointsListItemsMetadataInitializersPending)) {
            return false;
        }
        final EndpointsListItemsMetadataInitializersPending __otherCasted = (EndpointsListItemsMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
