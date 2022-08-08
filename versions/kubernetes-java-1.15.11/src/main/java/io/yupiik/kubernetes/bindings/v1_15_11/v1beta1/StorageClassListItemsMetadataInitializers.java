package io.yupiik.kubernetes.bindings.v1_15_11.v1beta1;

import java.util.List;
import java.util.Objects;

public class StorageClassListItemsMetadataInitializers {
    private List<StorageClassListItemsMetadataInitializersPending> pending;
    private StorageClassListItemsMetadataInitializersResult result;

    public StorageClassListItemsMetadataInitializers() {
        // no-op
    }

    public StorageClassListItemsMetadataInitializers(final List<StorageClassListItemsMetadataInitializersPending> pending,
                                                     final StorageClassListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<StorageClassListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<StorageClassListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public StorageClassListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final StorageClassListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof StorageClassListItemsMetadataInitializers)) {
            return false;
        }
        final StorageClassListItemsMetadataInitializers __otherCasted = (StorageClassListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
