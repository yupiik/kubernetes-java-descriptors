package io.yupiik.kubernetes.bindings.v1_14_9;

import java.util.List;
import java.util.Objects;

public class PodPresetListItemsMetadataInitializers {
    private List<PodPresetListItemsMetadataInitializersPending> pending;
    private PodPresetListItemsMetadataInitializersResult result;

    public PodPresetListItemsMetadataInitializers() {
        // no-op
    }

    public PodPresetListItemsMetadataInitializers(final List<PodPresetListItemsMetadataInitializersPending> pending,
                                                  final PodPresetListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<PodPresetListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<PodPresetListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public PodPresetListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final PodPresetListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof PodPresetListItemsMetadataInitializers)) {
            return false;
        }
        final PodPresetListItemsMetadataInitializers __otherCasted = (PodPresetListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
