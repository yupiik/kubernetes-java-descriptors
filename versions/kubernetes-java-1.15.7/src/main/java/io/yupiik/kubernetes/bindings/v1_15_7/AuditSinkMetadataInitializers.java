package io.yupiik.kubernetes.bindings.v1_15_7;

import java.util.List;
import java.util.Objects;

public class AuditSinkMetadataInitializers {
    private List<AuditSinkMetadataInitializersPending> pending;
    private AuditSinkMetadataInitializersResult result;

    public AuditSinkMetadataInitializers() {
        // no-op
    }

    public AuditSinkMetadataInitializers(final List<AuditSinkMetadataInitializersPending> pending,
                                         final AuditSinkMetadataInitializersResult result) {
        // no-op
    }

    public List<AuditSinkMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<AuditSinkMetadataInitializersPending> pending) {
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
