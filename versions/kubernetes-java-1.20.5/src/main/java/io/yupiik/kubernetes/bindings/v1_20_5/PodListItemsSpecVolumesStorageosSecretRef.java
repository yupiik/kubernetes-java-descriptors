package io.yupiik.kubernetes.bindings.v1_20_5;

import java.util.Objects;

public class PodListItemsSpecVolumesStorageosSecretRef {
    private String name;

    public PodListItemsSpecVolumesStorageosSecretRef() {
        // no-op
    }

    public PodListItemsSpecVolumesStorageosSecretRef(final String name) {
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
        if (!(__other instanceof PodListItemsSpecVolumesStorageosSecretRef)) {
            return false;
        }
        final PodListItemsSpecVolumesStorageosSecretRef __otherCasted = (PodListItemsSpecVolumesStorageosSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
