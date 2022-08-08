package io.yupiik.kubernetes.bindings.v1_17_7.v1;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecVolumesIscsiSecretRef {
    private String name;

    public StatefulSetListItemsSpecTemplateSpecVolumesIscsiSecretRef() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesIscsiSecretRef(final String name) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecVolumesIscsiSecretRef)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecVolumesIscsiSecretRef __otherCasted = (StatefulSetListItemsSpecTemplateSpecVolumesIscsiSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
