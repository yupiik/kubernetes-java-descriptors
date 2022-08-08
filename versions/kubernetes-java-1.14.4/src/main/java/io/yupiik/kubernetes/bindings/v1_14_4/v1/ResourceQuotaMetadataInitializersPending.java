package io.yupiik.kubernetes.bindings.v1_14_4.v1;

import java.util.Objects;

public class ResourceQuotaMetadataInitializersPending {
    private String name;

    public ResourceQuotaMetadataInitializersPending() {
        // no-op
    }

    public ResourceQuotaMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof ResourceQuotaMetadataInitializersPending)) {
            return false;
        }
        final ResourceQuotaMetadataInitializersPending __otherCasted = (ResourceQuotaMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
