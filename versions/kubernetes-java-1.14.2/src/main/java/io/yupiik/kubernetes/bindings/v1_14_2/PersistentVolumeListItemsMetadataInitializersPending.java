package io.yupiik.kubernetes.bindings.v1_14_2;

import java.util.Objects;

public class PersistentVolumeListItemsMetadataInitializersPending {
    private String name;

    public PersistentVolumeListItemsMetadataInitializersPending() {
        // no-op
    }

    public PersistentVolumeListItemsMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof PersistentVolumeListItemsMetadataInitializersPending)) {
            return false;
        }
        final PersistentVolumeListItemsMetadataInitializersPending __otherCasted = (PersistentVolumeListItemsMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
