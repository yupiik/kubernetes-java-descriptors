package io.yupiik.kubernetes.bindings.v1_15_12.v1beta1;

import java.util.List;
import java.util.Objects;

public class CSINodeMetadataInitializers {
    private List<CSINodeMetadataInitializersPending> pending;
    private CSINodeMetadataInitializersResult result;

    public CSINodeMetadataInitializers() {
        // no-op
    }

    public CSINodeMetadataInitializers(final List<CSINodeMetadataInitializersPending> pending,
                                       final CSINodeMetadataInitializersResult result) {
        // no-op
    }

    public List<CSINodeMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<CSINodeMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public CSINodeMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final CSINodeMetadataInitializersResult result) {
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
        if (!(__other instanceof CSINodeMetadataInitializers)) {
            return false;
        }
        final CSINodeMetadataInitializers __otherCasted = (CSINodeMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
