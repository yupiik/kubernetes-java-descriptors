package io.yupiik.kubernetes.bindings.v1_14_9.v1beta1;

import java.util.List;
import java.util.Objects;

public class CSINodeListItemsMetadataInitializers {
    private List<CSINodeListItemsMetadataInitializersPending> pending;
    private CSINodeListItemsMetadataInitializersResult result;

    public CSINodeListItemsMetadataInitializers() {
        // no-op
    }

    public CSINodeListItemsMetadataInitializers(final List<CSINodeListItemsMetadataInitializersPending> pending,
                                                final CSINodeListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<CSINodeListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<CSINodeListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public CSINodeListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final CSINodeListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof CSINodeListItemsMetadataInitializers)) {
            return false;
        }
        final CSINodeListItemsMetadataInitializers __otherCasted = (CSINodeListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
