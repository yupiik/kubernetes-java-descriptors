package io.yupiik.kubernetes.bindings.v1_15_4.v1;

import java.util.Objects;

public class BindingMetadataInitializersPending {
    private String name;

    public BindingMetadataInitializersPending() {
        // no-op
    }

    public BindingMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof BindingMetadataInitializersPending)) {
            return false;
        }
        final BindingMetadataInitializersPending __otherCasted = (BindingMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
