package io.yupiik.kubernetes.bindings.v1_14_6.v1alpha1;

import java.util.Objects;

public class PodPresetMetadataInitializersPending {
    private String name;

    public PodPresetMetadataInitializersPending() {
        // no-op
    }

    public PodPresetMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof PodPresetMetadataInitializersPending)) {
            return false;
        }
        final PodPresetMetadataInitializersPending __otherCasted = (PodPresetMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
