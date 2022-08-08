package io.yupiik.kubernetes.bindings.v1_18_17.v1;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecVolumesStorageosSecretRef {
    private String name;

    public ReplicationControllerSpecTemplateSpecVolumesStorageosSecretRef() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecVolumesStorageosSecretRef(final String name) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecVolumesStorageosSecretRef)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecVolumesStorageosSecretRef __otherCasted = (ReplicationControllerSpecTemplateSpecVolumesStorageosSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
