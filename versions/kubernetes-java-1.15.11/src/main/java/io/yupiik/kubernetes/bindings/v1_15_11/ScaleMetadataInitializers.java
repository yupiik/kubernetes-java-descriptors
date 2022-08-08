package io.yupiik.kubernetes.bindings.v1_15_11;

import java.util.List;
import java.util.Objects;

public class ScaleMetadataInitializers {
    private List<ScaleMetadataInitializersPending> pending;
    private ScaleMetadataInitializersResult result;

    public ScaleMetadataInitializers() {
        // no-op
    }

    public ScaleMetadataInitializers(final List<ScaleMetadataInitializersPending> pending,
                                     final ScaleMetadataInitializersResult result) {
        // no-op
    }

    public List<ScaleMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<ScaleMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public ScaleMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ScaleMetadataInitializersResult result) {
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
        if (!(__other instanceof ScaleMetadataInitializers)) {
            return false;
        }
        final ScaleMetadataInitializers __otherCasted = (ScaleMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
