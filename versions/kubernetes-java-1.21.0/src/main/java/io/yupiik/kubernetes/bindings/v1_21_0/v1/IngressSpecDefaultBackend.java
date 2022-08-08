package io.yupiik.kubernetes.bindings.v1_21_0.v1;

import java.util.Objects;

public class IngressSpecDefaultBackend {
    private IngressSpecDefaultBackendResource resource;
    private IngressSpecDefaultBackendService service;

    public IngressSpecDefaultBackend() {
        // no-op
    }

    public IngressSpecDefaultBackend(final IngressSpecDefaultBackendResource resource,
                                     final IngressSpecDefaultBackendService service) {
        // no-op
    }

    public IngressSpecDefaultBackendResource getResource() {
        return resource;
    }

    public void setResource(final IngressSpecDefaultBackendResource resource) {
        this.resource = resource;
    }

    public IngressSpecDefaultBackendService getService() {
        return service;
    }

    public void setService(final IngressSpecDefaultBackendService service) {
        this.service = service;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                resource,
                service);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof IngressSpecDefaultBackend)) {
            return false;
        }
        final IngressSpecDefaultBackend __otherCasted = (IngressSpecDefaultBackend) __other;
        return Objects.equals(resource, __otherCasted.resource) &&
            Objects.equals(service, __otherCasted.service);
    }
}
