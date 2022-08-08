package io.yupiik.kubernetes.bindings.v1_14_5.v1;

import java.util.List;
import java.util.Objects;

public class EndpointsListItemsMetadataInitializers {
    private List<EndpointsListItemsMetadataInitializersPending> pending;
    private EndpointsListItemsMetadataInitializersResult result;

    public EndpointsListItemsMetadataInitializers() {
        // no-op
    }

    public EndpointsListItemsMetadataInitializers(final List<EndpointsListItemsMetadataInitializersPending> pending,
                                                  final EndpointsListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<EndpointsListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<EndpointsListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public EndpointsListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final EndpointsListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof EndpointsListItemsMetadataInitializers)) {
            return false;
        }
        final EndpointsListItemsMetadataInitializers __otherCasted = (EndpointsListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
