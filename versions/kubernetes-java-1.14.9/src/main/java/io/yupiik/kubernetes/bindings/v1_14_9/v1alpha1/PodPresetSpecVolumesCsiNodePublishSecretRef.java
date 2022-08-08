package io.yupiik.kubernetes.bindings.v1_14_9.v1alpha1;

import java.util.Objects;

public class PodPresetSpecVolumesCsiNodePublishSecretRef {
    private String name;

    public PodPresetSpecVolumesCsiNodePublishSecretRef() {
        // no-op
    }

    public PodPresetSpecVolumesCsiNodePublishSecretRef(final String name) {
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
        if (!(__other instanceof PodPresetSpecVolumesCsiNodePublishSecretRef)) {
            return false;
        }
        final PodPresetSpecVolumesCsiNodePublishSecretRef __otherCasted = (PodPresetSpecVolumesCsiNodePublishSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
