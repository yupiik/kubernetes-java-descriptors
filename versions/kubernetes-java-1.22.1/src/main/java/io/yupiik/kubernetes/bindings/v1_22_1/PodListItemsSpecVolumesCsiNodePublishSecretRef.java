package io.yupiik.kubernetes.bindings.v1_22_1;

import java.util.Objects;

public class PodListItemsSpecVolumesCsiNodePublishSecretRef {
    private String name;

    public PodListItemsSpecVolumesCsiNodePublishSecretRef() {
        // no-op
    }

    public PodListItemsSpecVolumesCsiNodePublishSecretRef(final String name) {
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
        if (!(__other instanceof PodListItemsSpecVolumesCsiNodePublishSecretRef)) {
            return false;
        }
        final PodListItemsSpecVolumesCsiNodePublishSecretRef __otherCasted = (PodListItemsSpecVolumesCsiNodePublishSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
