package io.yupiik.kubernetes.bindings.v1_22_0.v1;

import java.util.Objects;

public class PodSpecVolumesCsiNodePublishSecretRef {
    private String name;

    public PodSpecVolumesCsiNodePublishSecretRef() {
        // no-op
    }

    public PodSpecVolumesCsiNodePublishSecretRef(final String name) {
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
        if (!(__other instanceof PodSpecVolumesCsiNodePublishSecretRef)) {
            return false;
        }
        final PodSpecVolumesCsiNodePublishSecretRef __otherCasted = (PodSpecVolumesCsiNodePublishSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
