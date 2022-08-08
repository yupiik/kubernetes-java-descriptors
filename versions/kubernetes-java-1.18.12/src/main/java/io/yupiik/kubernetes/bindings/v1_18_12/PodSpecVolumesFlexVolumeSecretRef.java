package io.yupiik.kubernetes.bindings.v1_18_12;

import java.util.Objects;

public class PodSpecVolumesFlexVolumeSecretRef {
    private String name;

    public PodSpecVolumesFlexVolumeSecretRef() {
        // no-op
    }

    public PodSpecVolumesFlexVolumeSecretRef(final String name) {
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
        if (!(__other instanceof PodSpecVolumesFlexVolumeSecretRef)) {
            return false;
        }
        final PodSpecVolumesFlexVolumeSecretRef __otherCasted = (PodSpecVolumesFlexVolumeSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
