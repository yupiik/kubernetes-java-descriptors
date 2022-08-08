package io.yupiik.kubernetes.bindings.v1_15_6.v1alpha1;

import java.util.Objects;

public class RuntimeClassListItemsMetadataInitializersPending {
    private String name;

    public RuntimeClassListItemsMetadataInitializersPending() {
        // no-op
    }

    public RuntimeClassListItemsMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof RuntimeClassListItemsMetadataInitializersPending)) {
            return false;
        }
        final RuntimeClassListItemsMetadataInitializersPending __otherCasted = (RuntimeClassListItemsMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
