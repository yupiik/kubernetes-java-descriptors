package io.yupiik.kubernetes.bindings.v1_20_0;

import java.util.Objects;

public class PersistentVolumeSpecScaleIOSecretRef {
    private String name;
    private String namespace;

    public PersistentVolumeSpecScaleIOSecretRef() {
        // no-op
    }

    public PersistentVolumeSpecScaleIOSecretRef(final String name,
                                                final String namespace) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(final String namespace) {
        this.namespace = namespace;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                namespace);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PersistentVolumeSpecScaleIOSecretRef)) {
            return false;
        }
        final PersistentVolumeSpecScaleIOSecretRef __otherCasted = (PersistentVolumeSpecScaleIOSecretRef) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespace, __otherCasted.namespace);
    }
}
