package io.yupiik.kubernetes.bindings.v1_14_0;

import java.util.List;
import java.util.Objects;

public class PodListItemsMetadataInitializers {
    private List<PodListItemsMetadataInitializersPending> pending;
    private PodListItemsMetadataInitializersResult result;

    public PodListItemsMetadataInitializers() {
        // no-op
    }

    public PodListItemsMetadataInitializers(final List<PodListItemsMetadataInitializersPending> pending,
                                            final PodListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<PodListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<PodListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public PodListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final PodListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof PodListItemsMetadataInitializers)) {
            return false;
        }
        final PodListItemsMetadataInitializers __otherCasted = (PodListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
