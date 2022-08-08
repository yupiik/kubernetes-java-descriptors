package io.yupiik.kubernetes.bindings.v1_15_5.v1beta1;

import java.util.Objects;

public class PriorityClassMetadataInitializersPending {
    private String name;

    public PriorityClassMetadataInitializersPending() {
        // no-op
    }

    public PriorityClassMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof PriorityClassMetadataInitializersPending)) {
            return false;
        }
        final PriorityClassMetadataInitializersPending __otherCasted = (PriorityClassMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
