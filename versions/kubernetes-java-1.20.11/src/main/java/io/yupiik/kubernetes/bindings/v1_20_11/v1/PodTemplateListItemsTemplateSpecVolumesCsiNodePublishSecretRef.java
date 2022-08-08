package io.yupiik.kubernetes.bindings.v1_20_11.v1;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecVolumesCsiNodePublishSecretRef {
    private String name;

    public PodTemplateListItemsTemplateSpecVolumesCsiNodePublishSecretRef() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecVolumesCsiNodePublishSecretRef(final String name) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecVolumesCsiNodePublishSecretRef)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecVolumesCsiNodePublishSecretRef __otherCasted = (PodTemplateListItemsTemplateSpecVolumesCsiNodePublishSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
