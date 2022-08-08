package io.yupiik.kubernetes.bindings.v1_18_14.v1alpha1;

import java.util.Objects;

public class PodPresetSpecVolumesCinderSecretRef {
    private String name;

    public PodPresetSpecVolumesCinderSecretRef() {
        // no-op
    }

    public PodPresetSpecVolumesCinderSecretRef(final String name) {
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
        if (!(__other instanceof PodPresetSpecVolumesCinderSecretRef)) {
            return false;
        }
        final PodPresetSpecVolumesCinderSecretRef __otherCasted = (PodPresetSpecVolumesCinderSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
