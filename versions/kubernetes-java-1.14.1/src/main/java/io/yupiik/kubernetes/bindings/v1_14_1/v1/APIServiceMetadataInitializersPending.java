package io.yupiik.kubernetes.bindings.v1_14_1.v1;

import java.util.Objects;

public class APIServiceMetadataInitializersPending {
    private String name;

    public APIServiceMetadataInitializersPending() {
        // no-op
    }

    public APIServiceMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof APIServiceMetadataInitializersPending)) {
            return false;
        }
        final APIServiceMetadataInitializersPending __otherCasted = (APIServiceMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
