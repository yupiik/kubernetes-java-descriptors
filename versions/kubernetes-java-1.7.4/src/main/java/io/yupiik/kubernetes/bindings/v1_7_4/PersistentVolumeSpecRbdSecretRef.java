package io.yupiik.kubernetes.bindings.v1_7_4;

import java.util.Objects;

public class PersistentVolumeSpecRbdSecretRef {
    private String name;

    public PersistentVolumeSpecRbdSecretRef() {
        // no-op
    }

    public PersistentVolumeSpecRbdSecretRef(final String name) {
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
        if (!(__other instanceof PersistentVolumeSpecRbdSecretRef)) {
            return false;
        }
        final PersistentVolumeSpecRbdSecretRef __otherCasted = (PersistentVolumeSpecRbdSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
