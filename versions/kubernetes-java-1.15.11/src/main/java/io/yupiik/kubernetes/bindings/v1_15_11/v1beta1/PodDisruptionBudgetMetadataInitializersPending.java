package io.yupiik.kubernetes.bindings.v1_15_11.v1beta1;

import java.util.Objects;

public class PodDisruptionBudgetMetadataInitializersPending {
    private String name;

    public PodDisruptionBudgetMetadataInitializersPending() {
        // no-op
    }

    public PodDisruptionBudgetMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof PodDisruptionBudgetMetadataInitializersPending)) {
            return false;
        }
        final PodDisruptionBudgetMetadataInitializersPending __otherCasted = (PodDisruptionBudgetMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
