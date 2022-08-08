package io.yupiik.kubernetes.bindings.v1_17_9;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecVolumesStorageosSecretRef {
    private String name;

    public PodTemplateListItemsTemplateSpecVolumesStorageosSecretRef() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecVolumesStorageosSecretRef(final String name) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecVolumesStorageosSecretRef)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecVolumesStorageosSecretRef __otherCasted = (PodTemplateListItemsTemplateSpecVolumesStorageosSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
