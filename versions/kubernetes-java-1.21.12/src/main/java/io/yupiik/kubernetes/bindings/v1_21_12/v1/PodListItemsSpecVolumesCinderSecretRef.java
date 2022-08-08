package io.yupiik.kubernetes.bindings.v1_21_12.v1;

import java.util.Objects;

public class PodListItemsSpecVolumesCinderSecretRef {
    private String name;

    public PodListItemsSpecVolumesCinderSecretRef() {
        // no-op
    }

    public PodListItemsSpecVolumesCinderSecretRef(final String name) {
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
        if (!(__other instanceof PodListItemsSpecVolumesCinderSecretRef)) {
            return false;
        }
        final PodListItemsSpecVolumesCinderSecretRef __otherCasted = (PodListItemsSpecVolumesCinderSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
