package io.yupiik.kubernetes.bindings.v1_17_6;

import java.util.Objects;

public class PodSpecVolumesCephfsSecretRef {
    private String name;

    public PodSpecVolumesCephfsSecretRef() {
        // no-op
    }

    public PodSpecVolumesCephfsSecretRef(final String name) {
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
        if (!(__other instanceof PodSpecVolumesCephfsSecretRef)) {
            return false;
        }
        final PodSpecVolumesCephfsSecretRef __otherCasted = (PodSpecVolumesCephfsSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
