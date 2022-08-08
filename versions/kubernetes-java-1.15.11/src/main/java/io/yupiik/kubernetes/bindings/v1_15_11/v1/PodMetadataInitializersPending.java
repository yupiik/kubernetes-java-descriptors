package io.yupiik.kubernetes.bindings.v1_15_11.v1;

import java.util.Objects;

public class PodMetadataInitializersPending {
    private String name;

    public PodMetadataInitializersPending() {
        // no-op
    }

    public PodMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof PodMetadataInitializersPending)) {
            return false;
        }
        final PodMetadataInitializersPending __otherCasted = (PodMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
