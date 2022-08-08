package io.yupiik.kubernetes.bindings.v1_16_10;

import java.util.Objects;

public class PodSpecVolumesIscsiSecretRef {
    private String name;

    public PodSpecVolumesIscsiSecretRef() {
        // no-op
    }

    public PodSpecVolumesIscsiSecretRef(final String name) {
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
        if (!(__other instanceof PodSpecVolumesIscsiSecretRef)) {
            return false;
        }
        final PodSpecVolumesIscsiSecretRef __otherCasted = (PodSpecVolumesIscsiSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
