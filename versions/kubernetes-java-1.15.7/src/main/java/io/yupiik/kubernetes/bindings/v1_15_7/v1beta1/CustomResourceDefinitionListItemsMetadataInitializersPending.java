package io.yupiik.kubernetes.bindings.v1_15_7.v1beta1;

import java.util.Objects;

public class CustomResourceDefinitionListItemsMetadataInitializersPending {
    private String name;

    public CustomResourceDefinitionListItemsMetadataInitializersPending() {
        // no-op
    }

    public CustomResourceDefinitionListItemsMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof CustomResourceDefinitionListItemsMetadataInitializersPending)) {
            return false;
        }
        final CustomResourceDefinitionListItemsMetadataInitializersPending __otherCasted = (CustomResourceDefinitionListItemsMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
