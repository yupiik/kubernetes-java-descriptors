package io.yupiik.kubernetes.bindings.v1_14_2;

import java.util.Objects;

public class ResourceQuotaListItemsMetadataInitializersPending {
    private String name;

    public ResourceQuotaListItemsMetadataInitializersPending() {
        // no-op
    }

    public ResourceQuotaListItemsMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof ResourceQuotaListItemsMetadataInitializersPending)) {
            return false;
        }
        final ResourceQuotaListItemsMetadataInitializersPending __otherCasted = (ResourceQuotaListItemsMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
