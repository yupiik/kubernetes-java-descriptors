package io.yupiik.kubernetes.bindings.v1_14_1;

import java.util.Objects;

public class CustomResourceDefinitionMetadataInitializersPending {
    private String name;

    public CustomResourceDefinitionMetadataInitializersPending() {
        // no-op
    }

    public CustomResourceDefinitionMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof CustomResourceDefinitionMetadataInitializersPending)) {
            return false;
        }
        final CustomResourceDefinitionMetadataInitializersPending __otherCasted = (CustomResourceDefinitionMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
