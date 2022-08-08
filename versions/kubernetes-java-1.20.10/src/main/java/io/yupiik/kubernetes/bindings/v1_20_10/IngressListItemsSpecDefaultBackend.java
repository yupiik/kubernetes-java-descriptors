package io.yupiik.kubernetes.bindings.v1_20_10;

import java.util.Objects;

public class IngressListItemsSpecDefaultBackend {
    private IngressListItemsSpecDefaultBackendResource resource;
    private IngressListItemsSpecDefaultBackendService service;

    public IngressListItemsSpecDefaultBackend() {
        // no-op
    }

    public IngressListItemsSpecDefaultBackend(final IngressListItemsSpecDefaultBackendResource resource,
                                              final IngressListItemsSpecDefaultBackendService service) {
        // no-op
    }

    public IngressListItemsSpecDefaultBackendResource getResource() {
        return resource;
    }

    public void setResource(final IngressListItemsSpecDefaultBackendResource resource) {
        this.resource = resource;
    }

    public IngressListItemsSpecDefaultBackendService getService() {
        return service;
    }

    public void setService(final IngressListItemsSpecDefaultBackendService service) {
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
        if (!(__other instanceof IngressListItemsSpecDefaultBackend)) {
            return false;
        }
        final IngressListItemsSpecDefaultBackend __otherCasted = (IngressListItemsSpecDefaultBackend) __other;
        return Objects.equals(resource, __otherCasted.resource) &&
            Objects.equals(service, __otherCasted.service);
    }
}
