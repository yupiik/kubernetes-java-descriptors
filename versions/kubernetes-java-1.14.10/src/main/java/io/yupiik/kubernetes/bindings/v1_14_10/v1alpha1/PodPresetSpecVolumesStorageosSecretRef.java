package io.yupiik.kubernetes.bindings.v1_14_10.v1alpha1;

import java.util.Objects;

public class PodPresetSpecVolumesStorageosSecretRef {
    private String name;

    public PodPresetSpecVolumesStorageosSecretRef() {
        // no-op
    }

    public PodPresetSpecVolumesStorageosSecretRef(final String name) {
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
        if (!(__other instanceof PodPresetSpecVolumesStorageosSecretRef)) {
            return false;
        }
        final PodPresetSpecVolumesStorageosSecretRef __otherCasted = (PodPresetSpecVolumesStorageosSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
