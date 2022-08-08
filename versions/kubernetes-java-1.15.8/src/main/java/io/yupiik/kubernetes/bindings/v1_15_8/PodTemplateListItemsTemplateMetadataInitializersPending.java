package io.yupiik.kubernetes.bindings.v1_15_8;

import java.util.Objects;

public class PodTemplateListItemsTemplateMetadataInitializersPending {
    private String name;

    public PodTemplateListItemsTemplateMetadataInitializersPending() {
        // no-op
    }

    public PodTemplateListItemsTemplateMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateMetadataInitializersPending)) {
            return false;
        }
        final PodTemplateListItemsTemplateMetadataInitializersPending __otherCasted = (PodTemplateListItemsTemplateMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
