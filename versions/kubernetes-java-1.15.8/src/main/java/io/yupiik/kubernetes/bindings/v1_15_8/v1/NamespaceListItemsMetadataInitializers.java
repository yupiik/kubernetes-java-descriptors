package io.yupiik.kubernetes.bindings.v1_15_8.v1;

import java.util.List;
import java.util.Objects;

public class NamespaceListItemsMetadataInitializers {
    private List<NamespaceListItemsMetadataInitializersPending> pending;
    private NamespaceListItemsMetadataInitializersResult result;

    public NamespaceListItemsMetadataInitializers() {
        // no-op
    }

    public NamespaceListItemsMetadataInitializers(final List<NamespaceListItemsMetadataInitializersPending> pending,
                                                  final NamespaceListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<NamespaceListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<NamespaceListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public NamespaceListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final NamespaceListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof NamespaceListItemsMetadataInitializers)) {
            return false;
        }
        final NamespaceListItemsMetadataInitializers __otherCasted = (NamespaceListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
