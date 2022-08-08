package io.yupiik.kubernetes.bindings.v1_17_3.v1;

import java.util.Objects;

public class PodListItemsSpecVolumesRbdSecretRef {
    private String name;

    public PodListItemsSpecVolumesRbdSecretRef() {
        // no-op
    }

    public PodListItemsSpecVolumesRbdSecretRef(final String name) {
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
        if (!(__other instanceof PodListItemsSpecVolumesRbdSecretRef)) {
            return false;
        }
        final PodListItemsSpecVolumesRbdSecretRef __otherCasted = (PodListItemsSpecVolumesRbdSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
