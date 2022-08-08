package io.yupiik.kubernetes.bindings.v1_14_4;

import java.util.Objects;

public class PodPresetListItemsMetadataInitializersPending {
    private String name;

    public PodPresetListItemsMetadataInitializersPending() {
        // no-op
    }

    public PodPresetListItemsMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof PodPresetListItemsMetadataInitializersPending)) {
            return false;
        }
        final PodPresetListItemsMetadataInitializersPending __otherCasted = (PodPresetListItemsMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
