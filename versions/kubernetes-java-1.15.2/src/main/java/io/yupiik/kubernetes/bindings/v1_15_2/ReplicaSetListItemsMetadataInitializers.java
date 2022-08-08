package io.yupiik.kubernetes.bindings.v1_15_2;

import java.util.List;
import java.util.Objects;

public class ReplicaSetListItemsMetadataInitializers {
    private List<ReplicaSetListItemsMetadataInitializersPending> pending;
    private ReplicaSetListItemsMetadataInitializersResult result;

    public ReplicaSetListItemsMetadataInitializers() {
        // no-op
    }

    public ReplicaSetListItemsMetadataInitializers(final List<ReplicaSetListItemsMetadataInitializersPending> pending,
                                                   final ReplicaSetListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<ReplicaSetListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<ReplicaSetListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public ReplicaSetListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ReplicaSetListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof ReplicaSetListItemsMetadataInitializers)) {
            return false;
        }
        final ReplicaSetListItemsMetadataInitializers __otherCasted = (ReplicaSetListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
