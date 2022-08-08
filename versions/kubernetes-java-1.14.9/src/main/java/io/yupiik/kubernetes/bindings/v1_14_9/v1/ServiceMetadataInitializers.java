package io.yupiik.kubernetes.bindings.v1_14_9.v1;

import java.util.List;
import java.util.Objects;

public class ServiceMetadataInitializers {
    private List<ServiceMetadataInitializersPending> pending;
    private ServiceMetadataInitializersResult result;

    public ServiceMetadataInitializers() {
        // no-op
    }

    public ServiceMetadataInitializers(final List<ServiceMetadataInitializersPending> pending,
                                       final ServiceMetadataInitializersResult result) {
        // no-op
    }

    public List<ServiceMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<ServiceMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public ServiceMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ServiceMetadataInitializersResult result) {
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
        if (!(__other instanceof ServiceMetadataInitializers)) {
            return false;
        }
        final ServiceMetadataInitializers __otherCasted = (ServiceMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
