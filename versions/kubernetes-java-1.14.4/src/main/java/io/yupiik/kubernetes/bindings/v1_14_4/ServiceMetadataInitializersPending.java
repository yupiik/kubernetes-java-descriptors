package io.yupiik.kubernetes.bindings.v1_14_4;

import java.util.Objects;

public class ServiceMetadataInitializersPending {
    private String name;

    public ServiceMetadataInitializersPending() {
        // no-op
    }

    public ServiceMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof ServiceMetadataInitializersPending)) {
            return false;
        }
        final ServiceMetadataInitializersPending __otherCasted = (ServiceMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
