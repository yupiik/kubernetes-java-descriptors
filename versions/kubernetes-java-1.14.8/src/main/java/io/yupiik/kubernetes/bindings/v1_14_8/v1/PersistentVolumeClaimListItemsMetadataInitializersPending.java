package io.yupiik.kubernetes.bindings.v1_14_8.v1;

import java.util.Objects;

public class PersistentVolumeClaimListItemsMetadataInitializersPending {
    private String name;

    public PersistentVolumeClaimListItemsMetadataInitializersPending() {
        // no-op
    }

    public PersistentVolumeClaimListItemsMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof PersistentVolumeClaimListItemsMetadataInitializersPending)) {
            return false;
        }
        final PersistentVolumeClaimListItemsMetadataInitializersPending __otherCasted = (PersistentVolumeClaimListItemsMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
