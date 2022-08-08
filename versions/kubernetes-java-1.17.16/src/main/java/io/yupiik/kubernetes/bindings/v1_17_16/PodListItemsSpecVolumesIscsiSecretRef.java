package io.yupiik.kubernetes.bindings.v1_17_16;

import java.util.Objects;

public class PodListItemsSpecVolumesIscsiSecretRef {
    private String name;

    public PodListItemsSpecVolumesIscsiSecretRef() {
        // no-op
    }

    public PodListItemsSpecVolumesIscsiSecretRef(final String name) {
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
        if (!(__other instanceof PodListItemsSpecVolumesIscsiSecretRef)) {
            return false;
        }
        final PodListItemsSpecVolumesIscsiSecretRef __otherCasted = (PodListItemsSpecVolumesIscsiSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
