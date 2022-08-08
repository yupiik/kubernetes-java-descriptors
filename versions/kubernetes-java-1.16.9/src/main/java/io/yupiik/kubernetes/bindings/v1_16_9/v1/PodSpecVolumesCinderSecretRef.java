package io.yupiik.kubernetes.bindings.v1_16_9.v1;

import java.util.Objects;

public class PodSpecVolumesCinderSecretRef {
    private String name;

    public PodSpecVolumesCinderSecretRef() {
        // no-op
    }

    public PodSpecVolumesCinderSecretRef(final String name) {
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
        if (!(__other instanceof PodSpecVolumesCinderSecretRef)) {
            return false;
        }
        final PodSpecVolumesCinderSecretRef __otherCasted = (PodSpecVolumesCinderSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
