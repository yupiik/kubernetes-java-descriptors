package io.yupiik.kubernetes.bindings.v1_14_8.v1;

import java.util.List;
import java.util.Objects;

public class ServiceAccountListItemsMetadataInitializers {
    private List<ServiceAccountListItemsMetadataInitializersPending> pending;
    private ServiceAccountListItemsMetadataInitializersResult result;

    public ServiceAccountListItemsMetadataInitializers() {
        // no-op
    }

    public ServiceAccountListItemsMetadataInitializers(final List<ServiceAccountListItemsMetadataInitializersPending> pending,
                                                       final ServiceAccountListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<ServiceAccountListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<ServiceAccountListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public ServiceAccountListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ServiceAccountListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof ServiceAccountListItemsMetadataInitializers)) {
            return false;
        }
        final ServiceAccountListItemsMetadataInitializers __otherCasted = (ServiceAccountListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
