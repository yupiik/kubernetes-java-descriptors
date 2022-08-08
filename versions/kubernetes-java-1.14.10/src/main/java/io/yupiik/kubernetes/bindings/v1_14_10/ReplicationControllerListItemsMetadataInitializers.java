package io.yupiik.kubernetes.bindings.v1_14_10;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerListItemsMetadataInitializers {
    private List<ReplicationControllerListItemsMetadataInitializersPending> pending;
    private ReplicationControllerListItemsMetadataInitializersResult result;

    public ReplicationControllerListItemsMetadataInitializers() {
        // no-op
    }

    public ReplicationControllerListItemsMetadataInitializers(final List<ReplicationControllerListItemsMetadataInitializersPending> pending,
                                                              final ReplicationControllerListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<ReplicationControllerListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<ReplicationControllerListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public ReplicationControllerListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ReplicationControllerListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof ReplicationControllerListItemsMetadataInitializers)) {
            return false;
        }
        final ReplicationControllerListItemsMetadataInitializers __otherCasted = (ReplicationControllerListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
