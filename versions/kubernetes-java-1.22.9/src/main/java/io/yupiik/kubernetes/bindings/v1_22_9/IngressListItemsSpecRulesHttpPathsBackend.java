package io.yupiik.kubernetes.bindings.v1_22_9;

import java.util.Objects;

public class IngressListItemsSpecRulesHttpPathsBackend {
    private IngressListItemsSpecRulesHttpPathsBackendResource resource;
    private IngressListItemsSpecRulesHttpPathsBackendService service;

    public IngressListItemsSpecRulesHttpPathsBackend() {
        // no-op
    }

    public IngressListItemsSpecRulesHttpPathsBackend(final IngressListItemsSpecRulesHttpPathsBackendResource resource,
                                                     final IngressListItemsSpecRulesHttpPathsBackendService service) {
        // no-op
    }

    public IngressListItemsSpecRulesHttpPathsBackendResource getResource() {
        return resource;
    }

    public void setResource(final IngressListItemsSpecRulesHttpPathsBackendResource resource) {
        this.resource = resource;
    }

    public IngressListItemsSpecRulesHttpPathsBackendService getService() {
        return service;
    }

    public void setService(final IngressListItemsSpecRulesHttpPathsBackendService service) {
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
        if (!(__other instanceof IngressListItemsSpecRulesHttpPathsBackend)) {
            return false;
        }
        final IngressListItemsSpecRulesHttpPathsBackend __otherCasted = (IngressListItemsSpecRulesHttpPathsBackend) __other;
        return Objects.equals(resource, __otherCasted.resource) &&
            Objects.equals(service, __otherCasted.service);
    }
}
