package io.yupiik.kubernetes.bindings.v1_15_3;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecVolumesStorageosSecretRef {
    private String name;

    public DaemonSetListItemsSpecTemplateSpecVolumesStorageosSecretRef() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesStorageosSecretRef(final String name) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecVolumesStorageosSecretRef)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecVolumesStorageosSecretRef __otherCasted = (DaemonSetListItemsSpecTemplateSpecVolumesStorageosSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
