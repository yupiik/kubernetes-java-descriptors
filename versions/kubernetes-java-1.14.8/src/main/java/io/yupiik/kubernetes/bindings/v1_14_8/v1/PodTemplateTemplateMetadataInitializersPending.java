package io.yupiik.kubernetes.bindings.v1_14_8.v1;

import java.util.Objects;

public class PodTemplateTemplateMetadataInitializersPending {
    private String name;

    public PodTemplateTemplateMetadataInitializersPending() {
        // no-op
    }

    public PodTemplateTemplateMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof PodTemplateTemplateMetadataInitializersPending)) {
            return false;
        }
        final PodTemplateTemplateMetadataInitializersPending __otherCasted = (PodTemplateTemplateMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
