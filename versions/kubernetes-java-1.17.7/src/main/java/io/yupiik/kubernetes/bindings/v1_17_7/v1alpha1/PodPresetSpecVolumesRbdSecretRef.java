package io.yupiik.kubernetes.bindings.v1_17_7.v1alpha1;

import java.util.Objects;

public class PodPresetSpecVolumesRbdSecretRef {
    private String name;

    public PodPresetSpecVolumesRbdSecretRef() {
        // no-op
    }

    public PodPresetSpecVolumesRbdSecretRef(final String name) {
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
        if (!(__other instanceof PodPresetSpecVolumesRbdSecretRef)) {
            return false;
        }
        final PodPresetSpecVolumesRbdSecretRef __otherCasted = (PodPresetSpecVolumesRbdSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
