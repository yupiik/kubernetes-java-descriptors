package io.yupiik.kubernetes.bindings.v1_15_1.v1;

import java.util.List;
import java.util.Objects;

public class PersistentVolumeClaimMetadataInitializers {
    private List<PersistentVolumeClaimMetadataInitializersPending> pending;
    private PersistentVolumeClaimMetadataInitializersResult result;

    public PersistentVolumeClaimMetadataInitializers() {
        // no-op
    }

    public PersistentVolumeClaimMetadataInitializers(final List<PersistentVolumeClaimMetadataInitializersPending> pending,
                                                     final PersistentVolumeClaimMetadataInitializersResult result) {
        // no-op
    }

    public List<PersistentVolumeClaimMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<PersistentVolumeClaimMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public PersistentVolumeClaimMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final PersistentVolumeClaimMetadataInitializersResult result) {
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
        if (!(__other instanceof PersistentVolumeClaimMetadataInitializers)) {
            return false;
        }
        final PersistentVolumeClaimMetadataInitializers __otherCasted = (PersistentVolumeClaimMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
