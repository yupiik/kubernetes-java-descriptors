package io.yupiik.kubernetes.bindings.v1_23_2;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecVolumesCinderSecretRef {
    private String name;

    public PodTemplateListItemsTemplateSpecVolumesCinderSecretRef() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecVolumesCinderSecretRef(final String name) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecVolumesCinderSecretRef)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecVolumesCinderSecretRef __otherCasted = (PodTemplateListItemsTemplateSpecVolumesCinderSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
