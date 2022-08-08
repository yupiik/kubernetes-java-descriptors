package io.yupiik.kubernetes.bindings.v1_9_10.v1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class ReplicationControllerMetadataInitializers {
    private List<JsonValue> pending;
    private ReplicationControllerMetadataInitializersResult result;

    public ReplicationControllerMetadataInitializers() {
        // no-op
    }

    public ReplicationControllerMetadataInitializers(final List<JsonValue> pending,
                                                     final ReplicationControllerMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public ReplicationControllerMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ReplicationControllerMetadataInitializersResult result) {
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
        if (!(__other instanceof ReplicationControllerMetadataInitializers)) {
            return false;
        }
        final ReplicationControllerMetadataInitializers __otherCasted = (ReplicationControllerMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
