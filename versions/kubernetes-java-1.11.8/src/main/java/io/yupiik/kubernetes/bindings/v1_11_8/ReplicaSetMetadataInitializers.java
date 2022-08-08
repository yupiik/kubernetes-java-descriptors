package io.yupiik.kubernetes.bindings.v1_11_8;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class ReplicaSetMetadataInitializers {
    private List<JsonValue> pending;
    private ReplicaSetMetadataInitializersResult result;

    public ReplicaSetMetadataInitializers() {
        // no-op
    }

    public ReplicaSetMetadataInitializers(final List<JsonValue> pending,
                                          final ReplicaSetMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public ReplicaSetMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ReplicaSetMetadataInitializersResult result) {
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
        if (!(__other instanceof ReplicaSetMetadataInitializers)) {
            return false;
        }
        final ReplicaSetMetadataInitializers __otherCasted = (ReplicaSetMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
