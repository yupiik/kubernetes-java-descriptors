package io.yupiik.kubernetes.bindings.v1_15_12.v1;

import java.util.List;
import java.util.Objects;

public class NodeListItemsMetadataInitializers {
    private List<NodeListItemsMetadataInitializersPending> pending;
    private NodeListItemsMetadataInitializersResult result;

    public NodeListItemsMetadataInitializers() {
        // no-op
    }

    public NodeListItemsMetadataInitializers(final List<NodeListItemsMetadataInitializersPending> pending,
                                             final NodeListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<NodeListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<NodeListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public NodeListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final NodeListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof NodeListItemsMetadataInitializers)) {
            return false;
        }
        final NodeListItemsMetadataInitializers __otherCasted = (NodeListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
