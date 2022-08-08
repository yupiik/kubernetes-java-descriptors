package io.yupiik.kubernetes.bindings.v1_15_10;

import java.util.List;
import java.util.Objects;

public class CSIDriverListItemsMetadataInitializers {
    private List<CSIDriverListItemsMetadataInitializersPending> pending;
    private CSIDriverListItemsMetadataInitializersResult result;

    public CSIDriverListItemsMetadataInitializers() {
        // no-op
    }

    public CSIDriverListItemsMetadataInitializers(final List<CSIDriverListItemsMetadataInitializersPending> pending,
                                                  final CSIDriverListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<CSIDriverListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<CSIDriverListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public CSIDriverListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final CSIDriverListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof CSIDriverListItemsMetadataInitializers)) {
            return false;
        }
        final CSIDriverListItemsMetadataInitializers __otherCasted = (CSIDriverListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
