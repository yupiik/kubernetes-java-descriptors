package io.yupiik.kubernetes.bindings.v1_17_6.v1alpha1;

import java.util.Objects;

public class PodPresetSpecVolumesCephfsSecretRef {
    private String name;

    public PodPresetSpecVolumesCephfsSecretRef() {
        // no-op
    }

    public PodPresetSpecVolumesCephfsSecretRef(final String name) {
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
        if (!(__other instanceof PodPresetSpecVolumesCephfsSecretRef)) {
            return false;
        }
        final PodPresetSpecVolumesCephfsSecretRef __otherCasted = (PodPresetSpecVolumesCephfsSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
