package io.yupiik.kubernetes.bindings.v1_7_13;

import java.util.Objects;

public class PersistentVolumeSpecCephfsSecretRef {
    private String name;

    public PersistentVolumeSpecCephfsSecretRef() {
        // no-op
    }

    public PersistentVolumeSpecCephfsSecretRef(final String name) {
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
        if (!(__other instanceof PersistentVolumeSpecCephfsSecretRef)) {
            return false;
        }
        final PersistentVolumeSpecCephfsSecretRef __otherCasted = (PersistentVolumeSpecCephfsSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
