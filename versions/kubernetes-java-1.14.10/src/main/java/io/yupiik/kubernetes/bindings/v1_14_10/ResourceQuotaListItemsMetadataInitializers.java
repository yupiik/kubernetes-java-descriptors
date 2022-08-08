package io.yupiik.kubernetes.bindings.v1_14_10;

import java.util.List;
import java.util.Objects;

public class ResourceQuotaListItemsMetadataInitializers {
    private List<ResourceQuotaListItemsMetadataInitializersPending> pending;
    private ResourceQuotaListItemsMetadataInitializersResult result;

    public ResourceQuotaListItemsMetadataInitializers() {
        // no-op
    }

    public ResourceQuotaListItemsMetadataInitializers(final List<ResourceQuotaListItemsMetadataInitializersPending> pending,
                                                      final ResourceQuotaListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<ResourceQuotaListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<ResourceQuotaListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public ResourceQuotaListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ResourceQuotaListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof ResourceQuotaListItemsMetadataInitializers)) {
            return false;
        }
        final ResourceQuotaListItemsMetadataInitializers __otherCasted = (ResourceQuotaListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
