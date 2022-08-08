package io.yupiik.kubernetes.bindings.v1_13_11;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class NodeMetadataInitializers {
    private List<JsonValue> pending;
    private NodeMetadataInitializersResult result;

    public NodeMetadataInitializers() {
        // no-op
    }

    public NodeMetadataInitializers(final List<JsonValue> pending,
                                    final NodeMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public NodeMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final NodeMetadataInitializersResult result) {
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
        if (!(__other instanceof NodeMetadataInitializers)) {
            return false;
        }
        final NodeMetadataInitializers __otherCasted = (NodeMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
