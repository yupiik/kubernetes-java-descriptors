package io.yupiik.kubernetes.bindings.v1_17_9.v1;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecVolumesFlexVolumeSecretRef {
    private String name;

    public PodTemplateListItemsTemplateSpecVolumesFlexVolumeSecretRef() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecVolumesFlexVolumeSecretRef(final String name) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecVolumesFlexVolumeSecretRef)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecVolumesFlexVolumeSecretRef __otherCasted = (PodTemplateListItemsTemplateSpecVolumesFlexVolumeSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
