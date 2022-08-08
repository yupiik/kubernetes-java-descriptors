package io.yupiik.kubernetes.bindings.v1_16_7.v1beta1;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecVolumesStorageosSecretRef {
    private String name;

    public StatefulSetListItemsSpecTemplateSpecVolumesStorageosSecretRef() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesStorageosSecretRef(final String name) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecVolumesStorageosSecretRef)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecVolumesStorageosSecretRef __otherCasted = (StatefulSetListItemsSpecTemplateSpecVolumesStorageosSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
