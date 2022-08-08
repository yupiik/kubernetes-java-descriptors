package io.yupiik.kubernetes.bindings.v1_15_7.v1;

import java.util.List;
import java.util.Objects;

public class ResourceQuotaMetadataInitializers {
    private List<ResourceQuotaMetadataInitializersPending> pending;
    private ResourceQuotaMetadataInitializersResult result;

    public ResourceQuotaMetadataInitializers() {
        // no-op
    }

    public ResourceQuotaMetadataInitializers(final List<ResourceQuotaMetadataInitializersPending> pending,
                                             final ResourceQuotaMetadataInitializersResult result) {
        // no-op
    }

    public List<ResourceQuotaMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<ResourceQuotaMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public ResourceQuotaMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ResourceQuotaMetadataInitializersResult result) {
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
        if (!(__other instanceof ResourceQuotaMetadataInitializers)) {
            return false;
        }
        final ResourceQuotaMetadataInitializers __otherCasted = (ResourceQuotaMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
