package io.yupiik.kubernetes.bindings.v1_9_10;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class PersistentVolumeMetadataInitializers {
    private List<JsonValue> pending;
    private PersistentVolumeMetadataInitializersResult result;

    public PersistentVolumeMetadataInitializers() {
        // no-op
    }

    public PersistentVolumeMetadataInitializers(final List<JsonValue> pending,
                                                final PersistentVolumeMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public PersistentVolumeMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final PersistentVolumeMetadataInitializersResult result) {
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
        if (!(__other instanceof PersistentVolumeMetadataInitializers)) {
            return false;
        }
        final PersistentVolumeMetadataInitializers __otherCasted = (PersistentVolumeMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
