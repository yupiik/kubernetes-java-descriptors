package io.yupiik.kubernetes.bindings.v1_14_8.v1;

import java.util.Objects;

public class PersistentVolumeSpecCsiNodePublishSecretRef {
    private String name;
    private String namespace;

    public PersistentVolumeSpecCsiNodePublishSecretRef() {
        // no-op
    }

    public PersistentVolumeSpecCsiNodePublishSecretRef(final String name,
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
        if (!(__other instanceof PersistentVolumeSpecCsiNodePublishSecretRef)) {
            return false;
        }
        final PersistentVolumeSpecCsiNodePublishSecretRef __otherCasted = (PersistentVolumeSpecCsiNodePublishSecretRef) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespace, __otherCasted.namespace);
    }
}
