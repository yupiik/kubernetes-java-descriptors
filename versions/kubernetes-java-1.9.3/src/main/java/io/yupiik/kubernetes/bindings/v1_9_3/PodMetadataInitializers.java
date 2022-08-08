package io.yupiik.kubernetes.bindings.v1_9_3;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class PodMetadataInitializers {
    private List<JsonValue> pending;
    private PodMetadataInitializersResult result;

    public PodMetadataInitializers() {
        // no-op
    }

    public PodMetadataInitializers(final List<JsonValue> pending,
                                   final PodMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public PodMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final PodMetadataInitializersResult result) {
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
        if (!(__other instanceof PodMetadataInitializers)) {
            return false;
        }
        final PodMetadataInitializers __otherCasted = (PodMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
