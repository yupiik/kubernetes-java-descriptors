package io.yupiik.kubernetes.bindings.v1_14_0.v1;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecVolumesIscsiSecretRef {
    private String name;

    public PodTemplateListItemsTemplateSpecVolumesIscsiSecretRef() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecVolumesIscsiSecretRef(final String name) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecVolumesIscsiSecretRef)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecVolumesIscsiSecretRef __otherCasted = (PodTemplateListItemsTemplateSpecVolumesIscsiSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
