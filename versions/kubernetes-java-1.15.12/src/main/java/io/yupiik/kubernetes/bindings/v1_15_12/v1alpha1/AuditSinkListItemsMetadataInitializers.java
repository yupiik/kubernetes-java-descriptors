package io.yupiik.kubernetes.bindings.v1_15_12.v1alpha1;

import java.util.List;
import java.util.Objects;

public class AuditSinkListItemsMetadataInitializers {
    private List<AuditSinkListItemsMetadataInitializersPending> pending;
    private AuditSinkListItemsMetadataInitializersResult result;

    public AuditSinkListItemsMetadataInitializers() {
        // no-op
    }

    public AuditSinkListItemsMetadataInitializers(final List<AuditSinkListItemsMetadataInitializersPending> pending,
                                                  final AuditSinkListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<AuditSinkListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<AuditSinkListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public AuditSinkListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final AuditSinkListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof AuditSinkListItemsMetadataInitializers)) {
            return false;
        }
        final AuditSinkListItemsMetadataInitializers __otherCasted = (AuditSinkListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
