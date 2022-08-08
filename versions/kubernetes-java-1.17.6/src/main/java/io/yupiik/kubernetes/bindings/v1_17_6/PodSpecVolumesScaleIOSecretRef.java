package io.yupiik.kubernetes.bindings.v1_17_6;

import java.util.Objects;

public class PodSpecVolumesScaleIOSecretRef {
    private String name;

    public PodSpecVolumesScaleIOSecretRef() {
        // no-op
    }

    public PodSpecVolumesScaleIOSecretRef(final String name) {
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
        if (!(__other instanceof PodSpecVolumesScaleIOSecretRef)) {
            return false;
        }
        final PodSpecVolumesScaleIOSecretRef __otherCasted = (PodSpecVolumesScaleIOSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
