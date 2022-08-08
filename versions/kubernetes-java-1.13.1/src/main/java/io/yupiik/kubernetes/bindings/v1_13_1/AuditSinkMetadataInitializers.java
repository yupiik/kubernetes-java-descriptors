package io.yupiik.kubernetes.bindings.v1_13_1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class AuditSinkMetadataInitializers {
    private List<JsonValue> pending;
    private AuditSinkMetadataInitializersResult result;

    public AuditSinkMetadataInitializers() {
        // no-op
    }

    public AuditSinkMetadataInitializers(final List<JsonValue> pending,
                                         final AuditSinkMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public AuditSinkMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final AuditSinkMetadataInitializersResult result) {
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
        if (!(__other instanceof AuditSinkMetadataInitializers)) {
            return false;
        }
        final AuditSinkMetadataInitializers __otherCasted = (AuditSinkMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
