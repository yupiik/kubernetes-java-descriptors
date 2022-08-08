package io.yupiik.kubernetes.bindings.v1_15_7.v1alpha1;

import java.util.Objects;

public class PodPresetSpecVolumesScaleIOSecretRef {
    private String name;

    public PodPresetSpecVolumesScaleIOSecretRef() {
        // no-op
    }

    public PodPresetSpecVolumesScaleIOSecretRef(final String name) {
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
        if (!(__other instanceof PodPresetSpecVolumesScaleIOSecretRef)) {
            return false;
        }
        final PodPresetSpecVolumesScaleIOSecretRef __otherCasted = (PodPresetSpecVolumesScaleIOSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
