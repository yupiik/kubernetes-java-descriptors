package io.yupiik.kubernetes.bindings.v1_19_6.v1;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecVolumesCephfsSecretRef {
    private String name;

    public PodTemplateListItemsTemplateSpecVolumesCephfsSecretRef() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecVolumesCephfsSecretRef(final String name) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecVolumesCephfsSecretRef)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecVolumesCephfsSecretRef __otherCasted = (PodTemplateListItemsTemplateSpecVolumesCephfsSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
