package io.yupiik.kubernetes.bindings.v1_14_8;

import java.util.List;
import java.util.Objects;

public class EndpointsMetadataInitializers {
    private List<EndpointsMetadataInitializersPending> pending;
    private EndpointsMetadataInitializersResult result;

    public EndpointsMetadataInitializers() {
        // no-op
    }

    public EndpointsMetadataInitializers(final List<EndpointsMetadataInitializersPending> pending,
                                         final EndpointsMetadataInitializersResult result) {
        // no-op
    }

    public List<EndpointsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<EndpointsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public EndpointsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final EndpointsMetadataInitializersResult result) {
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
        if (!(__other instanceof EndpointsMetadataInitializers)) {
            return false;
        }
        final EndpointsMetadataInitializers __otherCasted = (EndpointsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
