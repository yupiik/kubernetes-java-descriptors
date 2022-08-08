package io.yupiik.kubernetes.bindings.v1_23_3.v1;

import java.util.Objects;

public class PodListItemsSpecVolumesFlexVolumeSecretRef {
    private String name;

    public PodListItemsSpecVolumesFlexVolumeSecretRef() {
        // no-op
    }

    public PodListItemsSpecVolumesFlexVolumeSecretRef(final String name) {
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
        if (!(__other instanceof PodListItemsSpecVolumesFlexVolumeSecretRef)) {
            return false;
        }
        final PodListItemsSpecVolumesFlexVolumeSecretRef __otherCasted = (PodListItemsSpecVolumesFlexVolumeSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
