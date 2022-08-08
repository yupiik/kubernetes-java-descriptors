package io.yupiik.kubernetes.bindings.v1_23_4;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecOs {
    private String name;

    public PodTemplateListItemsTemplateSpecOs() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecOs(final String name) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecOs)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecOs __otherCasted = (PodTemplateListItemsTemplateSpecOs) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
