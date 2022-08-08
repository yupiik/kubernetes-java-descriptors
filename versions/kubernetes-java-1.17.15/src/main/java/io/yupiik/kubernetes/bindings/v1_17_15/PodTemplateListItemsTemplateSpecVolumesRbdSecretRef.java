package io.yupiik.kubernetes.bindings.v1_17_15;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecVolumesRbdSecretRef {
    private String name;

    public PodTemplateListItemsTemplateSpecVolumesRbdSecretRef() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecVolumesRbdSecretRef(final String name) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecVolumesRbdSecretRef)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecVolumesRbdSecretRef __otherCasted = (PodTemplateListItemsTemplateSpecVolumesRbdSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
