package io.yupiik.kubernetes.bindings.v1_14_6;

import java.util.List;
import java.util.Objects;

public class ServiceListItemsMetadataInitializers {
    private List<ServiceListItemsMetadataInitializersPending> pending;
    private ServiceListItemsMetadataInitializersResult result;

    public ServiceListItemsMetadataInitializers() {
        // no-op
    }

    public ServiceListItemsMetadataInitializers(final List<ServiceListItemsMetadataInitializersPending> pending,
                                                final ServiceListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<ServiceListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<ServiceListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public ServiceListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ServiceListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof ServiceListItemsMetadataInitializers)) {
            return false;
        }
        final ServiceListItemsMetadataInitializers __otherCasted = (ServiceListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
