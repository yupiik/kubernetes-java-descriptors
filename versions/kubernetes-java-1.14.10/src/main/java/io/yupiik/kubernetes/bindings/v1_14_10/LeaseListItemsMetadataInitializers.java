package io.yupiik.kubernetes.bindings.v1_14_10;

import java.util.List;
import java.util.Objects;

public class LeaseListItemsMetadataInitializers {
    private List<LeaseListItemsMetadataInitializersPending> pending;
    private LeaseListItemsMetadataInitializersResult result;

    public LeaseListItemsMetadataInitializers() {
        // no-op
    }

    public LeaseListItemsMetadataInitializers(final List<LeaseListItemsMetadataInitializersPending> pending,
                                              final LeaseListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<LeaseListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<LeaseListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public LeaseListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final LeaseListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof LeaseListItemsMetadataInitializers)) {
            return false;
        }
        final LeaseListItemsMetadataInitializers __otherCasted = (LeaseListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
