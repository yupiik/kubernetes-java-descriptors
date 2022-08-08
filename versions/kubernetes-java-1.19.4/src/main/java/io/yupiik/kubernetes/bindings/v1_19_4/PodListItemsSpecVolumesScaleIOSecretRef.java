package io.yupiik.kubernetes.bindings.v1_19_4;

import java.util.Objects;

public class PodListItemsSpecVolumesScaleIOSecretRef {
    private String name;

    public PodListItemsSpecVolumesScaleIOSecretRef() {
        // no-op
    }

    public PodListItemsSpecVolumesScaleIOSecretRef(final String name) {
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
        if (!(__other instanceof PodListItemsSpecVolumesScaleIOSecretRef)) {
            return false;
        }
        final PodListItemsSpecVolumesScaleIOSecretRef __otherCasted = (PodListItemsSpecVolumesScaleIOSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
