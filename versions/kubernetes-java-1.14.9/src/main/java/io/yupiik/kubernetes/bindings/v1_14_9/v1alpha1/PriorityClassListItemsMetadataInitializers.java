package io.yupiik.kubernetes.bindings.v1_14_9.v1alpha1;

import java.util.List;
import java.util.Objects;

public class PriorityClassListItemsMetadataInitializers {
    private List<PriorityClassListItemsMetadataInitializersPending> pending;
    private PriorityClassListItemsMetadataInitializersResult result;

    public PriorityClassListItemsMetadataInitializers() {
        // no-op
    }

    public PriorityClassListItemsMetadataInitializers(final List<PriorityClassListItemsMetadataInitializersPending> pending,
                                                      final PriorityClassListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<PriorityClassListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<PriorityClassListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public PriorityClassListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final PriorityClassListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof PriorityClassListItemsMetadataInitializers)) {
            return false;
        }
        final PriorityClassListItemsMetadataInitializers __otherCasted = (PriorityClassListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
