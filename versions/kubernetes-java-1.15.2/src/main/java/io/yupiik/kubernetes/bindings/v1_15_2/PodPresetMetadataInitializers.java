package io.yupiik.kubernetes.bindings.v1_15_2;

import java.util.List;
import java.util.Objects;

public class PodPresetMetadataInitializers {
    private List<PodPresetMetadataInitializersPending> pending;
    private PodPresetMetadataInitializersResult result;

    public PodPresetMetadataInitializers() {
        // no-op
    }

    public PodPresetMetadataInitializers(final List<PodPresetMetadataInitializersPending> pending,
                                         final PodPresetMetadataInitializersResult result) {
        // no-op
    }

    public List<PodPresetMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<PodPresetMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public PodPresetMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final PodPresetMetadataInitializersResult result) {
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
        if (!(__other instanceof PodPresetMetadataInitializers)) {
            return false;
        }
        final PodPresetMetadataInitializers __otherCasted = (PodPresetMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
