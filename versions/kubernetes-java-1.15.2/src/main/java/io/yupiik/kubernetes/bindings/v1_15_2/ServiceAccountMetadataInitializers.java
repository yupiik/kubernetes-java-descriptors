package io.yupiik.kubernetes.bindings.v1_15_2;

import java.util.List;
import java.util.Objects;

public class ServiceAccountMetadataInitializers {
    private List<ServiceAccountMetadataInitializersPending> pending;
    private ServiceAccountMetadataInitializersResult result;

    public ServiceAccountMetadataInitializers() {
        // no-op
    }

    public ServiceAccountMetadataInitializers(final List<ServiceAccountMetadataInitializersPending> pending,
                                              final ServiceAccountMetadataInitializersResult result) {
        // no-op
    }

    public List<ServiceAccountMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<ServiceAccountMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public ServiceAccountMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ServiceAccountMetadataInitializersResult result) {
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
        if (!(__other instanceof ServiceAccountMetadataInitializers)) {
            return false;
        }
        final ServiceAccountMetadataInitializers __otherCasted = (ServiceAccountMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
