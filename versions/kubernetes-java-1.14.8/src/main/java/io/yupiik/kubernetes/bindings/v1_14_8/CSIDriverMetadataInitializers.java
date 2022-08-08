package io.yupiik.kubernetes.bindings.v1_14_8;

import java.util.List;
import java.util.Objects;

public class CSIDriverMetadataInitializers {
    private List<CSIDriverMetadataInitializersPending> pending;
    private CSIDriverMetadataInitializersResult result;

    public CSIDriverMetadataInitializers() {
        // no-op
    }

    public CSIDriverMetadataInitializers(final List<CSIDriverMetadataInitializersPending> pending,
                                         final CSIDriverMetadataInitializersResult result) {
        // no-op
    }

    public List<CSIDriverMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<CSIDriverMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public CSIDriverMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final CSIDriverMetadataInitializersResult result) {
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
        if (!(__other instanceof CSIDriverMetadataInitializers)) {
            return false;
        }
        final CSIDriverMetadataInitializers __otherCasted = (CSIDriverMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
