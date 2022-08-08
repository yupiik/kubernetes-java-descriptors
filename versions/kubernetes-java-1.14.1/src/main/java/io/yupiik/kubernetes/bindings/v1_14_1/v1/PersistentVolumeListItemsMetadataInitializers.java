package io.yupiik.kubernetes.bindings.v1_14_1.v1;

import java.util.List;
import java.util.Objects;

public class PersistentVolumeListItemsMetadataInitializers {
    private List<PersistentVolumeListItemsMetadataInitializersPending> pending;
    private PersistentVolumeListItemsMetadataInitializersResult result;

    public PersistentVolumeListItemsMetadataInitializers() {
        // no-op
    }

    public PersistentVolumeListItemsMetadataInitializers(final List<PersistentVolumeListItemsMetadataInitializersPending> pending,
                                                         final PersistentVolumeListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<PersistentVolumeListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<PersistentVolumeListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public PersistentVolumeListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final PersistentVolumeListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof PersistentVolumeListItemsMetadataInitializers)) {
            return false;
        }
        final PersistentVolumeListItemsMetadataInitializers __otherCasted = (PersistentVolumeListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
