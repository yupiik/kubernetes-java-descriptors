package io.yupiik.kubernetes.bindings.v1_15_8;

import java.util.List;
import java.util.Objects;

public class IngressMetadataInitializers {
    private List<IngressMetadataInitializersPending> pending;
    private IngressMetadataInitializersResult result;

    public IngressMetadataInitializers() {
        // no-op
    }

    public IngressMetadataInitializers(final List<IngressMetadataInitializersPending> pending,
                                       final IngressMetadataInitializersResult result) {
        // no-op
    }

    public List<IngressMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<IngressMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public IngressMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final IngressMetadataInitializersResult result) {
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
        if (!(__other instanceof IngressMetadataInitializers)) {
            return false;
        }
        final IngressMetadataInitializers __otherCasted = (IngressMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
