package io.yupiik.kubernetes.bindings.v1_15_4;

import java.util.List;
import java.util.Objects;

public class APIServiceListItemsMetadataInitializers {
    private List<APIServiceListItemsMetadataInitializersPending> pending;
    private APIServiceListItemsMetadataInitializersResult result;

    public APIServiceListItemsMetadataInitializers() {
        // no-op
    }

    public APIServiceListItemsMetadataInitializers(final List<APIServiceListItemsMetadataInitializersPending> pending,
                                                   final APIServiceListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<APIServiceListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<APIServiceListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public APIServiceListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final APIServiceListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof APIServiceListItemsMetadataInitializers)) {
            return false;
        }
        final APIServiceListItemsMetadataInitializers __otherCasted = (APIServiceListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
