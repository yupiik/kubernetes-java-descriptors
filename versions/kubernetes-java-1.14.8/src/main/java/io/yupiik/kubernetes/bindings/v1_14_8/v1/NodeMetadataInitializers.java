package io.yupiik.kubernetes.bindings.v1_14_8.v1;

import java.util.List;
import java.util.Objects;

public class NodeMetadataInitializers {
    private List<NodeMetadataInitializersPending> pending;
    private NodeMetadataInitializersResult result;

    public NodeMetadataInitializers() {
        // no-op
    }

    public NodeMetadataInitializers(final List<NodeMetadataInitializersPending> pending,
                                    final NodeMetadataInitializersResult result) {
        // no-op
    }

    public List<NodeMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<NodeMetadataInitializersPending> pending) {
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
