package io.yupiik.kubernetes.bindings.v1_10_7;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class EvictionMetadataInitializers {
    private List<JsonValue> pending;
    private EvictionMetadataInitializersResult result;

    public EvictionMetadataInitializers() {
        // no-op
    }

    public EvictionMetadataInitializers(final List<JsonValue> pending,
                                        final EvictionMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public EvictionMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final EvictionMetadataInitializersResult result) {
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
        if (!(__other instanceof EvictionMetadataInitializers)) {
            return false;
        }
        final EvictionMetadataInitializers __otherCasted = (EvictionMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
