package io.yupiik.kubernetes.bindings.v1_14_2;

import java.util.Objects;

public class PersistentVolumeClaimMetadataInitializersPending {
    private String name;

    public PersistentVolumeClaimMetadataInitializersPending() {
        // no-op
    }

    public PersistentVolumeClaimMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof PersistentVolumeClaimMetadataInitializersPending)) {
            return false;
        }
        final PersistentVolumeClaimMetadataInitializersPending __otherCasted = (PersistentVolumeClaimMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
