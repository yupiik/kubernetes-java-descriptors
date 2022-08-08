package io.yupiik.kubernetes.bindings.v1_15_10.v1beta1;

import java.util.Objects;

public class PodDisruptionBudgetListItemsMetadataInitializersPending {
    private String name;

    public PodDisruptionBudgetListItemsMetadataInitializersPending() {
        // no-op
    }

    public PodDisruptionBudgetListItemsMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof PodDisruptionBudgetListItemsMetadataInitializersPending)) {
            return false;
        }
        final PodDisruptionBudgetListItemsMetadataInitializersPending __otherCasted = (PodDisruptionBudgetListItemsMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
