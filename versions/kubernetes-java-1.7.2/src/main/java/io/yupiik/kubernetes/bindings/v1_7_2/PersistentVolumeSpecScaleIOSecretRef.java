package io.yupiik.kubernetes.bindings.v1_7_2;

import java.util.Objects;

public class PersistentVolumeSpecScaleIOSecretRef {
    private String name;

    public PersistentVolumeSpecScaleIOSecretRef() {
        // no-op
    }

    public PersistentVolumeSpecScaleIOSecretRef(final String name) {
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
        if (!(__other instanceof PersistentVolumeSpecScaleIOSecretRef)) {
            return false;
        }
        final PersistentVolumeSpecScaleIOSecretRef __otherCasted = (PersistentVolumeSpecScaleIOSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
