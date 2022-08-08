package io.yupiik.kubernetes.bindings.v1_15_6.v1beta1;

import java.util.List;
import java.util.Objects;

public class PodDisruptionBudgetMetadataInitializers {
    private List<PodDisruptionBudgetMetadataInitializersPending> pending;
    private PodDisruptionBudgetMetadataInitializersResult result;

    public PodDisruptionBudgetMetadataInitializers() {
        // no-op
    }

    public PodDisruptionBudgetMetadataInitializers(final List<PodDisruptionBudgetMetadataInitializersPending> pending,
                                                   final PodDisruptionBudgetMetadataInitializersResult result) {
        // no-op
    }

    public List<PodDisruptionBudgetMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<PodDisruptionBudgetMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public PodDisruptionBudgetMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final PodDisruptionBudgetMetadataInitializersResult result) {
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
        if (!(__other instanceof PodDisruptionBudgetMetadataInitializers)) {
            return false;
        }
        final PodDisruptionBudgetMetadataInitializers __otherCasted = (PodDisruptionBudgetMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
