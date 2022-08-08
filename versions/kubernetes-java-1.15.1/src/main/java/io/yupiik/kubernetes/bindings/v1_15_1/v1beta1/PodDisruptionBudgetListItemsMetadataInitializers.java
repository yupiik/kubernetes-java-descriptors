package io.yupiik.kubernetes.bindings.v1_15_1.v1beta1;

import java.util.List;
import java.util.Objects;

public class PodDisruptionBudgetListItemsMetadataInitializers {
    private List<PodDisruptionBudgetListItemsMetadataInitializersPending> pending;
    private PodDisruptionBudgetListItemsMetadataInitializersResult result;

    public PodDisruptionBudgetListItemsMetadataInitializers() {
        // no-op
    }

    public PodDisruptionBudgetListItemsMetadataInitializers(final List<PodDisruptionBudgetListItemsMetadataInitializersPending> pending,
                                                            final PodDisruptionBudgetListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<PodDisruptionBudgetListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<PodDisruptionBudgetListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public PodDisruptionBudgetListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final PodDisruptionBudgetListItemsMetadataInitializersResult result) {
        this.result = result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                pending,
                result);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodDisruptionBudgetListItemsMetadataInitializers)) {
            return false;
        }
        final PodDisruptionBudgetListItemsMetadataInitializers __otherCasted = (PodDisruptionBudgetListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
