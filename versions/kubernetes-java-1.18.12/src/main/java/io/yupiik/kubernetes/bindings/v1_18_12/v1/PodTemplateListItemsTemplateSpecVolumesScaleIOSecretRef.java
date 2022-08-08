package io.yupiik.kubernetes.bindings.v1_18_12.v1;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecVolumesScaleIOSecretRef {
    private String name;

    public PodTemplateListItemsTemplateSpecVolumesScaleIOSecretRef() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecVolumesScaleIOSecretRef(final String name) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecVolumesScaleIOSecretRef)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecVolumesScaleIOSecretRef __otherCasted = (PodTemplateListItemsTemplateSpecVolumesScaleIOSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
