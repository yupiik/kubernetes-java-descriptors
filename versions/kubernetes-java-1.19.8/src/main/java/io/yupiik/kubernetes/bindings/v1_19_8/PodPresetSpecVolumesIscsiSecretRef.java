package io.yupiik.kubernetes.bindings.v1_19_8;

import java.util.Objects;

public class PodPresetSpecVolumesIscsiSecretRef {
    private String name;

    public PodPresetSpecVolumesIscsiSecretRef() {
        // no-op
    }

    public PodPresetSpecVolumesIscsiSecretRef(final String name) {
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
        if (!(__other instanceof PodPresetSpecVolumesIscsiSecretRef)) {
            return false;
        }
        final PodPresetSpecVolumesIscsiSecretRef __otherCasted = (PodPresetSpecVolumesIscsiSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
