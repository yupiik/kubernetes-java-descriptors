package io.yupiik.kubernetes.bindings.v1_9_6;

import java.util.Objects;

public class PersistentVolumeSpecFlexVolumeSecretRef {
    private String name;

    public PersistentVolumeSpecFlexVolumeSecretRef() {
        // no-op
    }

    public PersistentVolumeSpecFlexVolumeSecretRef(final String name) {
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
        if (!(__other instanceof PersistentVolumeSpecFlexVolumeSecretRef)) {
            return false;
        }
        final PersistentVolumeSpecFlexVolumeSecretRef __otherCasted = (PersistentVolumeSpecFlexVolumeSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
