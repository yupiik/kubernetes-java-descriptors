package io.yupiik.kubernetes.bindings.v1_16_11;

import java.util.Objects;

public class PodSpecVolumesStorageosSecretRef {
    private String name;

    public PodSpecVolumesStorageosSecretRef() {
        // no-op
    }

    public PodSpecVolumesStorageosSecretRef(final String name) {
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
        if (!(__other instanceof PodSpecVolumesStorageosSecretRef)) {
            return false;
        }
        final PodSpecVolumesStorageosSecretRef __otherCasted = (PodSpecVolumesStorageosSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
