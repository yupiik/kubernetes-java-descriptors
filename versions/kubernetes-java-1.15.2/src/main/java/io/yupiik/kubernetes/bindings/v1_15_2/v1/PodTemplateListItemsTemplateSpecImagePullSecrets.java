package io.yupiik.kubernetes.bindings.v1_15_2.v1;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecImagePullSecrets {
    private String name;

    public PodTemplateListItemsTemplateSpecImagePullSecrets() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecImagePullSecrets(final String name) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecImagePullSecrets)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecImagePullSecrets __otherCasted = (PodTemplateListItemsTemplateSpecImagePullSecrets) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
