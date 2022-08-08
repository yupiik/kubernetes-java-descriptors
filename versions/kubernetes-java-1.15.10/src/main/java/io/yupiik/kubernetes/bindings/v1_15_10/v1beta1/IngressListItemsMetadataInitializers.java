package io.yupiik.kubernetes.bindings.v1_15_10.v1beta1;

import java.util.List;
import java.util.Objects;

public class IngressListItemsMetadataInitializers {
    private List<IngressListItemsMetadataInitializersPending> pending;
    private IngressListItemsMetadataInitializersResult result;

    public IngressListItemsMetadataInitializers() {
        // no-op
    }

    public IngressListItemsMetadataInitializers(final List<IngressListItemsMetadataInitializersPending> pending,
                                                final IngressListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<IngressListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<IngressListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public IngressListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final IngressListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof IngressListItemsMetadataInitializers)) {
            return false;
        }
        final IngressListItemsMetadataInitializers __otherCasted = (IngressListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
