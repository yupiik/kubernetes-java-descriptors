package io.yupiik.kubernetes.bindings.v1_14_2;

import java.util.Objects;

public class RuntimeClassMetadataInitializersPending {
    private String name;

    public RuntimeClassMetadataInitializersPending() {
        // no-op
    }

    public RuntimeClassMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof RuntimeClassMetadataInitializersPending)) {
            return false;
        }
        final RuntimeClassMetadataInitializersPending __otherCasted = (RuntimeClassMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
