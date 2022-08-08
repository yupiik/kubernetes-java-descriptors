package io.yupiik.kubernetes.bindings.v1_14_5;

import java.util.Objects;

public class ServiceAccountMetadataInitializersPending {
    private String name;

    public ServiceAccountMetadataInitializersPending() {
        // no-op
    }

    public ServiceAccountMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof ServiceAccountMetadataInitializersPending)) {
            return false;
        }
        final ServiceAccountMetadataInitializersPending __otherCasted = (ServiceAccountMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
