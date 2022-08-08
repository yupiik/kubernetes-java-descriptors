package io.yupiik.kubernetes.bindings.v1_17_10;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecVolumesStorageosSecretRef {
    private String name;

    public ReplicationControllerListItemsSpecTemplateSpecVolumesStorageosSecretRef() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesStorageosSecretRef(final String name) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecVolumesStorageosSecretRef)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecVolumesStorageosSecretRef __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecVolumesStorageosSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
