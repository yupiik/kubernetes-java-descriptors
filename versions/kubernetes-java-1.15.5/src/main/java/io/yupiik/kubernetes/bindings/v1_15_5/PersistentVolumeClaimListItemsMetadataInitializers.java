package io.yupiik.kubernetes.bindings.v1_15_5;

import java.util.List;
import java.util.Objects;

public class PersistentVolumeClaimListItemsMetadataInitializers {
    private List<PersistentVolumeClaimListItemsMetadataInitializersPending> pending;
    private PersistentVolumeClaimListItemsMetadataInitializersResult result;

    public PersistentVolumeClaimListItemsMetadataInitializers() {
        // no-op
    }

    public PersistentVolumeClaimListItemsMetadataInitializers(final List<PersistentVolumeClaimListItemsMetadataInitializersPending> pending,
                                                              final PersistentVolumeClaimListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<PersistentVolumeClaimListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<PersistentVolumeClaimListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public PersistentVolumeClaimListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final PersistentVolumeClaimListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof PersistentVolumeClaimListItemsMetadataInitializers)) {
            return false;
        }
        final PersistentVolumeClaimListItemsMetadataInitializers __otherCasted = (PersistentVolumeClaimListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
