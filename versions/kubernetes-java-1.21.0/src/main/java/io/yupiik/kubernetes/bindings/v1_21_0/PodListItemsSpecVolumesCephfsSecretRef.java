package io.yupiik.kubernetes.bindings.v1_21_0;

import java.util.Objects;

public class PodListItemsSpecVolumesCephfsSecretRef {
    private String name;

    public PodListItemsSpecVolumesCephfsSecretRef() {
        // no-op
    }

    public PodListItemsSpecVolumesCephfsSecretRef(final String name) {
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
        if (!(__other instanceof PodListItemsSpecVolumesCephfsSecretRef)) {
            return false;
        }
        final PodListItemsSpecVolumesCephfsSecretRef __otherCasted = (PodListItemsSpecVolumesCephfsSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
