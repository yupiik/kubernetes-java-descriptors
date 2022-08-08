package io.yupiik.kubernetes.bindings.v1_15_11.v1;

import java.util.Objects;

public class PodTemplateListItemsMetadataInitializersPending {
    private String name;

    public PodTemplateListItemsMetadataInitializersPending() {
        // no-op
    }

    public PodTemplateListItemsMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof PodTemplateListItemsMetadataInitializersPending)) {
            return false;
        }
        final PodTemplateListItemsMetadataInitializersPending __otherCasted = (PodTemplateListItemsMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
