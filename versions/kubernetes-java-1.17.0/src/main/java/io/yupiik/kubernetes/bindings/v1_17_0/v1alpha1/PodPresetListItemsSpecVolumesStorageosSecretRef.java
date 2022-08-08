package io.yupiik.kubernetes.bindings.v1_17_0.v1alpha1;

import java.util.Objects;

public class PodPresetListItemsSpecVolumesStorageosSecretRef {
    private String name;

    public PodPresetListItemsSpecVolumesStorageosSecretRef() {
        // no-op
    }

    public PodPresetListItemsSpecVolumesStorageosSecretRef(final String name) {
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
        if (!(__other instanceof PodPresetListItemsSpecVolumesStorageosSecretRef)) {
            return false;
        }
        final PodPresetListItemsSpecVolumesStorageosSecretRef __otherCasted = (PodPresetListItemsSpecVolumesStorageosSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
