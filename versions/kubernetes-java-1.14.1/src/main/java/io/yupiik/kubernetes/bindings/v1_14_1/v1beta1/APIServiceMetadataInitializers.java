package io.yupiik.kubernetes.bindings.v1_14_1.v1beta1;

import java.util.List;
import java.util.Objects;

public class APIServiceMetadataInitializers {
    private List<APIServiceMetadataInitializersPending> pending;
    private APIServiceMetadataInitializersResult result;

    public APIServiceMetadataInitializers() {
        // no-op
    }

    public APIServiceMetadataInitializers(final List<APIServiceMetadataInitializersPending> pending,
                                          final APIServiceMetadataInitializersResult result) {
        // no-op
    }

    public List<APIServiceMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<APIServiceMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public APIServiceMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final APIServiceMetadataInitializersResult result) {
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
        if (!(__other instanceof APIServiceMetadataInitializers)) {
            return false;
        }
        final APIServiceMetadataInitializers __otherCasted = (APIServiceMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
